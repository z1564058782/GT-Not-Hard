package Tools;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.JarURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.JarFile;
import java.util.stream.Stream;

import javax.lang.model.SourceVersion;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fluids.FluidStack;

import org.apache.logging.log4j.Logger;

import com.mofoga.gtnothard.MyMod;

import codechicken.nei.recipe.GuiCraftingRecipe;
import codechicken.nei.recipe.GuiUsageRecipe;
import codechicken.nei.recipe.IRecipeHandler;
import codechicken.nei.recipe.IUsageHandler;
import codechicken.nei.recipe.RecipeCatalysts;
import codechicken.nei.recipe.TemplateRecipeHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.UniqueIdentifier;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.enums.Mods;
import gregtech.api.enums.TierEU;
import gregtech.api.util.GTRecipe;
import gregtech.nei.GTNEIDefaultHandler;

/**
 * GTNH 2.9.0 / Minecraft 1.7.10 客户端配方导出器。
 *
 * <p>
 * 由 GT Not Hard 的 ClientProxy.init 调用 registerCommand()，复用 MyMod 的生命周期和日志。
 * 不要向服务端命令处理器注册；NEI 的配方处理器及 catalyst 表只存在于客户端。
 *
 * <p>
 * 手持机器执行 /ExportRecipe 或 /ExportRecipeEnum [目标配方表变量名]。
 * 后者优先引用 EnumList 中已有的物品和流体变量；默认使用机器显示名称加 Recipe，如 AssemblyLineRecipe。
 * 输出位于客户端游戏目录的
 * recipe-exports/机器名_随机后缀/Recipes/Exported/ExportedRecipes.java，另附 report.txt。
 * 将生成的 Recipes 目录加入 Mod 源码，在正常配方注册阶段调用
 * Recipes.Exported.ExportedRecipes.register(你的普通RecipeMap)。
 * Assembly Line 的默认导出另提供 loadRecipes()，直接写入 ChaosRecipeMap.AssemblyLineNormalRecipe。
 *
 * <p>
 * 只导出机器作为 NEI catalyst 所关联的 GTRecipe 配方，不导出“以机器为原料”的用途配方。
 * 保留 NEI 的分类、隐藏状态和手持机器电压筛选；炉温、重力、研究等条件不写入生成代码。
 * Assembly Line 的 fake 展示配方也会导出，特殊槽的研究闪存不会作为原料。
 * 不支持的非 GT NEI 页面和失败条目会明确记录，避免把不完整导出报告为成功。
 */
@SideOnly(Side.CLIENT)
public final class RecipeExport {

    private RecipeExport() {}

    public static void registerCommand() {
        ExportCommand.register();
    }

    @SideOnly(Side.CLIENT)
    public static final class ExportCommand extends CommandBase {

        private static final Logger LOG = MyMod.LOG;
        private static final int RECIPES_PER_BATCH = 32;
        private static boolean registered;
        private final boolean useEnums;

        public ExportCommand() {
            this(false);
        }

        public ExportCommand(boolean useEnums) {
            this.useEnums = useEnums;
        }

        /** 也可从已有的 ClientProxy.init 中调用；重复调用不会重复注册。 */
        public static void register() {
            if (!registered) {
                ClientCommandHandler.instance.registerCommand(new ExportCommand());
                ClientCommandHandler.instance.registerCommand(new ExportCommand(true));
                registered = true;
            }
        }

        @Override
        public String getCommandName() {
            return useEnums ? "ExportRecipeEnum" : "ExportRecipe";
        }

        @Override
        public List<String> getCommandAliases() {
            return Collections.singletonList(useEnums ? "exportrecipeenum" : "exportrecipe");
        }

        @Override
        public String getCommandUsage(ICommandSender sender) {
            return "/" + getCommandName() + " [目标配方表变量名]";
        }

        @Override
        public int getRequiredPermissionLevel() {
            return 0;
        }

        @Override
        public boolean canCommandSenderUseCommand(ICommandSender sender) {
            return sender instanceof EntityPlayer;
        }

