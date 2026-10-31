package Tools;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.ClientCommandHandler;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import codechicken.nei.ItemList;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.enums.Mods;

/**
 * GTNH 2.9.0 / Forge 1.7.10 的物品常量人工复核工具（Java 8）。
 *
 * <p>
 * 在 ClientProxy.init 中调用 {@link #registerCommand()}。进入世界，
 * 切换为 English (US)，执行 /CheckEnumItemList All 或 /CheckEnumItemList NEI。
 * 客户端指令可用于单人和联机；核对的是当前客户端实际加载的物品表。
 *
 * <p>
 * 不初始化枚举类、不调用可能返回替代品的 getModItem、不修改源文件。
 * All 遍历完整物品注册表；NEI 仅使用 NEI 已加载的完整列表。
 * All 中未被物品 API 枚举的 meta/NBT 仍检查名称，
 * 但不会仅因能构造 ItemStack 就认定变体有效。
 * 所有建议均输出完整语句，交给开发者二次确认。
 */
@SideOnly(Side.CLIENT)
public final class CheckEnumItemList extends CommandBase {

    private static final String SOURCE_PATH = "src/main/java/EnumList/EnumItemList";
    private static final String CLASS_PATH = "EnumList/EnumItemList/";
    private static final String SOURCE_ARCHIVE = "assets/gtnothard/check_enum_item_list_sources.zip";
    private static final String STACK_DESCRIPTOR = "Lnet/minecraft/item/ItemStack;";
    private static final String USAGE = "/CheckEnumItemList [All|NEI] [--output \"报告目录\"]";
    private static final Pattern DECLARATION = Pattern.compile(
        "\\bpublic\\s+static\\s+final\\s+(?:net\\.minecraft\\.item\\.)?ItemStack\\s+"
            + "(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*)\\s*=");
    private static final Pattern FORMATTING = Pattern.compile("\u00a7.");
    private static final AtomicBoolean RUNNING = new AtomicBoolean();
    private static final ConcurrentLinkedQueue<Runnable> COMPLETIONS = new ConcurrentLinkedQueue<>();
    private SnapshotJob snapshotJob;
    private static boolean registered;

    private CheckEnumItemList() {}

    private enum Mode {

        ALL("All"),
        NEI("NEI");

        final String label;

        Mode(String label) {
            this.label = label;
        }
    }

    /** 延迟到 NEI 模式才链接 NEI 类，All 不检查 NEI 是否加载。 */
    private static final class NeiSource {

        static List<ItemStack> items() throws CommandException {
            try {
                // NEI 原子替换列表；固定完整列表引用，不读取搜索/分页后的面板内容。
                List<ItemStack> items = ItemList.items;
                if (!ItemList.loadFinished || items == null || items.isEmpty()) {
                    throw new CommandException("NEI 物品表尚未加载完成或为空，请打开背包等待加载后重试 NEI 模式。");
                }
                return items;
            } catch (LinkageError e) {
                throw new CommandException("无法读取 NEI 物品表：" + e.toString() + "；可使用 /CheckEnumItemList All。");
            }
        }
    }

    /** 仅在客户端初始化时注册一次，不要放入 CommonProxy 或专用服务器入口。 */
    public static synchronized void registerCommand() {
        if (!registered) {
            CheckEnumItemList command = new CheckEnumItemList();
            ClientCommandHandler.instance.registerCommand(command);
            FMLCommonHandler.instance()
                .bus()
                .register(command);
            registered = true;
        }
    }

    @Override
    public String getCommandName() {
        return "CheckEnumItemList";
    }

