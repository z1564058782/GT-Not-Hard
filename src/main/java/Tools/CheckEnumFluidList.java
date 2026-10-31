package Tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.SourceInterpreter;
import org.objectweb.asm.tree.analysis.SourceValue;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * GTNH 2.9.0 / Forge 1.7.10 流体常量人工复核工具，兼容 Java 8。
 *
 * <p>
 * 在 ClientProxy.init 中调用 {@link #registerCommand()}，进入世界，切换为 English (US)，
 * 执行 /CheckEnumFluidList。从本 mod jar 的 EnumList/EnumFluidList/*.class 读取字段初始化字节码，
 * 对应源码相对路径 src/main/java/EnumList/EnumFluidList；无需额外打包源码或查找本地源码。
 * 比较当前客户端 FluidRegistry 的所有注册流体，不依赖 NEI，不初始化枚举类，也不修改源码。
 */
@SideOnly(Side.CLIENT)
public final class CheckEnumFluidList extends CommandBase {

    private static final String SOURCE_PATH = "src/main/java/EnumList/EnumFluidList";
    private static final String CLASS_PATH = "EnumList/EnumFluidList/";
    private static final String FLUID_STACK = "Lnet/minecraftforge/fluids/FluidStack;";
    private static final String FLUID_REGISTRY = "net/minecraftforge/fluids/FluidRegistry";
    private static final String GET_FLUID_STACK = "(Ljava/lang/String;I)" + FLUID_STACK;
    private static final Pattern FORMATTING = Pattern.compile("\u00a7.");
    private static final Pattern NUMBER_PREFIX = Pattern.compile("^([0-9][0-9_]*)([A-Za-z].*)$");
    private static final List<String> JAVA_KEYWORDS = Arrays.asList(
        "abstract",
        "assert",
        "boolean",
        "break",
        "byte",
        "case",
        "catch",
        "char",
        "class",
        "const",
        "continue",
        "default",
        "do",
        "double",
        "else",
        "enum",
        "extends",
        "final",
        "finally",
        "float",
        "for",
        "goto",
        "if",
        "implements",
        "import",
        "instanceof",
        "int",
        "interface",
        "long",
        "native",
        "new",
        "package",
        "private",
        "protected",
        "public",
        "return",
        "short",
        "static",
        "strictfp",
        "super",
        "switch",
        "synchronized",
        "this",
        "throw",
        "throws",
        "transient",
        "try",
        "void",
        "volatile",
        "while",
        "true",
        "false",
        "null");
    private static final AtomicBoolean RUNNING = new AtomicBoolean();
    private static final ConcurrentLinkedQueue<Runnable> COMPLETIONS = new ConcurrentLinkedQueue<>();
    private static boolean registered;

    private CheckEnumFluidList() {}

    /** 仅从客户端初始化入口注册，不要在 CommonProxy 或专用服务器注册。 */
    public static synchronized void registerCommand() {
        if (!registered) {
            CheckEnumFluidList command = new CheckEnumFluidList();
            ClientCommandHandler.instance.registerCommand(command);
            FMLCommonHandler.instance()
                .bus()
                .register(command);
            registered = true;
        }
    }

    @Override
    public String getCommandName() {
        return "CheckEnumFluidList";
    }

    @Override
    public List<String> getCommandAliases() {
        return Collections.singletonList("checkenumfluidlist");
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/CheckEnumFluidList [--output \"报告目录\"]";
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public void processCommand(final ICommandSender sender, String[] args) throws CommandException {
        final Minecraft client = Minecraft.getMinecraft();
        if (!"en_US".equals(client.gameSettings.language)) {
            throw new CommandException("请先将游戏语言切换为 English (US)，以便按英文流体名称校对变量名。");
        }
        final Map<String, String> options = options(args);
        if (!RUNNING.compareAndSet(false, true)) {
            throw new CommandException("流体校验正在进行，请等待上一份报告完成。");
        }
        try {
            final File outputDir = options.containsKey("--output") ? resolve(client.mcDataDir, options.get("--output"))
                : new File(client.mcDataDir, "check_enum_fluid_list");
            // 流体对象及本地化只能在客户端线程访问；后台仅使用字符串快照。
            final Catalog catalog = Catalog.capture();
            if (catalog.fluids.isEmpty()) throw new IOException("运行时流体注册表为空，请进入世界后重试。");
            tell(sender, "正在读取本 mod jar 的流体枚举，与全部已注册流体校验；完成后将显示报告路径。");
            Thread worker = new Thread(() -> {
                try {
                    final File report = check(modContainer(), outputDir, catalog);
                    complete(sender, "校验完成，报告：" + report.getAbsolutePath());
                } catch (Exception | LinkageError e) {
                    complete(sender, "校验失败：" + e.toString());
                }
            }, "GTNotHard-CheckEnumFluidList");
            worker.setDaemon(true);
            worker.start();
        } catch (Exception e) {
            RUNNING.set(false);
            throw new CommandException("无法开始流体校验：" + e.toString());
        }
    }

    private static void complete(final ICommandSender sender, final String message) {
        COMPLETIONS.add(() -> {
            try {
                tell(sender, message);
            } finally {
                RUNNING.set(false);
            }
        });
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            Runnable completion;
            while ((completion = COMPLETIONS.poll()) != null) completion.run();
        }
    }

    private static void tell(ICommandSender sender, String message) {
        sender.addChatMessage(new ChatComponentText("[CheckEnumFluidList] " + message));
    }

    private static Map<String, String> options(String[] args) throws CommandException {
        // Forge 已按空格拆参，这里重新组合以支持带空格的 Windows 路径。
        String input = String.join(" ", args)
            .trim();
        Matcher matcher = Pattern.compile("\\s*(?:\"([^\"]*)\"|(\\S+))")
            .matcher(input);
        List<String> tokens = new ArrayList<>();
        int end = 0;
        while (matcher.find()) {
            if (matcher.start() != end || matcher.group(2) != null && matcher.group(2)
                .contains("\"")) {
                throw new CommandException("路径引号不匹配。");
            }
            tokens.add(matcher.group(1) == null ? matcher.group(2) : matcher.group(1));
            end = matcher.end();
        }
        if (end != input.length()) throw new CommandException("路径引号不匹配。");
        Map<String, String> result = new HashMap<>();
        for (int i = 0; i < tokens.size(); i += 2) {
            String key = tokens.get(i);
            if (key.equals("--source")) {
                throw new CommandException("当前版本直接校验本 mod jar 的 EnumList/EnumFluidList，无需 --source 或本地源码。");
            }
            if (!key.equals("--output") || i + 1 >= tokens.size()
                || tokens.get(i + 1)
                    .isEmpty()
                || tokens.get(i + 1)
                    .startsWith("--")
                || result.containsKey(key)) {
                throw new CommandException("用法：/CheckEnumFluidList [--output \"报告目录\"]");
            }
            result.put(key, tokens.get(i + 1));
        }
        return result;
    }

    private static File resolve(File gameDir, String path) {
        File file = new File(path);
        return file.isAbsolute() ? file : new File(gameDir, path);
    }

    /** 只定位承载本工具的 mod jar；开发环境只读取其 class 输出目录，不检索外部源码。 */
    private static File modContainer() throws IOException {
        URL location = null;
        if (CheckEnumFluidList.class.getProtectionDomain()
            .getCodeSource() != null) {
            location = CheckEnumFluidList.class.getProtectionDomain()
                .getCodeSource()
                .getLocation();
        }
        IOException sourceFailure = null;
        if (location != null) {
            try {
                return containerFromUrl(location);
            } catch (IOException e) {
                sourceFailure = e;
            }
        }
        // LaunchWrapper/lwjgl3ify 可能将 CodeSource 设为 jar 内的 class URL。
        // 即使 CodeSource 非空但不可解析，也允许使用本 class 的资源 URL。
        URL resource = CheckEnumFluidList.class.getResource("CheckEnumFluidList.class");
        if (resource != null) {
            try {
                return containerFromUrl(resource);
            } catch (IOException e) {
                if (sourceFailure != null) e.addSuppressed(sourceFailure);
                throw e;
            }
        }
        throw new IOException("无法定位本工具所属的 mod jar；CodeSource=" + location + "，class 资源=" + resource, sourceFailure);
    }

    private static File containerFromUrl(URL location) throws IOException {
        URL original = location;
        // 必须先处理 jar:，不能只在 CodeSource 为空时才处理资源地址。
        // getJarFileURL 只解析外层 URL，不打开/缓存 jar，也不会加载枚举类。
        while ("jar".equals(location.getProtocol())) {
            location = ((JarURLConnection) location.openConnection()).getJarFileURL();
        }
        if (!"file".equals(location.getProtocol())) {
            throw new IOException("无法定位本工具所属的 mod jar：" + original);
        }
        try {
            // 一些类加载器生成的 URL 未编码空格；URI 保留 %20/%23/%25 等现有编码，且不把 + 当空格。
            File container = new File(
                new URL(
                    location.toExternalForm()
                        .replace(" ", "%20")).toURI());
            String classEntry = CheckEnumFluidList.class.getName()
                .replace('.', '/') + ".class";
            if (container.getPath()
                .replace('\\', '/')
                .endsWith("/" + classEntry)) {
                for (String ignored : classEntry.split("/")) container = container.getParentFile();
            }
            if (container == null || !(container.isFile() || container.isDirectory())) {
                throw new IOException("mod jar/class 输出位置不存在：" + original);
            }
            return container;
        } catch (URISyntaxException | IllegalArgumentException e) {
            throw new IOException("mod jar URL 无效：" + original, e);
        }
    }

    private static File check(File container, File outputDir, Catalog catalog) throws IOException {
        List<EnumClass> sources = classes(container);
        if (sources.isEmpty()) {
            throw new IOException("本 mod 包中没有 " + CLASS_PATH + "*.class；请将工具编译进含流体枚举的 GT-Not-Hard jar。");
        }
        Files.createDirectories(outputDir.toPath());
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS").format(new Date());
        Path report = Files.createTempFile(outputDir.toPath(), timestamp + "_", ".txt");
        try (BufferedWriter writer = Files.newBufferedWriter(report, StandardCharsets.UTF_8)) {
            writer.write("GTNH 2.9.0 EnumFluidList 运行时校验\n");
            writer.write("时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z").format(new Date()) + "\n");
            writer.write("来源：本 mod 包 " + container.getName() + "!/" + CLASS_PATH + "*.class\n");
            writer.write("对应源码相对路径：" + SOURCE_PATH + "；直接读取字节码，不检索本地源码或源码快照。\n");
            writer.write("订正前为从字节码重建的等价声明，原始注释/换行不可恢复；行号来自 class 调试信息，\n");
            writer.write("跨行初始化可能定位到调用行；没有行号时标记未知，并提供完整 class/字段位置。\n");
            writer.write("基准：当前客户端 FluidRegistry / en_US。请确认本次运行的是目标 GTNH 2.9.0 实例。\n");
            writer.write("注册名称按原值精确匹配，保留大小写、标点和空格；不使用数字流体 ID，不依赖 NEI。\n");
            writer.write("变量名遵循 Skills/SKILL_Fluid.md；撇号按 Woods 示例去除，其他分隔符合并为下划线，\n");
            writer.write("去除首尾下划线，连续数字前缀整体移至末尾；建议 FluidStack 数量固定为 1。\n");
            writer.write("相似度忽略大小写/分隔符，严格 >80%，按分数降序；候选不证明原注册名存在。\n");
            writer.write("订正后均为人工复核建议；不会执行初始化表达式，不会改写或复制修改枚举源文件。\n");
            writer.write("本地化可能受英文资源包影响；同名流体可能产生字段名冲突，不自动添加模组后缀。\n");
            writer.write("注册流体数：" + catalog.fluids.size() + "；名称快照异常：" + catalog.errors.size() + "\n\n");
            for (String error : catalog.errors) writer.write("[CATALOG_WARNING] " + error + "\n");
            Map<String, Integer> counts = new LinkedHashMap<>();
            int checked = 0;
            int issues = 0;
            for (EnumClass source : sources) {
                if (!source.problem.isEmpty()) {
                    writer.write("\n[CLASS_ERROR] " + source.path + "：" + source.problem + "\n");
                    counts.put("CLASS_ERROR", counts.getOrDefault("CLASS_ERROR", 0) + 1);
                }
                Map<String, List<String>> targetNames = new LinkedHashMap<>();
                for (Declaration declaration : source.declarations) {
                    checked++;
                    String name = declaration.name;
                    String location = source.path + ":"
                        + (declaration.line > 0 ? declaration.line : "未知行号")
                        + " ["
                        + source.className
                        + "."
                        + name
                        + "]";
                    String before = declaration.before();
                    if (!declaration.problem.isEmpty()) {
                        issue(writer, counts, "PARSE_ERROR", location, name, before, declaration.problem, null);
                        addTarget(targetNames, name, location, name);
                        issues++;
                        continue;
                    }
                    String target = name;
                    Definition definition = declaration.definition;
                    Entry exact = catalog.fluids.get(definition.registryName);
                    if (exact == null) {
                        issue(
                            writer,
                            counts,
                            "MISSING",
                            location,
                            name,
                            before,
                            "运行时注册表不存在注册名称 " + quote(definition.registryName) + "。",
                            candidates(catalog, name, definition.registryName, null));
                        issues++;
                    } else if (exact.variableName.isEmpty()) {
                        issue(
                            writer,
                            counts,
                            "UNVERIFIED_NAME",
                            location,
                            name,
                            before,
                            "注册名称存在，但英文名称无法校验：" + exact.problem,
                            null);
                        issues++;
                    } else {
                        target = exact.variableName;
                        boolean nameDiffers = !name.equals(target);
                        boolean amountDiffers = definition.amount != 1;
                        if (nameDiffers || amountDiffers) {
                            List<String> after = new ArrayList<>();
                            after.add(exact.statement());
                            if (nameDiffers) after.addAll(candidates(catalog, name, definition.registryName, exact));
                            issue(
                                writer,
                                counts,
                                nameDiffers ? "NAME_MISMATCH" : "AMOUNT_MISMATCH",
                                location,
                                name,
                                before,
                                "注册名称精确存在；英文名称：" + exact.displayName
                                    + (amountDiffers ? "\n原数量为 " + definition.amount + "，规则要求为 1。" : "")
                                    + "\n第一条建议保留精确注册名称；其余为原字段可能意指的流体候选。",
                                after);
                            issues++;
                        }
                    }
                    addTarget(targetNames, target, location, name);
                }
                for (Map.Entry<String, List<String>> target : targetNames.entrySet()) {
                    if (target.getValue()
                        .size() > 1) {
                        writer.write("\n[NAME_COLLISION] 同一类的建议字段名重复：" + target.getKey() + "\n");
                        for (String location : target.getValue()) writer.write("  " + location + "\n");
                        writer.write("请人工消歧后再修改，避免字段重名。\n");
                        counts.put("NAME_COLLISION", counts.getOrDefault("NAME_COLLISION", 0) + 1);
                    }
                }
            }
            writer.write(
                "\n统计：文件=" + sources
                    .size() + "，声明=" + checked + "，需复核声明=" + issues + "，注册名称/变量名/数量一致=" + (checked - issues) + "\n");
            writer.write("问题分类（字段重名按组计数）：" + counts + "\n");
            if (checked == 0) writer.write("警告：未识别到 public static final FluidStack 字段，不能视为校验通过。\n");
        }
        return report.toFile();
    }

    private static void addTarget(Map<String, List<String>> targets, String target, String location, String name) {
        targets.computeIfAbsent(target, key -> new ArrayList<>())
            .add(location + " #" + name + " -> " + target);
    }

    private static void issue(BufferedWriter writer, Map<String, Integer> counts, String status, String location,
        String name, String before, String reason, List<String> after) throws IOException {
        counts.put(status, counts.getOrDefault(status, 0) + 1);
        writer.write("\n[" + status + "] " + location + " #" + name + "\n" + reason + "\n");
        writer.write("订正前：\n" + before + "\n订正后（建议，人工复核）：\n");
        if (after == null || after.isEmpty()) {
            writer.write("无可确认的订正语句；保留原条目待人工确认。\n");
        } else {
            for (String suggestion : after) writer.write(suggestion + "\n");
        }
    }

    private static List<String> candidates(Catalog catalog, String name, String registryName, Entry exclude) {
        List<Candidate> matches = new ArrayList<>();
        for (Entry entry : catalog.fluids.values()) {
            if (entry == exclude || entry.variableName.isEmpty()) continue;
            double score = Math.max(similarity(name, entry.variableName), similarity(registryName, entry.registryName));
            if (score > 0.8) matches.add(new Candidate(entry, score));
        }
        matches.sort(
            Comparator.comparingDouble((Candidate candidate) -> candidate.score)
                .reversed()
                .thenComparing(candidate -> candidate.entry.registryName));
        List<String> result = new ArrayList<>();
        for (Candidate candidate : matches) {
            result.add(
                String.format(
                    Locale.ROOT,
                    "[候选 %.2f%%] %s // 英文名称：%s",
                    candidate.score * 100,
                    candidate.entry.statement(),
                    candidate.entry.displayName));
        }
        return result;
    }

    private static List<EnumClass> classes(File container) throws IOException {
        List<EnumClass> result = new ArrayList<>();
        if (container.isDirectory()) {
            // IDE/runClient 仅检查本工具同一输出根中的相对 class 包，不向上遍历或查找 Java 文件。
            Path packageDir = container.toPath()
                .resolve(CLASS_PATH);
            if (Files.isDirectory(packageDir)) {
                try (Stream<Path> paths = Files.walk(packageDir)) {
                    for (Path path : paths.filter(
                        p -> Files.isRegularFile(p) && p.toString()
                            .endsWith(".class"))
                        .sorted()
                        .collect(Collectors.toList())) {
                        try (InputStream input = Files.newInputStream(path)) {
                            result.add(
                                readClass(
                                    container.toPath()
                                        .relativize(path)
                                        .toString()
                                        .replace('\\', '/'),
                                    input));
                        }
                    }
                }
            }
        } else {
            try (JarFile jar = new JarFile(container)) {
                Enumeration<JarEntry> entries = jar.entries();
                while (entries.hasMoreElements()) {
                    JarEntry entry = entries.nextElement();
                    if (!entry.isDirectory() && entry.getName()
                        .startsWith(CLASS_PATH)
                        && entry.getName()
                            .endsWith(".class")) {
                        try (InputStream input = jar.getInputStream(entry)) {
                            result.add(readClass(entry.getName(), input));
                        }
                    }
                }
            }
        }
        result.sort(
            Comparator.comparing((EnumClass source) -> source.path)
                .thenComparing(source -> source.className));
        return result;
    }

    /** ASM 只分析字节，不 Class.forName、不读取静态字段、不触发 <clinit>。 */
    private static EnumClass readClass(String entry, InputStream input) {
        EnumClass result = new EnumClass(entry);
        try {
            ClassNode type = new ClassNode(Opcodes.ASM5);
            new ClassReader(input).accept(type, ClassReader.SKIP_FRAMES);
            result.className = type.name.replace('/', '.');
            String relative = type.name.substring(CLASS_PATH.length());
            int slash = relative.lastIndexOf('/');
            String sourceFile = type.sourceFile == null ? relative.substring(slash + 1)
                .replaceFirst("\\$.*$", "") + ".java" : type.sourceFile;
            result.path = SOURCE_PATH + "/" + relative.substring(0, slash + 1) + sourceFile;
            Map<String, Declaration> fields = new LinkedHashMap<>();
            int required = Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL;
            for (FieldNode field : type.fields) {
                if ((field.access & required) == required && FLUID_STACK.equals(field.desc)) {
                    Declaration declaration = new Declaration(field.name);
                    fields.put(field.name, declaration);
                    result.declarations.add(declaration);
                }
            }
            for (MethodNode method : type.methods) {
                if (!"<clinit>".equals(method.name)) continue;
                Frame<SourceValue>[] frames = null;
                String analysisProblem = "";
                try {
                    frames = new Analyzer<SourceValue>(new SourceInterpreter()).analyze(type.name, method);
                } catch (AnalyzerException e) {
                    analysisProblem = "无法分析静态初始化字节码：" + e.getMessage();
                }
                int line = -1;
                for (int i = 0; i < method.instructions.size(); i++) {
                    AbstractInsnNode instruction = method.instructions.get(i);
                    if (instruction instanceof LineNumberNode) line = ((LineNumberNode) instruction).line;
                    if (instruction.getOpcode() != Opcodes.PUTSTATIC) continue;
                    FieldInsnNode assignment = (FieldInsnNode) instruction;
                    Declaration declaration = fields.get(assignment.name);
                    if (!type.name.equals(assignment.owner) || declaration == null
                        || !FLUID_STACK.equals(assignment.desc)) {
                        continue;
                    }
                    declaration.assignments++;
                    declaration.line = line;
                    try {
                        if (frames == null) throw new IllegalArgumentException(analysisProblem);
                        declaration.definition = definition(method, frames, i);
                        declaration.problem = "";
                    } catch (IllegalArgumentException e) {
                        declaration.problem = e.getMessage();
                    }
                }
            }
            for (Declaration declaration : result.declarations) {
                if (declaration.assignments > 1) {
                    declaration.problem = "存在多个静态赋值路径，不能唯一确定原始注册名称；请人工复核。";
                }
            }
        } catch (IOException | RuntimeException e) {
            result.problem = "读取 class 失败：" + e.toString();
        }
        return result;
    }

    private static AbstractInsnNode origin(SourceValue value) {
        if (value == null || value.insns.size() != 1) {
            throw new IllegalArgumentException("初始化值来自多个路径或无法追溯到常量，需人工复核。");
        }
        return value.insns.iterator()
            .next();
    }

    private static Definition definition(MethodNode method, Frame<SourceValue>[] frames, int assignment) {
        Frame<SourceValue> frame = frames[assignment];
        if (frame == null || frame.getStackSize() == 0) throw new IllegalArgumentException("静态赋值不可达或栈为空。");
        AbstractInsnNode value = origin(frame.getStack(frame.getStackSize() - 1));
        if (!(value instanceof MethodInsnNode) || value.getOpcode() != Opcodes.INVOKESTATIC) {
            throw new IllegalArgumentException("字段不是直接由 FluidRegistry.getFluidStack 初始化，需人工复核。");
        }
        MethodInsnNode call = (MethodInsnNode) value;
        if (!FLUID_REGISTRY.equals(call.owner) || !"getFluidStack".equals(call.name)
            || !GET_FLUID_STACK.equals(call.desc)) {
            throw new IllegalArgumentException("不支持的初始化调用：" + call.owner + "." + call.name + call.desc);
        }
        Frame<SourceValue> arguments = frames[method.instructions.indexOf(call)];
        if (arguments == null || arguments.getStackSize() < 2) throw new IllegalArgumentException("调用参数栈无效。");
        AbstractInsnNode name = origin(arguments.getStack(arguments.getStackSize() - 2));
        AbstractInsnNode amount = origin(arguments.getStack(arguments.getStackSize() - 1));
        if (!(name instanceof LdcInsnNode) || !(((LdcInsnNode) name).cst instanceof String)) {
            throw new IllegalArgumentException("流体注册名称不是编译后的字符串常量，需人工复核。");
        }
        int count;
        if (amount.getOpcode() >= Opcodes.ICONST_M1 && amount.getOpcode() <= Opcodes.ICONST_5) {
            count = amount.getOpcode() - Opcodes.ICONST_0;
        } else if (amount.getOpcode() == Opcodes.BIPUSH || amount.getOpcode() == Opcodes.SIPUSH) {
            count = ((IntInsnNode) amount).operand;
        } else if (amount instanceof LdcInsnNode && ((LdcInsnNode) amount).cst instanceof Integer) {
            count = (Integer) ((LdcInsnNode) amount).cst;
        } else {
            throw new IllegalArgumentException("流体数量不是编译后的 int 常量，需人工复核。");
        }
        return new Definition((String) ((LdcInsnNode) name).cst, count);
    }

    private static String quote(String value) {
        StringBuilder result = new StringBuilder("\"");
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '\\':
                    result.append("\\\\");
                    break;
                case '"':
                    result.append("\\\"");
                    break;
                case '\n':
                    result.append("\\n");
                    break;
                case '\r':
                    result.append("\\r");
                    break;
                case '\t':
                    result.append("\\t");
                    break;
                case '\b':
                    result.append("\\b");
                    break;
                case '\f':
                    result.append("\\f");
                    break;
                default:
                    if (c < 32 || c == 127) result.append(String.format(Locale.ROOT, "\\%03o", (int) c));
                    else result.append(c);
            }
        }
        return result.append('"')
            .toString();
    }

    /** 与 SKILL_Fluid 的数字、括号及 Woods 示例，以及本项目 FluidTextToVariable 的转换一致。 */
    private static String variableName(String displayName) {
        String name = FORMATTING.matcher(displayName)
            .replaceAll("")
            .replace("'", "")
            .replace("\u2019", "")
            .replaceAll("[^A-Za-z0-9]+", "_")
            .replaceAll("^_+|_+$", "");
        Matcher prefix = NUMBER_PREFIX.matcher(name);
        if (prefix.matches()) name = prefix.group(2) + "_"
            + prefix.group(1)
                .replaceAll("_+$", "");
        return name.matches("[A-Za-z][A-Za-z0-9_]*") && !JAVA_KEYWORDS.contains(name) ? name : "";
    }

    private static String normalized(String value) {
        return value.replaceAll("[^A-Za-z0-9]", "")
            .toLowerCase(Locale.ROOT);
    }

    private static double similarity(String left, String right) {
        left = normalized(left);
        right = normalized(right);
        if (left.isEmpty() || right.isEmpty()) return 0;
        int[] previous = new int[right.length() + 1];
        for (int j = 0; j <= right.length(); j++) previous[j] = j;
        for (int i = 1; i <= left.length(); i++) {
            int[] current = new int[right.length() + 1];
            current[0] = i;
            for (int j = 1; j <= right.length(); j++) {
                current[j] = Math.min(
                    Math.min(current[j - 1] + 1, previous[j] + 1),
                    previous[j - 1] + (left.charAt(i - 1) == right.charAt(j - 1) ? 0 : 1));
            }
            previous = current;
        }
        return 1.0 - (double) previous[right.length()] / Math.max(left.length(), right.length());
    }

    private static final class Catalog {

        final Map<String, Entry> fluids = new LinkedHashMap<>();
        final List<String> errors = new ArrayList<>();

        static Catalog capture() {
            Catalog catalog = new Catalog();
            Map<String, Fluid> registry = FluidRegistry.getRegisteredFluids();
            List<String> names = new ArrayList<>(registry.keySet());
            Collections.sort(names);
            for (String name : names) {
                String displayName = "";
                String problem = "";
                try {
                    Fluid fluid = registry.get(name);
                    FluidStack stack = new FluidStack(fluid, 1);
                    displayName = fluid.getLocalizedName(stack);
                    if (displayName == null || displayName.trim()
                        .isEmpty()) {
                        problem = "本地化名称为空。";
                    } else if (displayName.equals(fluid.getUnlocalizedName(stack))) {
                        problem = "本地化名称仍为翻译键：" + displayName;
                    } else if (variableName(displayName).isEmpty()) {
                        problem = "名称无法按规则生成合法的 ASCII Java 字段名：" + displayName;
                    }
                } catch (Exception e) {
                    problem = e.toString();
                }
                if (!problem.isEmpty()) catalog.errors.add(quote(name) + "：" + problem);
                // 即使本地化失败，也保留注册名称，不能把它误判为 MISSING。
                catalog.fluids.put(name, new Entry(name, displayName == null ? "" : displayName, problem));
            }
            return catalog;
        }
    }

    private static final class Entry {

        final String registryName;
        final String displayName;
        final String variableName;
        final String problem;

        Entry(String registryName, String displayName, String problem) {
            this.registryName = registryName;
            this.displayName = displayName;
            this.variableName = problem.isEmpty() ? variableName(displayName) : "";
            this.problem = problem;
        }

        String statement() {
            return "public static final FluidStack " + variableName
                + " = FluidRegistry.getFluidStack("
                + quote(registryName)
                + ", 1);";
        }
    }

    private static final class Candidate {

        final Entry entry;
        final double score;

        Candidate(Entry entry, double score) {
            this.entry = entry;
            this.score = score;
        }
    }

    private static final class Definition {

        final String registryName;
        final int amount;

        Definition(String registryName, int amount) {
            this.registryName = registryName;
            this.amount = amount;
        }
    }

    private static final class EnumClass {

        String path;
        String className;
        String problem = "";
        final List<Declaration> declarations = new ArrayList<>();

        EnumClass(String entry) {
            this.path = entry;
            this.className = entry.replace('/', '.')
                .replaceFirst("\\.class$", "");
        }
    }

    private static final class Declaration {

        final String name;
        int line = -1;
        int assignments;
        Definition definition;
        String problem = "未找到可分析的静态初始化赋值，需人工复核。";

        Declaration(String name) {
            this.name = name;
        }

        String before() {
            return "public static final FluidStack " + name
                + " = "
                + (definition == null || !problem.isEmpty() ? "/* 初始化字节码无法唯一还原，参见问题原因 */ ...;"
                    : "FluidRegistry.getFluidStack(" + quote(definition.registryName)
                        + ", "
                        + definition.amount
                        + ");");
        }
    }
}