        @Override
        public void processCommand(ICommandSender sender, String[] args) {
            if (args.length > 1 || (args.length == 1 && !validIdentifier(args[0]))) {
                throw new WrongUsageException(getCommandUsage(sender));
            }
            if (!(sender instanceof EntityPlayer)) {
                message(sender, "请在游戏客户端手持机器执行此命令。", true);
                return;
            }
            ItemStack held = ((EntityPlayer) sender).getHeldItem();
            if (held == null || held.getItem() == null) {
                message(sender, "请先将需要导出配方的机器拿在主手。", true);
                return;
            }

            try {
                String target = args.length == 1 ? args[0] : machineRecipeName(held.getDisplayName());
                EnumIndex enums = useEnums ? EnumIndex.load(target) : null;
                ExportData data = collect(held.copy(), enums);
                if (data.matchedHandlers == 0) {
                    message(sender, "NEI 没有将此物品登记为机器配方页的 catalyst，请确认已进入世界且 NEI 已加载。", true);
                    return;
                }
                Path root = Minecraft.getMinecraft().mcDataDir.toPath()
                    .resolve("recipe-exports");
                Files.createDirectories(root);
                String name = safeFileName(held.getDisplayName());
                String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                Path directory = Files.createTempDirectory(root, name + "_" + time + "_");
                Path sourceDirectory = directory.resolve("Recipes")
                    .resolve("Exported");
                Files.createDirectories(sourceDirectory);
                writeSource(sourceDirectory.resolve("ExportedRecipes.java"), held, target, data);
                writeReport(directory.resolve("report.txt"), held, data);
                boolean incomplete = !data.problems.isEmpty();
                boolean emptyEnums = enums != null && enums.items.isEmpty() && enums.fluids.isEmpty();
                message(
                    sender,
                    "已导出 " + data.recipes.size()
                        + " 条配方（"
                        + data.matchedHandlers
                        + " 个 NEI 页面）"
                        + (incomplete ? "；存在未导出内容，详见 report.txt。" : "。"),
                    incomplete || emptyEnums);
                if (enums != null) {
                    message(
                        sender,
                        "EnumList 索引：" + enums.items.size()
                            + " 个物品、"
                            + enums.fluids.size()
                            + " 个流体。"
                            + (emptyEnums ? "索引为空，本次未替换变量，请查看 report.txt。" : ""),
                        emptyEnums);
                }
                message(sender, "导出目录：" + directory.toAbsolutePath(), false);
            } catch (Exception e) {
                LOG.error("Recipe export failed", e);
                message(
                    sender,
                    "导出失败：" + e.getClass()
                        .getSimpleName() + "：" + e.getMessage() + "。详细信息见客户端日志。",
                    true);
            }
        }

        private static boolean validIdentifier(String value) {
            // 禁止用户变量名与生成器的局部变量、导入的类或辅助方法冲突。
            return SourceVersion.isIdentifier(value) && !SourceVersion.isKeyword(value)
                && !value.matches("Batch[0-9]+")
                && !value.startsWith("RECIPE_")
                && !Arrays
                    .asList(
                        "targetMap",
                        "builder",
                        "recipe",
                        "GTValues",
                        "Mods",
                        "SECONDS",
                        "FluidRegistry",
                        "ItemStack",
                        "FluidStack",
                        "String",
                        "Collections",
                        "ExportedRecipes",
                        "EnumList",
                        "setStackSize",
                        "getModItem",
                        "withNBT",
                        "_",
                        "var",
                        "yield",
                        "record",
                        "sealed",
                        "permits")
                    .contains(value);
        }

        private static String machineRecipeName(String displayName) {
            String name = EnumChatFormatting.getTextWithoutFormattingCodes(displayName);
            StringBuilder result = new StringBuilder();
            boolean wordStart = true;
            for (int offset = 0; offset < name.length();) {
                int codePoint = name.codePointAt(offset);
                offset += Character.charCount(codePoint);
                if (Character.isLetterOrDigit(codePoint)) {
                    result.appendCodePoint(wordStart ? Character.toUpperCase(codePoint) : codePoint);
                    wordStart = false;
                } else {
                    wordStart = true;
                }
            }
            if (result.length() == 0 || !Character.isJavaIdentifierStart(result.codePointAt(0))) {
                result.insert(0, "Machine");
            }
            String target = result.append("Recipe")
                .toString();
            return validIdentifier(target) ? target : "Machine" + target;
        }

        private static void message(ICommandSender sender, String text, boolean warning) {
            sender.addChatMessage(
                new ChatComponentText(
                    (warning ? EnumChatFormatting.YELLOW : EnumChatFormatting.GREEN) + "[RecipeExport] " + text));
        }

        private static String safeFileName(String name) {
            String clean = EnumChatFormatting.getTextWithoutFormattingCodes(name)
                .replaceAll("[^\\p{L}\\p{N}_-]", "_");
            return clean.isEmpty() ? "machine" : clean.substring(0, Math.min(48, clean.length()));
        }