    @Override
    public List<String> getCommandAliases() {
        return Collections.singletonList("checkenumitemlist");
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return USAGE;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args) {
        if (args.length == 1) return getListOfStringsMatchingLastWord(args, "All", "NEI", "--output");
        if (args.length == 2 && (args[0].equalsIgnoreCase("All") || args[0].equalsIgnoreCase("NEI"))) {
            return getListOfStringsMatchingLastWord(args, "--output");
        }
        return Collections.emptyList();
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
        if (!"en_US".equals(Minecraft.getMinecraft().gameSettings.language)) {
            throw new CommandException("请先将游戏语言切换为 English (US)，否则无法按英文 Display Name 校对变量名。");
        }
        final Map<String, String> options = options(args);
        final Mode mode = Mode.valueOf(options.get("mode"));
        if (!RUNNING.compareAndSet(false, true)) {
            throw new CommandException("校验正在进行，请等待上一份报告完成。");
        }
        try {
            final List<ItemStack> neiItems = mode == Mode.NEI ? NeiSource.items() : Collections.emptyList();
            final File gameDir = Minecraft.getMinecraft().mcDataDir;
            final File modLocation = modLocation();
            final File outputDir = options.containsKey("--output") ? resolve(gameDir, options.get("--output"))
                : new File(gameDir, "check_enum_item_list");
            tell(sender, "校验来源：当前运行的 GT-Not-Hard / " + modLocation.getName() + "；模式：" + mode.label);
            tell(
                sender,
                "正在后台读取 mod 内枚举，随后按" + (mode == Mode.ALL ? "完整物品注册表（含 NEI 隐藏物品）" : "NEI 已加载完整物品列表") + "校验；不会修改枚举文件。");
            Thread worker = new Thread(() -> {
                try {
                    final List<ParsedSource> sources = prepare(modLocation);
                    COMPLETIONS.add(() -> {
                        try {
                            snapshotJob = new SnapshotJob(sender, modLocation, outputDir, sources, mode, neiItems);
                            tell(
                                sender,
                                mode == Mode.ALL
                                    ? "正在分批读取全部 " + snapshotJob.registryNames.size() + " 个注册物品及枚举指定变体；请保持 English (US)。"
                                    : "正在分批读取 NEI 完整列表中的 " + neiItems.size() + " 个条目；请保持 English (US)。");
                        } catch (Exception | LinkageError e) {
                            fail(sender, e);
                        }
                    });
                } catch (Exception | LinkageError e) {
                    COMPLETIONS.add(() -> fail(sender, e));
                }
            }, "GTNotHard-CheckEnumItemList");
            worker.setDaemon(true);
            worker.start();
        } catch (Exception e) {
            RUNNING.set(false);
            throw new CommandException("无法开始校验：" + e.toString());
        }
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            Runnable completion;
            while ((completion = COMPLETIONS.poll()) != null) {
                completion.run();
            }
            if (snapshotJob != null) {
                SnapshotJob current = snapshotJob;
                try {
                    if (current.step()) snapshotJob = null;
                } catch (Exception | LinkageError e) {
                    snapshotJob = null;
                    fail(current.sender, e);
                }
            }
        }
    }

    private static void fail(ICommandSender sender, Throwable error) {
        RUNNING.set(false);
        tell(sender, "校验失败：" + error.toString());
    }

    /** 只在客户端 tick 调用游戏 API；每批约 10ms，单个 mod 的回调可能超时。 */
    private static final class SnapshotJob {

        final ICommandSender sender;
        final File modLocation;
        final File outputDir;
        final List<ParsedSource> sources;
        final Mode mode;
        final List<ItemStack> neiItems;
        final List<String> registryNames = new ArrayList<>();
        final List<Definition> targets = new ArrayList<>();
        final Catalog catalog;
        int registryIndex;
        int targetIndex;
        int neiIndex;

        SnapshotJob(ICommandSender sender, File modLocation, File outputDir, List<ParsedSource> sources, Mode mode,
            List<ItemStack> neiItems) {
            this.sender = sender;
            this.modLocation = modLocation;
            this.outputDir = outputDir;
            this.sources = sources;
            this.mode = mode;
            this.neiItems = neiItems;
            this.catalog = new Catalog(mode);
            catalog.neiEntries = neiItems.size();
            for (Object name : Item.itemRegistry.getKeys()) registryNames.add(name.toString());
            Collections.sort(registryNames);
            catalog.registeredNames.addAll(registryNames);
            if (registryNames.isEmpty()) throw new IllegalStateException("运行时物品注册表为空。");
            if (mode == Mode.ALL) {
                for (ParsedSource source : sources) {
                    for (Declaration entry : source.declarations) {
                        if (entry.definition != null) targets.add(entry.definition);
                    }
                }
            }
        }

        boolean step() {
            if (!"en_US".equals(Minecraft.getMinecraft().gameSettings.language)) {
                throw new IllegalStateException("快照期间游戏语言发生变化，请切换回 English (US) 后重新执行。");
            }
            long deadline = System.nanoTime() + 10_000_000L;
            if (mode == Mode.ALL) {
                while (registryIndex < registryNames.size()) {
                    catalog.captureRegisteredItem(registryNames.get(registryIndex++));
                    if (System.nanoTime() >= deadline) return false;
                }
                while (targetIndex < targets.size()) {
                    catalog.probe(targets.get(targetIndex++));
                    if (System.nanoTime() >= deadline) return false;
                }
            } else {
                while (neiIndex < neiItems.size()) {
                    catalog.captureNeiItem(neiItems.get(neiIndex), neiIndex);
                    neiIndex++;
                    if (System.nanoTime() >= deadline) return false;
                }
                if (catalog.size == 0) throw new IllegalStateException("NEI 快照所有条目均读取失败，无法生成可靠的比较报告。");
            }
            tell(sender, mode.label + " 快照读取完成，正在后台生成报告。");
            Thread worker = new Thread(() -> {
                try {
                    final File report = check(modLocation, outputDir, catalog, sources);
                    COMPLETIONS.add(() -> {
                        RUNNING.set(false);
                        tell(sender, "校验完成，报告：" + report.getAbsolutePath());
                    });
                } catch (Exception | LinkageError e) {
                    COMPLETIONS.add(() -> fail(sender, e));
                }
            }, "GTNotHard-CheckEnumItemList-Report");
            worker.setDaemon(true);
            worker.start();
            return true;
        }
    }

    private static void tell(ICommandSender sender, String message) {
        sender.addChatMessage(new ChatComponentText("[CheckEnumItemList] " + message));
    }

    private static Map<String, String> options(String[] args) throws CommandException {
        // Forge 1.7.10 已按空格拆过参数，这里重新组合，以支持 Windows 路径中的空格。
        String input = String.join(" ", args)
            .trim();
        List<String> tokens = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\s*(?:\"([^\"]*)\"|(\\S+))")
            .matcher(input);
        int end = 0;
        while (matcher.find()) {
            if (matcher.start() != end || matcher.group(2) != null && matcher.group(2)
                .contains("\"")) {
                throw new CommandException("路径引号不匹配。");
            }
            tokens.add(matcher.group(1) != null ? matcher.group(1) : matcher.group(2));
            end = matcher.end();
        }
        Map<String, String> result = new HashMap<>();
        int start = 0;
        Mode mode = Mode.ALL;
        if (!tokens.isEmpty() && !tokens.get(0)
            .startsWith("--")) {
            String value = tokens.get(0);
            if (value.equalsIgnoreCase("All")) mode = Mode.ALL;
            else if (value.equalsIgnoreCase("NEI")) mode = Mode.NEI;
            else throw new CommandException("未知模式：" + value + "。用法：" + USAGE);
            start = 1;
        }
        result.put("mode", mode.name());
        for (int i = start; i < tokens.size(); i += 2) {
            String key = tokens.get(i);
            if (!key.equals("--output") || i + 1 >= tokens.size()
                || tokens.get(i + 1)
                    .isEmpty()
                || result.containsKey(key)) {
                throw new CommandException("用法：" + USAGE + "；枚举直接读取当前 mod，无需 --source。");
            }
            result.put(key, tokens.get(i + 1));
        }
        return result;
    }

    private static File resolve(File gameDir, String path) {
        File file = new File(path);
        return file.isAbsolute() ? file : new File(gameDir, path);
    }

    /** 只定位正在加载的 mod 容器，不向本地工程目录或父目录搜索。 */
    private static File modLocation() throws IOException {
        ModContainer container = Loader.instance()
            .getIndexedModList()
            .get("gtnothard");
        if (container == null || container.getSource() == null
            || !container.getSource()
                .exists()) {
            throw new IOException("无法取得当前运行的 gtnothard mod 容器。");
        }
        return container.getSource();
    }

    /** 后台只解析独立的字节码、字符串和 NBT，不读取 Item/ItemStack。 */
    private static List<ParsedSource> prepare(File modLocation) throws IOException {
        List<ParsedSource> result = new ArrayList<>();
        for (Source source : sources(modLocation)) {
            ParsedSource parsed = new ParsedSource();
            result.add(parsed);
            String masked = mask(source.text, true);
            Matcher declarations = DECLARATION.matcher(masked);
            while (declarations.find()) {
                String name = declarations.group(1);
                int end = masked.indexOf(';', declarations.end());
                int sourceLine = source.classEntry == null ? line(source.text, declarations.start())
                    : source.lines.getOrDefault(name, -1);
                String location = source.path + (sourceLine > 0 ? ":" + sourceLine : " (未保留行号)")
                    + (source.classEntry == null ? "" : " [jar!/" + source.classEntry + "]");
                if (end < 0) {
                    parsed.declarations.add(new Declaration(name, location, "", null, "声明未以分号结束。"));
                    break;
                }
                String before = source.text.substring(declarations.start(), end + 1);
                if (source.classEntry != null) before = "// 从 jar 编译类还原\n" + before;
                Definition definition = null;
                String error = source.problems.get(name);
                if (error == null) {
                    try {
                        definition = definition(mask(source.text.substring(declarations.end(), end), false));
                    } catch (Exception e) {
                        error = "未执行未知 Java 表达式，需人工复核：" + e.toString();
                    }
                }
                parsed.declarations.add(new Declaration(name, location, before, definition, error));
                declarations.region(end + 1, masked.length());
            }
        }
        return result;
    }

    private static File check(File modLocation, File outputDir, Catalog catalog, List<ParsedSource> sources)
        throws IOException {
        Files.createDirectories(outputDir.toPath());
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS").format(new Date());
        Path report = Files.createTempFile(outputDir.toPath(), timestamp + "_" + catalog.mode.label + "_", ".txt");
        try (BufferedWriter writer = Files.newBufferedWriter(report, StandardCharsets.UTF_8)) {
            writer.write("GTNH 2.9.0 EnumItemList 运行时校验\n");
            writer.write("时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z").format(new Date()) + "\n");
            writer.write("来源：当前运行的 mod 容器 " + modLocation.getName() + "\n");
            writer.write("jar 中优先读取 EnumList/EnumItemList/**/*.class，对应源码 " + SOURCE_PATH + "。\n");
            writer.write("编译类的订正前语句由字节码还原，保留字段名/参数/NBT，排版不代表原源码。\n");
            writer.write("行号取初始化字节码的调试信息；无调试信息时以类路径和字段名定位，不猜测行号。\n");
            writer.write("模式：" + catalog.mode.label + "；基准语言：当前客户端 en_US。请确认整合包为 GTNH 2.9.0。\n");
            if (catalog.mode == Mode.ALL) {
                writer.write("基准：完整 Item.itemRegistry；不依赖 NEI 列表、过滤或隐藏状态。\n");
                writer.write("逐个注册物品调用 getSubItems，并探测声明指定的身份。\n");
                writer.write("getSubItems 不是所有合法 metadata/NBT 的穷举。未被枚举的身份仍检查名称，但标为 UNVERIFIED。\n");
                writer.write("能构造/有显示名不证明变体有效；无 NBT 损耗型物品可用 API 声明的损耗范围确认。\n");
            } else {
                writer.write("基准：NEI ItemList.items 已加载的完整列表，包含所有分页，不受搜索框/当前页影响。\n");
                writer.write("不将注册表子项或声明探测结果补入 NEI 基准/候选。注册名集合仅辅助判断是否未注册。\n");
                writer.write("NOT_IN_NEI 表示注册名存在，但 NEI 未收录该完整身份；不代表物品在游戏中不存在。\n");
                writer.write("NEI 条目读取失败时输出 READ_ERROR/CATALOG_WARNING，不将其当作正常的未收录结果。\n");
            }
            writer.write("精确身份 = 注册名 + metadata + 完整 NBT（不含数量）。不使用会话数字 Item ID。\n");
            writer.write("MISSING 只表示注册名不存在；READ_ERROR 表示目标身份读取失败。\n");
            writer.write("候选相似度忽略大小写/分隔符，严格 >80%，降序列出；相似度不证明物品相同。\n");
            writer.write("建议为人工复核用语句；不自动写回、不自动挑选候选；新增 Mods 常量需补充静态导入。\n");
            writer.write("名称按符号合并下划线、去首尾下划线、数字开头的词移至末尾处理。\n");
            writer.write("SKILL_Item 示例三的 Laser Hatch 特例与通则及数字拼写不一致，未据此猜测特殊改名。\n");
            writer.write(
                "注册物品：" + catalog.registeredNames.size()
                    + "；名称快照身份："
                    + catalog.size
                    + "；其中有变体证据："
                    + catalog.verifiedSize
                    + "；快照异常："
                    + catalog.errors.size()
                    + "\n\n");
            if (catalog.mode == Mode.NEI) writer.write("NEI 原始条目（去重前）：" + catalog.neiEntries + "\n\n");
            for (String error : catalog.errors) writer.write("[CATALOG_WARNING] " + error + "\n");
            int checked = 0;
            int issues = 0;
            Map<String, Integer> counts = new LinkedHashMap<>();
            for (ParsedSource source : sources) {
                Map<String, List<String>> targetNames = new LinkedHashMap<>();
                for (Declaration entry : source.declarations) {
                    checked++;
                    String name = entry.name;
                    String location = entry.location;
                    String before = entry.before;
                    if (entry.error != null) {
                        issue(writer, counts, "PARSE_ERROR", location, name, before, entry.error, null);
                        issues++;
                        continue;
                    }
                    Definition definition = entry.definition;
                    if (!catalog.registeredNames.contains(definition.registryName)) {
                        issue(
                            writer,
                            counts,
                            "MISSING",
                            location,
                            name,
                            before,
                            "运行时完整物品注册表中不存在此注册名。\n请求身份：" + definition,
                            candidateStatements(catalog, name, null));
                        issues++;
                        continue;
                    }
                    Variant exact = catalog.exact(definition);
                    if (exact == null) {
                        String error = catalog.probeError(definition);
                        boolean outsideNei = catalog.mode == Mode.NEI && error == null;
                        issue(
                            writer,
                            counts,
                            outsideNei ? "NOT_IN_NEI" : "READ_ERROR",
                            location,
                            name,
                            before,
                            (outsideNei ? "注册名存在，但 NEI 已加载完整列表未收录此 metadata/NBT；可能为隐藏或未展示的变体，不能认定不存在。"
                                : "注册名存在，但目标身份读取失败：" + (error == null ? "快照没有成功读取此身份。" : error)) + "\n请求身份："
                                + definition,
                            candidateStatements(catalog, name, null));
                        issues++;
                        continue;
                    }
                    boolean review = false;
                    String evidence = "请求身份：" + definition
                        + "\n变体依据："
                        + exact.evidence
                        + "\nDisplay Name = "
                        + exact.displayName;
                    if (!exact.verified) {
                        issue(
                            writer,
                            counts,
                            "UNVERIFIED",
                            location,
                            name,
                            before,
                            evidence + "\n已检查此身份的名称，但无法通用确认该 metadata/NBT 的业务有效性，不能据此删除。",
                            exact.variableName.isEmpty() ? null
                                : Collections.singletonList(exact.statement(definition)));
                        review = true;
                    }
                    if (exact.variableName.isEmpty()) {
                        issue(
                            writer,
                            counts,
                            "INVALID_NAME",
                            location,
                            name,
                            before,
                            evidence + "\nDisplay Name 无法生成合法的 ASCII Java 名称。",
                            null);
                        review = true;
                    } else {
                        targetNames.computeIfAbsent(exact.variableName, key -> new ArrayList<>())
                            .add(location + " #" + name);
                        if (!name.equals(exact.variableName)) {
                            List<String> suggestions = new ArrayList<>();
                            suggestions.add(exact.statement(definition));
                            suggestions.addAll(candidateStatements(catalog, name, exact));
                            issue(
                                writer,
                                counts,
                                "NAME_MISMATCH",
                                location,
                                name,
                                before,
                                evidence + "\n第一条按当前身份重命名；其余候选可能对应原字段名代表的预期物品，需人工选择。",
                                suggestions);
                            review = true;
                        }
                    }
                    if (review) issues++;
                }
                for (Map.Entry<String, List<String>> target : targetNames.entrySet()) {
                    if (target.getValue()
                        .size() > 1) {
                        writer.write("\n[NAME_COLLISION] 建议名 " + target.getKey() + " 在同一文件中重复：\n");
                        for (String location : target.getValue()) writer.write("  " + location + "\n");
                        writer.write("请人工命名以免产生重复字段。\n");
                        counts.put("NAME_COLLISION", counts.getOrDefault("NAME_COLLISION", 0) + 1);
                    }
                }
            }
            writer.write(
                "\n统计：文件=" + sources
                    .size() + "，声明=" + checked + "，需复核声明=" + issues + "，有变体证据且名称一致=" + (checked - issues) + "\n");
            writer.write("问题分类（重名按组计数）：" + counts + "\n");
            if (checked == 0) writer.write("警告：没有识别到 public static final ItemStack 声明，不能视为校验通过。\n");
        }
        return report.toFile();
    }

    private static List<String> candidateStatements(Catalog catalog, String name, Variant exclude) {
        List<String> statements = new ArrayList<>();
        for (Candidate candidate : catalog.candidates(name)) {
            if (candidate.variant != exclude) {
                statements.add(
                    String.format(
                        Locale.ROOT,
                        "[候选 %.2f%% / %s] %s // Display Name: %s；依据：%s",
                        candidate.score * 100,
                        candidate.variant.verified ? "有变体证据" : "变体待确认",
                        candidate.variant.statement(),
                        candidate.variant.displayName,
                        candidate.variant.evidence));
            }
        }
        return statements;
    }

    private static void issue(BufferedWriter writer, Map<String, Integer> counts, String status, String location,
        String name, String before, String reason, List<String> after) throws IOException {
        counts.put(status, counts.getOrDefault(status, 0) + 1);
        writer.write("\n[" + status + "] " + location + " #" + name + "\n" + reason + "\n");
        writer.write("订正前：\n" + before + "\n订正后（建议，人工复核）：\n");
        if (after == null || after.isEmpty()) {
            writer.write("无可确认的替代语句；保留原条目待人工确认。\n");
        } else {
            for (String suggestion : after) writer.write(suggestion + "\n");
        }
    }

    private static List<Source> sources(File modLocation) throws IOException {
        Map<String, byte[]> entries = new LinkedHashMap<>();
        if (modLocation.isFile()) {
            try (ZipFile jar = new ZipFile(modLocation)) {
                List<? extends ZipEntry> files = Collections.list(jar.entries());
                Collections.sort(files, Comparator.comparing(ZipEntry::getName));
                for (ZipEntry file : files) {
                    if (!file.isDirectory() && enumEntry(file.getName())) {
                        try (InputStream stream = jar.getInputStream(file)) {
                            entries.put(file.getName(), bytes(stream));
                        }
                    }
                }
            }
        } else if (modLocation.isDirectory()) {
            // IDE 中 FML 容器可能是编译输出目录；只读取该容器内对应路径，不寻找工程源码。
            for (String prefix : Arrays.asList(CLASS_PATH, SOURCE_PATH + "/", SOURCE_ARCHIVE)) {
                Path root = modLocation.toPath()
                    .resolve(prefix);
                if (!Files.exists(root)) continue;
                try (Stream<Path> files = Files.walk(root)) {
                    for (Path file : files.filter(Files::isRegularFile)
                        .sorted()
                        .collect(Collectors.toList())) {
                        String name = modLocation.toPath()
                            .relativize(file)
                            .toString()
                            .replace('\\', '/');
                        if (enumEntry(name)) entries.put(name, Files.readAllBytes(file));
                    }
                }
            }
        } else {
            throw new IOException("当前 mod 容器不可读取：" + modLocation.getName());
        }
        List<Source> compiled = new ArrayList<>();
        for (Map.Entry<String, byte[]> entry : entries.entrySet()) {
            if (entry.getKey()
                .endsWith(".class")) {
                try {
                    Source source = compiledSource(entry.getKey(), entry.getValue());
                    if (source != null) compiled.add(source);
                } catch (RuntimeException e) {
                    throw new IOException("无法读取 jar!/" + entry.getKey() + "：" + e.toString(), e);
                }
            }
        }
        // 运行的编译类是待校验项的依据；不让可选的旧源码快照覆盖实际 jar 中的字段/参数。
        if (!compiled.isEmpty()) return compiled;
        Map<String, Source> raw = new LinkedHashMap<>();
        byte[] archive = entries.get(SOURCE_ARCHIVE);
        if (archive != null) {
            try (ZipInputStream zip = new ZipInputStream(
                new java.io.ByteArrayInputStream(archive),
                StandardCharsets.UTF_8)) {
                ZipEntry entry;
                while ((entry = zip.getNextEntry()) != null) {
                    if (!entry.isDirectory() && entry.getName()
                        .endsWith(".java")) {
                        String path = SOURCE_PATH + "/" + entry.getName();
                        raw.put(path, new Source(path, new String(bytes(zip), StandardCharsets.UTF_8)));
                    }
                }
            }
        }
        for (Map.Entry<String, byte[]> entry : entries.entrySet()) {
            if (entry.getKey()
                .endsWith(".java")) {
                String path = entry.getKey()
                    .startsWith("src/main/java/") ? entry.getKey() : "src/main/java/" + entry.getKey();
                raw.put(path, new Source(path, new String(entry.getValue(), StandardCharsets.UTF_8)));
            }
        }
        if (raw.isEmpty()) throw new IOException(
            "当前 mod 容器中没有 " + CLASS_PATH + " 下的编译类，也没有 " + SOURCE_PATH + " 下的源码；请确认替换的是包含枚举的 GT-Not-Hard jar。");
        return new ArrayList<>(raw.values());
    }

    private static boolean enumEntry(String path) {
        return SOURCE_ARCHIVE.equals(path) || (path.startsWith(CLASS_PATH) || path.startsWith(SOURCE_PATH + "/"))
            && (path.endsWith(".class") || path.endsWith(".java"));
    }

    private static byte[] bytes(InputStream stream) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int count;
        while ((count = stream.read(buffer)) != -1) output.write(buffer, 0, count);
        return output.toByteArray();
    }

    /** 只分析静态初始化指令，不加载/初始化枚举类，也不执行其 getModItem 调用。 */
    private static Source compiledSource(String entry, byte[] bytes) {
        ClassNode type = new ClassNode();
        new ClassReader(bytes).accept(type, ClassReader.SKIP_FRAMES);
        if (!type.name.startsWith(CLASS_PATH)) return null;
        String file = type.sourceFile;
        if (file == null) {
            String simple = type.name.substring(type.name.lastIndexOf('/') + 1)
                .split("\\$")[0];
            file = simple + ".java";
        }
        String path = "src/main/java/" + type.name.substring(0, type.name.lastIndexOf('/') + 1) + file;
        Map<String, List<FieldInsnNode>> assignments = new HashMap<>();
        Set<AbstractInsnNode> branchTargets = new HashSet<>();
        for (Object methodObject : type.methods) {
            MethodNode method = (MethodNode) methodObject;
            if (!"<clinit>".equals(method.name)) continue;
            for (AbstractInsnNode instruction = method.instructions.getFirst(); instruction
                != null; instruction = instruction.getNext()) {
                if (instruction instanceof org.objectweb.asm.tree.JumpInsnNode) {
                    branchTargets.add(((org.objectweb.asm.tree.JumpInsnNode) instruction).label);
                } else if (instruction instanceof org.objectweb.asm.tree.TableSwitchInsnNode) {
                    org.objectweb.asm.tree.TableSwitchInsnNode table = (org.objectweb.asm.tree.TableSwitchInsnNode) instruction;
                    branchTargets.add(table.dflt);
                    branchTargets.addAll(table.labels);
                } else if (instruction instanceof org.objectweb.asm.tree.LookupSwitchInsnNode) {
                    org.objectweb.asm.tree.LookupSwitchInsnNode lookup = (org.objectweb.asm.tree.LookupSwitchInsnNode) instruction;
                    branchTargets.add(lookup.dflt);
                    branchTargets.addAll(lookup.labels);
                }
                if (instruction.getOpcode() == Opcodes.PUTSTATIC) {
                    FieldInsnNode field = (FieldInsnNode) instruction;
                    if (field.owner.equals(type.name) && stackDescriptor(field.desc)) {
                        assignments.computeIfAbsent(field.name, key -> new ArrayList<>())
                            .add(field);
                    }
                }
            }
        }
        StringBuilder text = new StringBuilder();
        Source source = new Source(path, "", entry);
        int requiredAccess = Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL;
        for (Object fieldObject : type.fields) {
            FieldNode field = (FieldNode) fieldObject;
            if (!stackDescriptor(field.desc) || (field.access & requiredAccess) != requiredAccess) continue;
            List<FieldInsnNode> values = assignments.get(field.name);
            String expression = "__UNRESOLVED_BYTECODE__()";
            int sourceLine = -1;
            try {
                if (values == null || values.size() != 1) {
                    throw new IllegalArgumentException("静态赋值次数不是 1，无法安全还原：" + (values == null ? 0 : values.size()));
                }
                BytecodeExpression cursor = new BytecodeExpression(
                    values.get(0)
                        .getPrevious(),
                    branchTargets);
                expression = cursor.value();
                sourceLine = cursor.line();
            } catch (RuntimeException e) {
                source.problems
                    .put(field.name, "初始化字节码无法安全还原，需人工检查 " + entry + " #" + field.name + "：" + e.getMessage());
                if (values != null && !values.isEmpty()) sourceLine = precedingLine(values.get(0));
            }
            source.lines.put(field.name, sourceLine);
            text.append("public static final ItemStack ")
                .append(field.name)
                .append(" = ")
                .append(expression)
                .append(";\n");
        }
        return new Source(source, text.toString());
    }

    private static int precedingLine(AbstractInsnNode instruction) {
        for (AbstractInsnNode node = instruction; node != null; node = node.getPrevious()) {
            if (node instanceof LineNumberNode) return ((LineNumberNode) node).line;
        }
        return -1;
    }

    private static boolean stackDescriptor(String descriptor) {
        // 发布 jar 可能使用 1.7.10 的混淆类名；通过 Forge 自身的映射处理，避免漏掉所有字段。
        return STACK_DESCRIPTOR.equals(FMLDeobfuscatingRemapper.INSTANCE.mapDesc(descriptor));
    }

    /** 逆向读取一棵有白名单限制的初始化表达式；遇到分支或未知操作则明确报告。 */
    private static final class BytecodeExpression {

        AbstractInsnNode cursor;
        final Set<AbstractInsnNode> branchTargets;
        int minimumLine = Integer.MAX_VALUE;

        BytecodeExpression(AbstractInsnNode cursor, Set<AbstractInsnNode> branchTargets) {
            this.cursor = cursor;
            this.branchTargets = branchTargets;
        }

        int line() {
            int first = precedingLine(cursor);
            return minimumLine == Integer.MAX_VALUE ? first : first > 0 ? Math.min(first, minimumLine) : minimumLine;
        }

        AbstractInsnNode take() {
            while (cursor != null && cursor.getOpcode() < 0) {
                if (branchTargets.contains(cursor)) throw new IllegalArgumentException("表达式包含控制流合并，无法确定唯一值");
                if (cursor instanceof LineNumberNode)
                    minimumLine = Math.min(minimumLine, ((LineNumberNode) cursor).line);
                cursor = cursor.getPrevious();
            }
            if (cursor == null) throw new IllegalArgumentException("初始化表达式不完整");
            AbstractInsnNode node = cursor;
            cursor = cursor.getPrevious();
            return node;
        }

        String value() {
            AbstractInsnNode node = take();
            int opcode = node.getOpcode();
            if (opcode == Opcodes.ACONST_NULL) return "null";
            if (opcode >= Opcodes.ICONST_M1 && opcode <= Opcodes.ICONST_5)
                return Integer.toString(opcode - Opcodes.ICONST_0);
            if (opcode == Opcodes.LCONST_0 || opcode == Opcodes.LCONST_1) return (opcode - Opcodes.LCONST_0) + "L";
            if (opcode == Opcodes.BIPUSH || opcode == Opcodes.SIPUSH)
                return Integer.toString(((IntInsnNode) node).operand);
            if (node instanceof LdcInsnNode) {
                Object constant = ((LdcInsnNode) node).cst;
                if (constant instanceof String) return quote((String) constant);
                if (constant instanceof Long) return constant + "L";
                if (constant instanceof Integer) return constant.toString();
                throw new IllegalArgumentException(
                    "不支持的常量类型：" + constant.getClass()
                        .getName());
            }
            if (opcode == Opcodes.I2L || opcode == Opcodes.CHECKCAST) return value();
            if (opcode == Opcodes.GETSTATIC) {
                FieldInsnNode field = (FieldInsnNode) node;
                if ("gregtech/api/enums/Mods".equals(field.owner) && "Lgregtech/api/enums/Mods;".equals(field.desc)) {
                    return "Mods." + field.name;
                }
            }
            if (opcode == Opcodes.GETFIELD) {
                FieldInsnNode field = (FieldInsnNode) node;
                if ("gregtech/api/enums/Mods".equals(field.owner) && "ID".equals(field.name)) return value() + ".ID";
            }
            if (opcode == Opcodes.INVOKESTATIC) {
                MethodInsnNode method = (MethodInsnNode) node;
                String name;
                if ("gregtech/api/util/GTModHandler".equals(method.owner) && "getModItem".equals(method.name)) {
                    name = "getModItem";
                } else if ("util/ItemUtils".equals(method.owner) && "getItemStack".equals(method.name)) {
                    name = "ItemUtils.getItemStack";
                } else {
                    throw new IllegalArgumentException("不执行未知调用：" + method.owner + "." + method.name);
                }
                if (!stackDescriptor(
                    Type.getReturnType(method.desc)
                        .getDescriptor())) {
                    throw new IllegalArgumentException("调用的返回类型不是 ItemStack");
                }
                String[] args = new String[Type.getArgumentTypes(method.desc).length];
                for (int i = args.length - 1; i >= 0; i--) args[i] = value();
                return name + "(" + String.join(", ", args) + ")";
            }
            throw new IllegalArgumentException("不支持的初始化指令 opcode=" + opcode);
        }
    }

    /** 替换注释/可选字符串为空格，保留字符偏移与换行；不把 NBT 中的分号当声明终点。 */
    private static String mask(String input, boolean strings) {
        char[] result = input.toCharArray();
        for (int i = 0; i < input.length();) {
            char c = input.charAt(i);
            int start = i;
            if (c == '"' || c == '\'') {
                i++;
                while (i < input.length()) {
                    char next = input.charAt(i++);
                    if (next == '\\' && i < input.length()) i++;
                    else if (next == c) break;
                }
                if (!strings) continue;
            } else if (c == '/' && i + 1 < input.length() && input.charAt(i + 1) == '/') {
                i += 2;
                while (i < input.length() && input.charAt(i) != '\n') i++;
            } else if (c == '/' && i + 1 < input.length() && input.charAt(i + 1) == '*') {
                int close = input.indexOf("*/", i + 2);
                i = close < 0 ? input.length() : close + 2;
            } else {
                i++;
                continue;
            }
            for (int j = start; j < i; j++) {
                if (result[j] != '\r' && result[j] != '\n') result[j] = ' ';
            }
        }
        return new String(result);
    }

    private static int line(String input, int offset) {
        int line = 1;
        for (int i = 0; i < offset; i++) if (input.charAt(i) == '\n') line++;
        return line;
    }

    private static Definition definition(String expression) throws Exception {
        Call call = new Call(expression);
        if (call.name.equals("getModItem") || call.name.equals("GTModHandler.getModItem")
            || call.name.equals("gregtech.api.util.GTModHandler.getModItem")) {
            if (call.args.size() != 3 && call.args.size() != 4)
                throw new IllegalArgumentException("不支持的 getModItem 重载");
            if (number(call.args.get(2)) != 1) throw new IllegalArgumentException("按规则物品数量应为 1L");
            int meta = call.args.size() == 4 ? number(call.args.get(3)) : 0;
            if (meta < 0 || meta > 32767) throw new IllegalArgumentException("metadata 超出 1.7.10 短整数范围");
            return new Definition(modId(call.args.get(0)) + ":" + literal(call.args.get(1)), meta, null);
        }
        if (call.name.equals("ItemUtils.getItemStack") || call.name.equals("util.ItemUtils.getItemStack")) {
            Definition base;
            String tag;
            if (call.args.size() == 3 && call.args.get(2)
                .equals("null")) {
                base = definition(call.args.get(0));
                tag = literal(call.args.get(1));
            } else if (call.args.size() == 4 || call.args.size() == 5) {
                int tagIndex = call.args.size() - 1;
                String baseArgs = String.join(",", call.args.subList(0, tagIndex));
                base = definition("getModItem(" + baseArgs + ")");
                tag = literal(call.args.get(tagIndex));
            } else {
                throw new IllegalArgumentException("不支持的 ItemUtils.getItemStack 重载");
            }
            NBTBase parsed = JsonToNBT.func_150315_a(tag);
            if (!(parsed instanceof NBTTagCompound)) throw new IllegalArgumentException("NBT 必须是 compound");
            return new Definition(base.registryName, base.meta, (NBTTagCompound) parsed, tag);
        }
        throw new IllegalArgumentException("不支持的初始化表达式：" + call.name);
    }

    private static String modId(String expression) {
        String value = expression.replaceAll("\\s+", "");
        if (value.startsWith("\"")) return literal(expression);
        if (!value.endsWith(".ID")) throw new IllegalArgumentException("Mod ID 应为 Mods 枚举的 .ID 或字符串");
        value = value.substring(0, value.length() - 3);
        if (value.startsWith("gregtech.api.enums.Mods.")) value = value.substring("gregtech.api.enums.Mods.".length());
        else if (value.startsWith("Mods.")) value = value.substring(5);
        return Mods.valueOf(value).ID;
    }

    private static int number(String input) {
        String value = input.trim()
            .replace("_", "")
            .replaceFirst("[lL]$", "");
        return Math.toIntExact(Long.decode(value));
    }

    /** 解析 Java 字符串，不执行表达式，NBT 中转义的引号/反斜杠保持其实际内容。 */
    private static String literal(String input) {
        String value = input.trim();
        if (value.length() < 2 || value.charAt(0) != '"' || value.charAt(value.length() - 1) != '"') {
            throw new IllegalArgumentException("应为单个 Java 字符串字面量：" + input);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < value.length() - 1; i++) {
            char c = value.charAt(i);
            if (c == '"') throw new IllegalArgumentException("不支持字符串拼接/未转义引号");
            if (c != '\\') {
                result.append(c);
                continue;
            }
            if (++i >= value.length() - 1) throw new IllegalArgumentException("无效的 Java 转义");
            c = value.charAt(i);
            switch (c) {
                case 'n':
                    result.append('\n');
                    break;
                case 'r':
                    result.append('\r');
                    break;
                case 't':
                    result.append('\t');
                    break;
                case 'b':
                    result.append('\b');
                    break;
                case 'f':
                    result.append('\f');
                    break;
                case '\\':
                case '\'':
                case '"':
                    result.append(c);
                    break;
                case 'u':
                    while (i + 1 < value.length() && value.charAt(i + 1) == 'u') i++;
                    if (i + 4 >= value.length() - 1) throw new IllegalArgumentException("无效的 Unicode 转义");
                    result.append((char) Integer.parseInt(value.substring(i + 1, i + 5), 16));
                    i += 4;
                    break;
                default:
                    if (c < '0' || c > '7') throw new IllegalArgumentException("不支持的 Java 转义");
                    int octal = c - '0';
                    int max = c <= '3' ? 2 : 1;
                    while (max-- > 0 && i + 1 < value.length() - 1
                        && value.charAt(i + 1) >= '0'
                        && value.charAt(i + 1) <= '7') {
                        octal = octal * 8 + value.charAt(++i) - '0';
                    }
                    result.append((char) octal);
            }
        }
        return result.toString();
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
                default:
                    if (c < 32) result.append(String.format(Locale.ROOT, "\\u%04x", (int) c));
                    else result.append(c);
            }
        }
        return result.append('"')
            .toString();
    }

    private static String variableName(String displayName) {
        String cleaned = FORMATTING.matcher(displayName)
            .replaceAll("")
            .replaceAll("[^A-Za-z0-9]+", "_")
            .replaceAll("^_+|_+$", "");
        if (cleaned.isEmpty()) return "";
        List<String> words = new ArrayList<>(Arrays.asList(cleaned.split("_")));
        List<String> leading = new ArrayList<>();
        while (!words.isEmpty() && Character.isDigit(
            words.get(0)
                .charAt(0)))
            leading.add(words.remove(0));
        if (words.isEmpty()) return "";
        words.addAll(leading);
        String name = String.join("_", words);
        // 极少数显示名会碰上 Java 保留字；追加下划线并交由报告说明/人工确认。
        if (JAVA_KEYWORDS.contains(name)) name += "_";
        return name;
    }

    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(
        Arrays.asList(
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
            "null"));

    private static String normalized(String name) {
        return name.replaceAll("[^A-Za-z0-9]", "")
            .toLowerCase(Locale.ROOT);
    }

    /** 带上界的 Levenshtein；只有严格超过 80% 的候选才需要完整得分。 */
    private static double similarity(String left, String right) {
        int length = Math.max(left.length(), right.length());
        if (length == 0) return 0;
        int limit = (length - 1) / 5;
        if (Math.abs(left.length() - right.length()) > limit) return 0;
        int[] previous = new int[right.length() + 1];
        int[] current = new int[right.length() + 1];
        for (int j = 0; j <= right.length(); j++) previous[j] = j;
        for (int i = 1; i <= left.length(); i++) {
            current[0] = i;
            int minimum = i;
            for (int j = 1; j <= right.length(); j++) {
                current[j] = Math.min(
                    Math.min(current[j - 1] + 1, previous[j] + 1),
                    previous[j - 1] + (left.charAt(i - 1) == right.charAt(j - 1) ? 0 : 1));
                minimum = Math.min(minimum, current[j]);
            }
            if (minimum > limit) return 0;
            int[] swap = previous;
            previous = current;
            current = swap;
        }
        return previous[right.length()] <= limit ? 1.0 - (double) previous[right.length()] / length : 0;
    }

    private static final class ParsedSource {

        final List<Declaration> declarations = new ArrayList<>();
    }

    private static final class Declaration {

        final String name;
        final String location;
        final String before;
        final Definition definition;
        final String error;

        Declaration(String name, String location, String before, Definition definition, String error) {
            this.name = name;
            this.location = location;
            this.before = before;
            this.definition = definition;
            this.error = error;
        }
    }

    private static final class Source {

        final String path;
        final String text;
        final String classEntry;
        final Map<String, Integer> lines;
        final Map<String, String> problems;

        Source(String path, String text) {
            this(path, text, null);
        }

        Source(String path, String text, String classEntry) {
            this.path = path;
            this.text = text;
            this.classEntry = classEntry;
            this.lines = new HashMap<>();
            this.problems = new HashMap<>();
        }

        Source(Source compiled, String text) {
            this.path = compiled.path;
            this.text = text;
            this.classEntry = compiled.classEntry;
            this.lines = compiled.lines;
            this.problems = compiled.problems;
        }
    }

    private static final class Call {

        final String name;
        final List<String> args = new ArrayList<>();

        Call(String input) {
            String text = input.trim();
            int open = text.indexOf('(');
            if (open < 0 || !text.endsWith(")")) throw new IllegalArgumentException("应为方法调用");
            name = text.substring(0, open)
                .replaceAll("\\s+", "");
            String body = text.substring(open + 1, text.length() - 1);
            String masked = mask(body, true);
            int depth = 0;
            int start = 0;
            for (int i = 0; i < masked.length(); i++) {
                char c = masked.charAt(i);
                if (c == '(') depth++;
                else if (c == ')') depth--;
                else if (c == ',' && depth == 0) {
                    args.add(
                        body.substring(start, i)
                            .trim());
                    start = i + 1;
                }
                if (depth < 0) throw new IllegalArgumentException("方法括号不匹配");
            }
            if (depth != 0) throw new IllegalArgumentException("方法括号不匹配");
            if (!body.trim()
                .isEmpty())
                args.add(
                    body.substring(start)
                        .trim());
        }
    }

    private static final class Definition {

        final String registryName;
        final int meta;
        final NBTTagCompound tag;
        final String originalTag;

        Definition(String registryName, int meta, NBTTagCompound tag) {
            this(registryName, meta, tag, null);
        }

        Definition(String registryName, int meta, NBTTagCompound tag, String originalTag) {
            this.registryName = registryName;
            this.meta = meta;
            this.tag = tag;
            this.originalTag = originalTag;
        }

        String key() {
            return registryName + "@" + meta;
        }

        boolean sameIdentity(Definition other) {
            return registryName.equals(other.registryName) && meta == other.meta && Objects.equals(tag, other.tag);
        }

        @Override
        public String toString() {
            return key() + " NBT=" + (tag == null ? "<无>" : tag.toString());
        }
    }

    private static final class Variant {

        final Definition identity;
        final String displayName;
        final String variableName;
        final boolean verified;
        final String evidence;

        Variant(Definition identity, String displayName, boolean verified, String evidence) {
            this.identity = identity;
            this.displayName = displayName;
            this.variableName = displayName == null ? "" : variableName(displayName);
            this.verified = verified;
            this.evidence = evidence;
        }

        String statement() {
            return statement(identity);
        }

        String statement(Definition sourceIdentity) {
            int colon = identity.registryName.indexOf(':');
            String id = identity.registryName.substring(0, colon);
            String mod = quote(id);
            for (Mods value : Mods.values()) {
                if (value.ID.equals(id)) {
                    mod = value.name() + ".ID";
                    break;
                }
            }
            String expression = "getModItem(" + mod
                + ", "
                + quote(identity.registryName.substring(colon + 1))
                + ", 1L"
                + (identity.meta == 0 ? "" : ", " + identity.meta)
                + ")";
            if (identity.tag != null) {
                String tag = sourceIdentity.originalTag == null ? identity.tag.toString() : sourceIdentity.originalTag;
                expression = "ItemUtils.getItemStack(" + expression + ", " + quote(tag) + ", null)";
            }
            return "public static final ItemStack " + variableName + " = " + expression + ";";
        }
    }

    private static final class Candidate {

        final Variant variant;
        final double score;

        Candidate(Variant variant, double score) {
            this.variant = variant;
            this.score = score;
        }
    }

    private static final class Catalog {

        final Mode mode;
        final Set<String> registeredNames = new HashSet<>();
        final Map<String, List<Variant>> identities = new HashMap<>();
        final Map<String, List<Variant>> names = new HashMap<>();
        final Map<String, List<Candidate>> candidateCache = new HashMap<>();
        final Map<String, List<ProbeFailure>> probeFailures = new HashMap<>();
        final List<String> errors = new ArrayList<>();
        int size;
        int verifiedSize;
        int neiEntries;

        Catalog(Mode mode) {
            this.mode = mode;
        }

        /** NEI 模式只从完整 NEI 列表取得身份，不运行注册表子项或声明探测。 */
        void captureNeiItem(ItemStack original, int index) {
            Definition identity = null;
            try {
                identity = identity(original);
                add(original, true, "NEI 已加载完整列表中的身份");
            } catch (Exception | LinkageError e) {
                errors.add("NEI #" + index + (identity == null ? "" : " " + identity) + "：" + e.toString());
                if (identity != null) {
                    probeFailures.computeIfAbsent(identity.key(), key -> new ArrayList<>())
                        .add(new ProbeFailure(identity, e.toString()));
                }
            }
        }

        /** 每个注册项都调用，不用创造模式标签页/NEI 可见性决定是否跳过。 */
        void captureRegisteredItem(String name) {
            Item item;
            try {
                item = (Item) Item.itemRegistry.getObject(name);
                if (item == null) throw new IllegalArgumentException("注册项没有 Item 对象");
            } catch (Exception | LinkageError e) {
                errors.add(name + " 注册对象读取失败：" + e.toString());
                return;
            }
            Set<CreativeTabs> tabs = new LinkedHashSet<>();
            try {
                CreativeTabs[] declared = item.getCreativeTabs();
                if (declared != null) tabs.addAll(Arrays.asList(declared));
            } catch (Exception | LinkageError e) {
                errors.add(name + " getCreativeTabs：" + e.toString());
            }
            if (tabs.isEmpty()) tabs.add(null);
            tabs.add(CreativeTabs.tabAllSearch);
            boolean found = false;
            for (CreativeTabs tab : tabs) {
                List<ItemStack> stacks = new ArrayList<>();
                try {
                    item.getSubItems(item, tab, stacks);
                } catch (Exception | LinkageError e) {
                    errors.add(
                        name + " getSubItems("
                            + (tab == null ? "null"
                                : tab.getClass()
                                    .getName())
                            + ")："
                            + e.toString());
                }
                // 即使回调抛错，也保留已经加入列表的有效项；每个变体单独隔离异常。
                for (Object original : stacks) {
                    try {
                        if (!(original instanceof ItemStack)) throw new IllegalArgumentException("空或非 ItemStack 条目");
                        Variant variant = add((ItemStack) original, true, "物品 getSubItems 实际枚举的完整身份");
                        if (variant.identity.registryName.equals(name)) found = true;
                    } catch (Exception | LinkageError e) {
                        errors.add(name + " 子项读取失败：" + e.toString());
                    }
                }
            }
            if (!found) {
                // 隐藏物品/空子项列表仍有默认名称候选，不把默认堆栈当成变体存在的证明。
                try {
                    add(new ItemStack(item, 1, 0), false, "注册表默认堆栈探测；物品 API 未枚举此完整身份");
                } catch (Exception | LinkageError e) {
                    errors.add(name + " 默认堆栈探测失败：" + e.toString());
                }
            }
        }

        /** 声明中的任意 metadata/NBT 都额外探测，即使不在 getSubItems 中。 */
        void probe(Definition definition) {
            Variant existing = exact(definition);
            if (!registeredNames.contains(definition.registryName) || existing != null && existing.verified
                || probeError(definition) != null) return;
            try {
                Item item = (Item) Item.itemRegistry.getObject(definition.registryName);
                if (item == null) throw new IllegalArgumentException("注册项没有 Item 对象");
                ItemStack stack = new ItemStack(item, 1, definition.meta);
                if (definition.tag != null) stack.setTagCompound((NBTTagCompound) definition.tag.copy());
                if (!definition.sameIdentity(identity(stack))) {
                    throw new IllegalStateException("构造堆栈后身份与声明不同，未使用被改写的身份校验");
                }
                boolean damage = definition.tag == null && !item.getHasSubtypes()
                    && item.isDamageable()
                    && definition.meta >= 0
                    && definition.meta <= item.getMaxDamage();
                if (existing != null && !damage) return;
                add(
                    stack,
                    damage,
                    damage ? "无 NBT 损耗型物品，metadata 位于 API 声明的损耗范围内" : "注册表命中后按声明的 metadata/NBT 探测；物品 API 未枚举此完整身份");
            } catch (Exception | LinkageError e) {
                probeFailures.computeIfAbsent(definition.key(), key -> new ArrayList<>())
                    .add(new ProbeFailure(definition, e.toString()));
                errors.add("声明身份 " + definition + "：" + e.toString());
            }
        }

        private Definition identity(ItemStack stack) {
            if (stack == null || stack.getItem() == null) throw new IllegalArgumentException("空物品");
            String name = Item.itemRegistry.getNameForObject(stack.getItem());
            if (name == null || !registeredNames.contains(name)) throw new IllegalArgumentException("物品缺少注册名");
            NBTTagCompound tag = stack.hasTagCompound() ? (NBTTagCompound) stack.getTagCompound()
                .copy() : null;
            return new Definition(name, stack.getItemDamage(), tag);
        }

        private Variant add(ItemStack original, boolean verified, String evidence) {
            if (original == null) throw new IllegalArgumentException("空物品");
            ItemStack stack = original.copy();
            Definition identity = identity(stack);
            Variant existing = exact(identity);
            if (existing != null && (existing.verified || !verified)) return existing;
            String displayName = stack.getDisplayName();
            if (!identity.sameIdentity(identity(stack))) {
                throw new IllegalStateException("读取显示名时堆栈身份发生变化，需人工确认");
            }
            Variant variant = new Variant(identity, displayName, verified, evidence);
            List<Variant> variants = identities.computeIfAbsent(identity.key(), key -> new ArrayList<>());
            if (existing == null) {
                size++;
            } else {
                variants.remove(existing);
                if (!existing.variableName.isEmpty()) names.get(normalized(existing.variableName))
                    .remove(existing);
            }
            variants.add(variant);
            if (verified) verifiedSize++;
            if (!variant.variableName.isEmpty()) {
                names.computeIfAbsent(normalized(variant.variableName), key -> new ArrayList<>())
                    .add(variant);
            }
            return variant;
        }

        String probeError(Definition definition) {
            List<ProbeFailure> failures = probeFailures.get(definition.key());
            if (failures != null) {
                for (ProbeFailure failure : failures) {
                    if (definition.sameIdentity(failure.identity)) return failure.message;
                }
            }
            return null;
        }

        Variant exact(Definition definition) {
            List<Variant> variants = identities.get(definition.key());
            if (variants != null) {
                for (Variant variant : variants) {
                    if (Objects.equals(definition.tag, variant.identity.tag)) return variant;
                }
            }
            return null;
        }

        List<Candidate> candidates(String sourceName) {
            String key = normalized(sourceName);
            List<Candidate> cached = candidateCache.get(key);
            if (cached != null) return cached;
            List<Candidate> candidates = new ArrayList<>();
            for (Map.Entry<String, List<Variant>> entry : names.entrySet()) {
                double score = similarity(key, entry.getKey());
                if (score > 0.8) {
                    for (Variant variant : entry.getValue()) candidates.add(new Candidate(variant, score));
                }
            }
            Collections.sort(
                candidates,
                Comparator.comparingDouble((Candidate c) -> c.score)
                    .reversed()
                    .thenComparing(c -> c.variant.identity.key())
                    .thenComparing(c -> String.valueOf(c.variant.identity.tag)));
            candidateCache.put(key, candidates);
            return candidates;
        }
    }

    private static final class ProbeFailure {

        final Definition identity;
        final String message;

        ProbeFailure(Definition identity, String message) {
            this.identity = identity;
            this.message = message;
        }
    }
}