        private static ExportData collect(ItemStack held, EnumIndex enums) {
            // NEI 同时维护普通和串行注册表；漏掉 serial* 会漏导部分配方页。
            Map<String, IRecipeHandler> handlers = new LinkedHashMap<>();
            addHandlers(handlers, GuiUsageRecipe.usagehandlers);
            addHandlers(handlers, GuiUsageRecipe.serialUsageHandlers);
            addHandlers(handlers, GuiCraftingRecipe.craftinghandlers);
            addHandlers(handlers, GuiCraftingRecipe.serialCraftingHandlers);
            ExportData data = new ExportData(enums);
            Set<GTRecipe> seen = Collections.newSetFromMap(new IdentityHashMap<GTRecipe, Boolean>());
            for (IRecipeHandler source : handlers.values()) {
                try {
                    if (!RecipeCatalysts.containsCatalyst(source, held)) continue;
                    data.matchedHandlers++;
                    if (!(source instanceof GTNEIDefaultHandler)) {
                        data.problems.add(
                            "不支持的非 GT 配方页：" + source.getRecipeName()
                                + " ["
                                + source.getHandlerId()
                                + "]；NEI 通用接口不提供真实 EU/t、耗时与原料数量。");
                        continue;
                    }
                    GTNEIDefaultHandler gtSource = (GTNEIDefaultHandler) source;
                    // 与在 NEI 点击该机器一致：保留电压筛选，并涵盖关联的每个模式/分类。
                    IUsageHandler loaded = gtSource.getUsageAndCatalystHandler("item", held.copy());
                    if (!(loaded instanceof GTNEIDefaultHandler)) {
                        throw new IllegalStateException("GT 配方页返回了无法读取的 handler");
                    }
                    GTNEIDefaultHandler handler = (GTNEIDefaultHandler) loaded;
                    String mapName = handler.getRecipeMap().unlocalizedName;
                    data.assemblyLine |= "gt.recipe.fakeAssemblylineProcess".equals(mapName);
                    data.pages.add(handler.getRecipeName() + " [" + mapName + "]：" + handler.numRecipes() + " 条");
                    for (TemplateRecipeHandler.CachedRecipe cached : handler.arecipes) {
                        if (!(cached instanceof GTNEIDefaultHandler.CachedDefaultRecipe)) {
                            data.problems.add("无法读取的缓存配方：" + source.getHandlerId());
                            continue;
                        }
                        GTRecipe recipe = ((GTNEIDefaultHandler.CachedDefaultRecipe) cached).mRecipe;
                        // 不按 mFakeRecipe/mEnabled 过滤：NEI 会显示 Assembly Line 等 fake 配方。
                        if (recipe == null || recipe.mHidden || !seen.add(recipe)) continue;
                        try {
                            data.recipes.add(formatRecipe(recipe, handler.getRecipeName(), mapName, enums));
                        } catch (Exception e) {
                            data.problems.add("配方导出失败：" + mapName + " / " + outputName(recipe) + " / " + e);
                            LOG.warn("Could not export recipe from " + mapName, e);
                        }
                    }
                } catch (Exception e) {
                    data.problems.add("配方页读取失败：" + source.getHandlerId() + " / " + e);
                    LOG.warn("Could not read NEI handler " + source.getHandlerId(), e);
                }
            }
            return data;
        }

        private static void addHandlers(Map<String, IRecipeHandler> result, List<? extends IRecipeHandler> handlers) {
            for (IRecipeHandler handler : new ArrayList<IRecipeHandler>(handlers)) {
                // GT 的多个配方页共享 Java handler 类名；用 NEI 的 overlay/catalyst ID 区分页面。
                result.putIfAbsent(RecipeCatalysts.getRecipeID(handler), handler);
            }
        }

        private static String formatRecipe(GTRecipe recipe, String page, String mapName, EnumIndex enums)
            throws IOException {
            if (recipe.mDuration == -1 || recipe.mEUt == -1) {
                throw new IllegalArgumentException("该展示配方的耗时或 EU/t 为 -1，GTRecipeBuilder 无法还原");
            }
            StringBuilder code = new StringBuilder();
            code.append("// ")
                .append(comment(outputName(recipe)))
                .append('\n');
            code.append("// NEI: ")
                .append(comment(page))
                .append(" [")
                .append(comment(mapName))
                .append("]\n");
            code.append("GTValues.RA.stdBuilder()\n");
            List<String> items = new ArrayList<>();
            List<Integer> inputChances = new ArrayList<>();
            boolean itemAlternatives = false;
            boolean largeInput = false;
            ItemStack[][] alternatives = recipe instanceof GTRecipe.GTRecipe_WithAlt
                ? ((GTRecipe.GTRecipe_WithAlt) recipe).mOreDictAlt
                : null;
            for (int i = 0; i < recipe.mInputs.length; i++) {
                ItemStack input = recipe.mInputs[i];
                List<String> slot = new ArrayList<>();
                if (alternatives != null && i < alternatives.length && alternatives[i] != null) {
                    for (ItemStack alternative : alternatives[i]) {
                        if (alternative != null) {
                            slot.add(item(alternative, enums));
                            largeInput |= alternative.stackSize > 64;
                        }
                    }
                }
                if (slot.isEmpty() && input == null) continue;
                if (slot.size() > 1) {
                    itemAlternatives = true;
                    items.add("new ItemStack[] { " + String.join(", ", slot) + " }");
                } else {
                    items.add(slot.isEmpty() ? item(input, enums) : slot.get(0));
                }
                largeInput |= input != null && input.stackSize > 64;
                inputChances.add(recipe.getInputChance(i));
            }
            appendInputs(
                code,
                itemAlternatives ? "itemInputs" : largeInput ? "itemInputsUnsafe" : "itemInputs",
                items,
                itemAlternatives);
            appendChances(code, "inputChances", inputChances);

            List<String> fluids = new ArrayList<>();
            List<Integer> fluidInputChances = new ArrayList<>();
            boolean fluidAlternatives = false;
            for (int i = 0; i < recipe.mFluidInputs.length; i++) {
                FluidStack input = recipe.mFluidInputs[i];
                List<String> slot = new ArrayList<>();
                if (recipe.mAltFluidInputs != null && i < recipe.mAltFluidInputs.length
                    && recipe.mAltFluidInputs[i] != null) {
                    for (FluidStack alternative : recipe.mAltFluidInputs[i]) {
                        if (alternative != null) slot.add(fluid(alternative, enums));
                    }
                }
                if (slot.isEmpty() && input == null) continue;
                if (slot.size() > 1) {
                    fluidAlternatives = true;
                    fluids.add("new FluidStack[] { " + String.join(", ", slot) + " }");
                } else {
                    fluids.add(slot.isEmpty() ? fluid(input, enums) : slot.get(0));
                }
                fluidInputChances.add(recipe.getFluidInputChance(i));
            }
            appendInputs(code, "fluidInputs", fluids, fluidAlternatives);
            appendChances(code, "fluidInputChances", fluidInputChances);

            items.clear();
            List<Integer> outputChances = new ArrayList<>();
            for (int i = 0; i < recipe.mOutputs.length; i++) {
                if (recipe.mOutputs[i] == null) continue;
                items.add(item(recipe.mOutputs[i], enums));
                outputChances.add(recipe.getOutputChance(i));
            }
            appendInputs(code, "itemOutputs", items, false);
            appendChances(code, "outputChances", outputChances);
            fluids.clear();
            List<Integer> fluidOutputChances = new ArrayList<>();
            for (int i = 0; i < recipe.mFluidOutputs.length; i++) {
                if (recipe.mFluidOutputs[i] == null) continue;
                fluids.add(fluid(recipe.mFluidOutputs[i], enums));
                fluidOutputChances.add(recipe.getFluidOutputChance(i));
            }
            appendInputs(code, "fluidOutputs", fluids, false);
            appendChances(code, "fluidOutputChances", fluidOutputChances);
            if (recipe.isNBTSensitive) code.append("    .nbtSensitive()\n");
            code.append("    .eut(")
                .append(eut(recipe.mEUt))
                .append(")\n");
            code.append("    .duration(")
                .append(duration(recipe.mDuration))
                .append(")\n");
            // 特殊槽、mSpecialValue、research/heat/gravity 等 metadata 均不序列化。
            code.append("    .addTo(");
            return code.toString();
        }

        private static void appendInputs(StringBuilder code, String method, List<String> values, boolean alternatives) {
            if (values.isEmpty()) return;
            code.append("    .")
                .append(method)
                .append('(');
            // Object[] 强制选择支持替代原料的重载；单个 ItemStack[] 不能直接当 varargs 传递。
            if (alternatives) code.append("new Object[] {");
            code.append('\n');
            for (int i = 0; i < values.size(); i++) {
                code.append("        ")
                    .append(values.get(i));
                if (i + 1 < values.size()) code.append(',');
                code.append('\n');
            }
            code.append(alternatives ? "    })\n" : "    )\n");
        }

        private static void appendChances(StringBuilder code, String method, List<Integer> chances) {
            if (chances.isEmpty() || chances.stream()
                .allMatch(chance -> chance == 10000)) return;
            code.append("    .")
                .append(method)
                .append('(');
            for (int i = 0; i < chances.size(); i++) {
                if (i > 0) code.append(", ");
                code.append(chances.get(i));
            }
            code.append(")\n");
        }

        private static StackKey itemKey(ItemStack stack) {
            if (stack == null || stack.getItem() == null) return null;
            UniqueIdentifier id = GameRegistry.findUniqueIdentifierFor(stack.getItem());
            return id == null ? null
                : new StackKey(id.modId + ":" + id.name, stack.getItemDamage(), stack.getTagCompound());
        }

        private static StackKey fluidKey(FluidStack stack) {
            return stack == null || stack.getFluid() == null ? null
                : new StackKey(
                    stack.getFluid()
                        .getName(),
                    0,
                    stack.tag);
        }

        /** 数量不参与匹配，NBT 必须完全一致，避免引用带有不同附加数据的共享变量。 */
        private static final class StackKey {

            private final String name;
            private final int meta;
            private final NBTTagCompound tag;

            private StackKey(String name, int meta, NBTTagCompound tag) {
                this.name = name;
                this.meta = meta;
                this.tag = tag == null ? null : (NBTTagCompound) tag.copy();
            }

            @Override
            public boolean equals(Object other) {
                if (!(other instanceof StackKey)) return false;
                StackKey key = (StackKey) other;
                return meta == key.meta && name.equals(key.name) && Objects.equals(tag, key.tag);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, meta, tag);
            }
        }

        private static final class EnumIndex {

            private final Map<StackKey, Field> items = new LinkedHashMap<>();
            private final Map<StackKey, Field> fluids = new LinkedHashMap<>();
            private final Map<String, Integer> simpleNames = new LinkedHashMap<>();
            private final Set<String> imports = new TreeSet<>();
            private final List<String> notes = new ArrayList<>();
            private final String target;

            private EnumIndex(String target) {
                this.target = target;
            }

            private static EnumIndex load(String target) {
                EnumIndex result = new EnumIndex(target);
                Set<String> classes = new TreeSet<>();
                try {
                    // 从本 Mod 的实际 JAR 或开发环境的 classes 目录发现类，无需部署源码。
                    URL source = RecipeExport.class.getProtectionDomain()
                        .getCodeSource()
                        .getLocation();
                    result.notes.add("EnumList 扫描来源：" + source.toExternalForm());
                    if ("jar".equals(source.getProtocol())) {
                        // LaunchWrapper 的 CodeSource 可能是 jar:file:...!/Tools/RecipeExport.class。
                        // 直接 Paths.get(jarURI) 会要求预先挂载 ZipFS，导致游戏内索引始终为空。
                        JarURLConnection connection = (JarURLConnection) source.openConnection();
                        connection.setUseCaches(false);
                        try (JarFile jar = connection.getJarFile()) {
                            jar.stream()
                                .forEach(entry -> addClass(classes, entry.getName()));
                        }
                    } else {
                        Path location = Paths.get(source.toURI());
                        if (Files.isDirectory(location)) {
                            try (Stream<Path> files = Files.walk(location.resolve("EnumList"))) {
                                files.filter(Files::isRegularFile)
                                    .forEach(
                                        file -> addClass(
                                            classes,
                                            location.relativize(file)
                                                .toString()
                                                .replace('\\', '/')));
                            }
                        } else {
                            try (JarFile jar = new JarFile(location.toFile())) {
                                jar.stream()
                                    .forEach(entry -> addClass(classes, entry.getName()));
                            }
                        }
                    }
                    for (String name : classes) {
                        result.simpleNames.merge(name.substring(name.lastIndexOf('.') + 1), 1, Integer::sum);
                    }
                } catch (Exception e) {
                    result.notes.add("无法扫描 EnumList，保留原获取方式：" + e);
                    LOG.warn("Could not scan EnumList", e);
                }
                for (String name : classes) {
                    try {
                        Class<?> type = Class.forName(name, false, RecipeExport.class.getClassLoader());
                        if (!Modifier.isPublic(type.getModifiers())) continue;
                        Field[] fields = type.getDeclaredFields();
                        Arrays.sort(
                            fields,
                            (a, b) -> a.getName()
                                .compareTo(b.getName()));
                        for (Field field : fields) {
                            if (!Modifier.isPublic(field.getModifiers()) || !Modifier.isStatic(field.getModifiers()))
                                continue;
                            if (field.getType() == ItemStack.class) {
                                StackKey key = itemKey((ItemStack) field.get(null));
                                if (key != null) result.items.putIfAbsent(key, field);
                            } else if (field.getType() == FluidStack.class) {
                                StackKey key = fluidKey((FluidStack) field.get(null));
                                if (key != null) result.fluids.putIfAbsent(key, field);
                            }
                        }
                    } catch (ReflectiveOperationException | LinkageError | RuntimeException e) {
                        // 缺少可选 Mod 或类初始化失败只影响变量替换，不阻止原配方导出。
                        result.notes.add("无法读取 " + name + "，未匹配项保留原获取方式：" + e);
                        LOG.warn("Could not index " + name, e);
                    }
                }
                return result;
            }

            private static void addClass(Set<String> classes, String entry) {
                if (entry.startsWith("EnumList/") && entry.endsWith(".class") && !entry.contains("$")) {
                    classes.add(
                        entry.substring(0, entry.length() - 6)
                            .replace('/', '.'));
                }
            }

            private String reference(Field field) {
                if (field == null) return null;
                Class<?> owner = field.getDeclaringClass();
                String name = owner.getSimpleName();
                if (name.equals(target) || !validIdentifier(name) || simpleNames.getOrDefault(name, 0) > 1) {
                    name = owner.getName();
                } else {
                    imports.add(owner.getName());
                }
                return name + "." + field.getName();
            }
        }

        private static String item(ItemStack stack, EnumIndex enums) throws IOException {
            UniqueIdentifier id = GameRegistry.findUniqueIdentifierFor(stack.getItem());
            if (id == null) throw new IllegalArgumentException("物品没有注册名：" + stack.getUnlocalizedName());
            if (enums != null) {
                String reference = enums.reference(enums.items.get(itemKey(stack)));
                if (reference != null) return "setStackSize(" + reference + ".copy(), " + stack.stackSize + ")";
            }
            String expression = "setStackSize(getModItem(" + modId(
                id.modId) + ", " + quote(id.name) + ", 1L, " + stack.getItemDamage() + "), " + stack.stackSize + ")";
            return stack.hasTagCompound() ? withNBT(expression, stack.getTagCompound()) : expression;
        }

        private static String fluid(FluidStack stack, EnumIndex enums) throws IOException {
            if (stack.getFluid() == null) throw new IllegalArgumentException("未注册的流体");
            if (enums != null) {
                String reference = enums.reference(enums.fluids.get(fluidKey(stack)));
                if (reference != null)
                    return "setStackSize(" + reference + ".copy(), " + fluidAmount(stack.amount) + ")";
            }
            String expression = "setStackSize(FluidRegistry.getFluidStack(" + quote(
                stack.getFluid()
                    .getName())
                + ", 1), "
                + fluidAmount(stack.amount)
                + ")";
            return stack.tag == null ? expression : withNBT(expression, stack.tag);
        }

        private static String modId(String id) {
            for (Mods mod : Mods.values()) {
                if (id.equals(mod.ID)) return "Mods." + mod.name() + ".ID";
            }
            return quote(id);
        }

        private static String withNBT(String expression, NBTTagCompound tag) throws IOException {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            CompressedStreamTools.writeCompressed(tag, bytes);
            String base64 = Base64.getEncoder()
                .encodeToString(bytes.toByteArray());
            List<String> chunks = new ArrayList<>();
            for (int i = 0; i < base64.length(); i += 16000) {
                chunks.add(quote(base64.substring(i, Math.min(i + 16000, base64.length()))));
            }
            // String.join 防止 javac 将超长 NBT 折叠成超过 65535 字节的常量。
            return "withNBT(" + expression + ", String.join(\"\", new String[] { " + String.join(", ", chunks) + " }))";
        }

        private static String eut(int value) {
            for (Field field : TierEU.class.getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getName()
                    .startsWith("RECIPE_")) {
                    try {
                        if (field.getLong(null) == value) return field.getName();
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
            return Integer.toString(value);
        }

        private static String duration(int ticks) {
            return ticks > 0 && ticks % 20 == 0 ? ticks / 20 + " * SECONDS" : Integer.toString(ticks);
        }

        private static String fluidAmount(int amount) {
            return amount > 0 && amount % 144 == 0 ? "144 * " + amount / 144 : Integer.toString(amount);
        }

        private static String outputName(GTRecipe recipe) {
            List<String> names = new ArrayList<>();
            for (ItemStack output : recipe.mOutputs) {
                if (output != null) names.add(output.getDisplayName());
            }
            for (FluidStack output : recipe.mFluidOutputs) {
                if (output != null) names.add(output.getLocalizedName());
            }
            return names.isEmpty() ? "No output" : String.join(", ", names);
        }

        private static String comment(String value) {
            // Java 在词法分析前处理 Unicode 转义，因此注释中的反斜杠也必须移除。
            return value.replace('\\', '/')
                .replace('\r', ' ')
                .replace('\n', ' ')
                .replace('\u2028', ' ')
                .replace('\u2029', ' ');
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
                        if (c < 32 || c == 127) result.append(String.format("\\%03o", (int) c));
                        else result.append(c);
                }
            }
            return result.append('"')
                .toString();
        }

        private static void writeSource(Path file, ItemStack held, String target, ExportData data) throws IOException {
            boolean useAssemblyLineMap = data.assemblyLine && (target.equals(machineRecipeName(held.getDisplayName()))
                || "AssemblyLineNormalRecipe".equals(target));
            try (BufferedWriter out = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
                out.write("package Recipes.Exported;\n\n");
                if (useAssemblyLineMap) {
                    out.write("import static Recipes.ChaosRecipes.ChaosRecipeMap.AssemblyLineNormalRecipe;\n");
                }
                for (Field field : TierEU.class.getFields()) {
                    String name = field.getName();
                    if (Modifier.isStatic(field.getModifiers()) && name.startsWith("RECIPE_")
                        && data.recipes.stream()
                            .anyMatch(code -> code.contains(".eut(" + name + ")"))) {
                        out.write("import static gregtech.api.enums.TierEU." + name + ";\n");
                    }
                }
                out.write(
                    "import static util.Utils.setStackSize;\n"
                        + "import static gregtech.api.util.GTModHandler.getModItem;\n"
                        + "import static gregtech.api.util.GTRecipeBuilder.SECONDS;\n\n"
                        + "import java.io.ByteArrayInputStream;\nimport java.io.IOException;\n"
                        + "import java.util.Base64;\nimport java.util.Collections;\n"
                        + "import net.minecraft.item.ItemStack;\nimport net.minecraft.nbt.CompressedStreamTools;\n"
                        + "import net.minecraft.nbt.NBTTagCompound;\nimport net.minecraftforge.fluids.FluidRegistry;\n"
                        + "import net.minecraftforge.fluids.FluidStack;\nimport gregtech.api.enums.GTValues;\n"
                        + "import gregtech.api.enums.Mods;\nimport gregtech.api.interfaces.IRecipeMap;\n"
                        + "import gregtech.api.recipe.RecipeMap;\nimport gregtech.api.util.GTRecipe;\n");
                if (data.enums != null) {
                    for (String type : data.enums.imports) out.write("import " + type + ";\n");
                }
                out.write(
                    "\n" + "// Machine: "
                        + comment(held.getDisplayName())
                        + "\n"
                        + "// Exported recipes: "
                        + data.recipes.size()
                        + "; incomplete entries/pages: "
                        + data.problems.size()
                        + "\n"
                        + "// Register once, during normal recipe loading, into your ordinary RecipeMap.\n"
                        + "// Special slots and ALL condition metadata (heat, research, gravity, etc.) are omitted.\n"
                        + "public final class ExportedRecipes {\n\n"
                        + "    private ExportedRecipes() {}\n\n");
                if (useAssemblyLineMap) {
                    out.write(
                        "    // Call once from GT Not Hard's recipe-loading phase to use its existing map.\n"
                            + "    public static void loadRecipes() {\n"
                            + "        register(AssemblyLineNormalRecipe);\n"
                            + "    }\n\n");
                }
                out.write(
                    "    public static void register(RecipeMap<?> targetMap) {\n"
                        + "        if (targetMap == null) throw new IllegalArgumentException(\"targetMap\");\n"
                        + "        // Build WithAlt directly: ordinary builder.build() discards alternative inputs.\n"
                        + "        // compileRecipe via add() also avoids restoring source-map condition validators.\n"
                        + "        IRecipeMap "
                        + target
                        + " = builder -> {\n"
                        + "            GTRecipe recipe = builder.forceOreDictInput().buildWithAlt()\n"
                        + "                .orElseThrow(() -> new IllegalStateException(\"Invalid exported recipe\"));\n"
                        + "            targetMap.add(recipe);\n"
                        + "            return Collections.singletonList(recipe);\n"
                        + "        };\n");
                int batches = (data.recipes.size() + RECIPES_PER_BATCH - 1) / RECIPES_PER_BATCH;
                for (int batch = 0; batch < batches; batch++) {
                    out.write("        Batch" + batch + ".register(" + target + ");\n");
                }
                out.write("    }\n");
                for (int batch = 0; batch < batches; batch++) {
                    int start = batch * RECIPES_PER_BATCH;
                    int end = Math.min(start + RECIPES_PER_BATCH, data.recipes.size());
                    out.write(
                        "\n    private static final class Batch" + batch
                            + " {\n"
                            + "        private static void register(IRecipeMap "
                            + target
                            + ") {\n");
                    for (int i = start; i < end; i++) out.write("            recipe" + i + "(" + target + ");\n");
                    out.write("        }\n");
                    for (int i = start; i < end; i++) {
                        out.write("\n        private static void recipe" + i + "(IRecipeMap " + target + ") {\n");
                        String recipe = data.recipes.get(i) + target + ");\n";
                        for (String line : recipe.split("\n")) out.write("            " + line + "\n");
                        out.write("        }\n");
                    }
                    out.write("    }\n");
                }
                out.write(
                    "\n    private static NBTTagCompound readNBT(String encoded) {\n"
                        + "        try {\n            return CompressedStreamTools.readCompressed(\n"
                        + "                new ByteArrayInputStream(Base64.getDecoder().decode(encoded)));\n"
                        + "        } catch (IOException e) {\n            throw new IllegalArgumentException(\"Invalid exported NBT\", e);\n"
                        + "        }\n    }\n"
                        + "\n    private static ItemStack withNBT(ItemStack stack, String encoded) {\n"
                        + "        stack.setTagCompound(readNBT(encoded));\n        return stack;\n    }\n"
                        + "\n    private static FluidStack withNBT(FluidStack stack, String encoded) {\n"
                        + "        stack.tag = readNBT(encoded);\n        return stack;\n    }\n}\n");
            }
        }

        private static void writeReport(Path file, ItemStack held, ExportData data) throws IOException {
            List<String> lines = new ArrayList<>();
            lines.add("机器：" + held.getDisplayName());
            lines.add("已导出：" + data.recipes.size() + " 条；匹配 NEI 页面：" + data.matchedHandlers);
            lines.add("指令：" + (data.enums == null ? "/ExportRecipe（原始获取方式）" : "/ExportRecipeEnum（优先引用 EnumList 变量）"));
            if (data.enums != null) {
                lines.add(
                    "EnumList 索引：" + data.enums.items.size() + " 个物品、" + data.enums.fluids.size() + " 个流体（同内容别名去重）。");
                lines.add("按注册名、元数据与 NBT 精确匹配，数量单独保留；变量先 copy()，未匹配项保持原获取方式。");
                if (data.enums.items.isEmpty() && data.enums.fluids.isEmpty()) {
                    lines.add("变量替换未完成：EnumList 索引为空，本次配方保留原获取方式。");
                }
                lines.addAll(data.enums.notes);
            }
            lines.add("范围：机器 catalyst 关联的 GT NEI 页面，包含普通及串行注册表，遵循 NEI 分类、隐藏和电压筛选。");
            lines.add("保留：输入输出的真实数量、零数量工具、替代原料/流体、概率、普通物品及流体 NBT、EU/t、原始 tick 耗时。");
            lines.add("省略：特殊槽、mSpecialValue、所有条件 metadata，包括炉温、研究闪存、重力、洁净室等。");
            lines.add("生成代码调用 Recipes.Exported.ExportedRecipes.register(普通RecipeMap)；该 Map 的容量应容纳所有输入输出。");
            lines.add("默认流水线导出还可调用 ExportedRecipes.loadRecipes()，直接写入 GT Not Hard 的 AssemblyLineNormalRecipe。");
            lines.add("这不会修改游戏现有配方，也不会改变原机器的硬编码运行校验。");
            lines.add("");
            lines.addAll(data.pages);
            lines.add("");
            lines.add(data.problems.isEmpty() ? "导出完整（上述范围内）。" : "以下内容未导出，请勿将本次结果视为完整导出：");
            lines.addAll(data.problems);
            Files.write(file, lines, StandardCharsets.UTF_8);
        }

        private static final class ExportData {

            private final EnumIndex enums;
            private final List<String> recipes = new ArrayList<>();
            private final List<String> pages = new ArrayList<>();
            private final List<String> problems = new ArrayList<>();
            private int matchedHandlers;
            private boolean assemblyLine;

            private ExportData(EnumIndex enums) {
                this.enums = enums;
            }
        }
    }
}
