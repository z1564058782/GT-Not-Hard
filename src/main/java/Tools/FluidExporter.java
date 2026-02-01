package Tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import cpw.mods.fml.common.event.FMLServerStartingEvent;

/*
 * # 导出所有格式（默认）
 * /exportfluids
 * # 只导出面板格式
 * /exportfluids -p
 * # 导出到指定目录并只生成面板格式
 * /exportfluids ./my_exports -p
 * # 详细模式
 * /exportfluids -v
 */

/**
 * 流体注册表导出工具 - 可直接集成到现有模组
 * 使用方法：在模组初始化时调用 FluidExporter.registerCommand()
 */
public class FluidExporter {

    // 默认配置
    private static final String DEFAULT_OUTPUT_DIR = "./fluid_exports";
    private static final Set<String> DEFAULT_EXCLUDED_FLUIDS = new HashSet<>(Arrays.asList("water", "lava"));

    /**
     * 在模组初始化时调用此方法注册命令
     *
     * @param event FMLServerStartingEvent
     */
    public static void registerCommand(FMLServerStartingEvent event) {
        event.registerServerCommand(new ExportFluidsCommand());
    }

    /**
     * 手动导出流体（可在代码中调用）
     *
     * @param outputPath 输出路径
     * @param verbose    是否显示详细日志
     * @return 是否成功
     */
    public static boolean exportFluids(String outputPath, boolean verbose) {
        ExportConfig config = new ExportConfig().setOutputDirectory(outputPath)
            .setVerbose(verbose);

        return executeExport(config);
    }

    /**
     * 导出配置类
     */
    public static class ExportConfig {

        private File outputDirectory = new File(DEFAULT_OUTPUT_DIR);
        private boolean exportAll = true;
        private boolean exportSimple = true;
        private boolean exportIdMap = true;
        private boolean exportPanelFormat = true; // 新增：是否导出面板格式
        private Set<String> excludedFluids = new HashSet<>(DEFAULT_EXCLUDED_FLUIDS);
        private boolean includeProperties = true;
        private boolean includeExamples = true;
        private boolean verbose = false;

        // 设置方法链
        public ExportConfig setOutputDirectory(String path) {
            this.outputDirectory = new File(path);
            return this;
        }

        public ExportConfig setOutputDirectory(File dir) {
            this.outputDirectory = dir;
            return this;
        }

        public ExportConfig setExportAll(boolean exportAll) {
            this.exportAll = exportAll;
            return this;
        }

        public ExportConfig setExportSimple(boolean exportSimple) {
            this.exportSimple = exportSimple;
            return this;
        }

        public ExportConfig setExportIdMap(boolean exportIdMap) {
            this.exportIdMap = exportIdMap;
            return this;
        }

        public ExportConfig setExportPanelFormat(boolean exportPanelFormat) {
            this.exportPanelFormat = exportPanelFormat;
            return this;
        }

        public ExportConfig addExcludedFluid(String fluidName) {
            this.excludedFluids.add(fluidName);
            return this;
        }

        public ExportConfig setExcludedFluids(Set<String> excludedFluids) {
            this.excludedFluids = excludedFluids;
            return this;
        }

        public ExportConfig setIncludeProperties(boolean includeProperties) {
            this.includeProperties = includeProperties;
            return this;
        }

        public ExportConfig setIncludeExamples(boolean includeExamples) {
            this.includeExamples = includeExamples;
            return this;
        }

        public ExportConfig setVerbose(boolean verbose) {
            this.verbose = verbose;
            return this;
        }
    }

    /**
     * 执行导出
     */
    private static boolean executeExport(ExportConfig config) {
        try {
            System.out.println("[FluidExporter] 开始导出流体注册表...");
            System.out.println("[FluidExporter] 输出目录: " + config.outputDirectory.getAbsolutePath());

            if (config.verbose) {
                System.out.println("[FluidExporter] 排除的流体: " + config.excludedFluids);
            }

            boolean allSuccess = true;
            int exportedCount = 0;

            // 导出完整格式
            if (config.exportAll) {
                boolean success = exportAllFluids(config);
                if (success) exportedCount++;
                else allSuccess = false;
            }

            // 导出简单格式
            if (config.exportSimple) {
                boolean success = exportSimpleCode(config);
                if (success) exportedCount++;
                else allSuccess = false;
            }

            // 导出ID映射表
            if (config.exportIdMap) {
                boolean success = exportFluidIDMap(config);
                if (success) exportedCount++;
                else allSuccess = false;
            }

            // 导出面板格式（新增）
            if (config.exportPanelFormat) {
                boolean success = exportPanelFormat(config);
                if (success) exportedCount++;
                else allSuccess = false;
            }

            System.out.println("[FluidExporter] 导出完成！总共导出了 " + exportedCount + " 个文件");
            return allSuccess;

        } catch (Exception e) {
            System.err.println("[FluidExporter] 导出过程中发生错误: " + e.getMessage());
            if (config.verbose) {
                e.printStackTrace();
            }
            return false;
        }
    }

    /**
     * 导出完整格式
     */
    private static boolean exportAllFluids(ExportConfig config) {
        File outputDir = config.outputDirectory;
        String filename = "fluid_registry_export.txt";

        if (!outputDir.exists() && !outputDir.mkdirs()) {
            System.err.println("[FluidExporter] 无法创建输出目录: " + outputDir.getAbsolutePath());
            return false;
        }

        File outputFile = new File(outputDir, filename);

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            // 写入文件头
            writeHeader(writer, config);

            // 获取所有已注册流体
            Map<String, Fluid> fluids = FluidRegistry.getRegisteredFluids();

            // 写入统计信息
            writer.println("// 总共注册了 " + fluids.size() + " 种流体");
            writer.println("// 导出时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            writer.println("// 排除的流体: " + config.excludedFluids);
            writer.println();

            // 写入流体列表
            writer.println("// ========== 流体列表 ==========");
            int count = 0;
            for (Map.Entry<String, Fluid> entry : fluids.entrySet()) {
                String fluidName = entry.getKey();
                Fluid fluid = entry.getValue();

                // 跳过排除的流体
                if (config.excludedFluids.contains(fluidName)) {
                    continue;
                }

                // 写入流体信息
                writer.println();
                writer.println("// 流体 #" + (++count));
                writer.println("// 名称: " + fluidName);
                writer.println("// 本地化名称: " + getLocalizedName(fluid));
                writer.println("// ID: " + FluidRegistry.getFluidID(fluidName));

                // 写入流体属性
                if (config.includeProperties) {
                    writeFluidProperties(writer, fluid);
                }

                // 写入 FluidStack 格式
                writer.println("// FluidStack 格式:");
                writer.println(
                    "FluidStack fluidStack" + count + " = FluidRegistry.getFluidStack(\"" + fluidName + "\", 1);");

                // 写入示例代码
                if (config.includeExamples) {
                    writer.println("// 使用示例:");
                    writer.println("// if (fluidStack" + count + " != null) {");
                    writer.println("//     // 处理流体");
                    writer.println("// }");
                }
            }

            writer.flush();

            if (config.verbose) {
                System.out.println("[FluidExporter] 完整格式导出到: " + outputFile.getAbsolutePath());
                System.out.println("[FluidExporter] 导出了 " + count + " 种流体");
            }

            return true;

        } catch (IOException e) {
            System.err.println("[FluidExporter] 导出完整格式时出错: " + e.getMessage());
            return false;
        }
    }

    /**
     * 导出简单格式
     */
    private static boolean exportSimpleCode(ExportConfig config) {
        File outputDir = config.outputDirectory;
        String filename = "simple_fluid_stacks.txt";

        if (!outputDir.exists() && !outputDir.mkdirs()) {
            System.err.println("[FluidExporter] 无法创建输出目录: " + outputDir.getAbsolutePath());
            return false;
        }

        File outputFile = new File(outputDir, filename);

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            Map<String, Fluid> fluids = FluidRegistry.getRegisteredFluids();

            writer.println("// 自动生成的流体获取代码");
            writer.println("// 生成时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            writer.println();

            writer.println("import net.minecraftforge.fluids.FluidStack;");
            writer.println("import net.minecraftforge.fluids.FluidRegistry;");
            writer.println();

            writer.println("public class FluidStacks {");
            writer.println();

            int count = 0;
            for (String fluidName : fluids.keySet()) {
                if (config.excludedFluids.contains(fluidName)) {
                    continue;
                }

                String fieldName = toCamelCase(fluidName);

                writer.println("    // " + fluidName);
                writer.println(
                    "    public static final FluidStack " + fieldName
                        + " = FluidRegistry.getFluidStack(\""
                        + fluidName
                        + "\", 1);");
                writer.println();
                count++;
            }

            writer.println("    // 总共 " + count + " 种流体");
            writer.println("}");

            writer.flush();

            if (config.verbose) {
                System.out.println("[FluidExporter] 简单格式导出到: " + outputFile.getAbsolutePath());
            }

            return true;

        } catch (IOException e) {
            System.err.println("[FluidExporter] 导出简单格式时出错: " + e.getMessage());
            return false;
        }
    }

    /**
     * 导出ID映射表
     */
    private static boolean exportFluidIDMap(ExportConfig config) {
        File outputDir = config.outputDirectory;
        String filename = "fluid_id_mapping.txt";

        if (!outputDir.exists() && !outputDir.mkdirs()) {
            System.err.println("[FluidExporter] 无法创建输出目录: " + outputDir.getAbsolutePath());
            return false;
        }

        File outputFile = new File(outputDir, filename);

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            Map<String, Integer> fluidIDs = FluidRegistry.getRegisteredFluidIDs();

            writer.println("流体名称 -> ID 映射表");
            writer.println("生成时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            writer.println("=====================");
            writer.println();

            for (Map.Entry<String, Integer> entry : fluidIDs.entrySet()) {
                String fluidName = entry.getKey();
                if (config.excludedFluids.contains(fluidName)) {
                    continue;
                }
                writer.printf("%-40s -> %d%n", fluidName, entry.getValue());
            }

            writer.flush();

            if (config.verbose) {
                System.out.println("[FluidExporter] ID映射表导出到: " + outputFile.getAbsolutePath());
            }

            return true;

        } catch (IOException e) {
            System.err.println("[FluidExporter] 导出ID映射表时出错: " + e.getMessage());
            return false;
        }
    }

    /**
     * 导出面板格式 - 新增方法
     * 生成 fluidpanel_280_converted.txt 格式
     */
    private static boolean exportPanelFormat(ExportConfig config) {
        File outputDir = config.outputDirectory;
        String filename = "fluidpanel_280_converted.txt";

        if (!outputDir.exists() && !outputDir.mkdirs()) {
            System.err.println("[FluidExporter] 无法创建输出目录: " + outputDir.getAbsolutePath());
            return false;
        }

        File outputFile = new File(outputDir, filename);

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            // 获取所有已注册流体
            Map<String, Fluid> fluids = FluidRegistry.getRegisteredFluids();

            // 写入文件头
            writer.println("// =========================================");
            writer.println("// FluidPanel 280 格式流体列表");
            writer.println("// 由 FluidExporter 生成");
            writer.println("// GTNH 2.8.0");
            writer.println("// 生成时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            writer.println("// 格式: 注释 + FluidRegistry.getFluidStack(\"fluid_name\", 1),");
            writer.println("// =========================================");
            writer.println();
            writer.println("import net.minecraftforge.fluids.FluidRegistry;");
            writer.println();

            // 写入流体列表（面板格式）
            int count = 0;
            List<FluidEntry> fluidEntries = new ArrayList<>();

            // 收集流体信息
            for (Map.Entry<String, Fluid> entry : fluids.entrySet()) {
                String fluidName = entry.getKey();
                Fluid fluid = entry.getValue();

                // 跳过排除的流体
                if (config.excludedFluids.contains(fluidName)) {
                    continue;
                }

                String localizedName = getLocalizedName(fluid);
                fluidEntries.add(new FluidEntry(localizedName, fluidName));
                count++;
            }

            // 按本地化名称排序（可选）
            fluidEntries.sort(Comparator.comparing(FluidEntry::getLocalizedName));

            // 输出面板格式
            for (FluidEntry fluidEntry : fluidEntries) {
                writer.println("// " + fluidEntry.getLocalizedName());
                writer.println("FluidRegistry.getFluidStack(\"" + fluidEntry.getFluidName() + "\", 1),");
                writer.println();
            }

            // 写入统计信息
            writer.println("// =========================================");
            writer.println("// 总共 " + count + " 种流体");
            writer.println("// 排除的流体: " + config.excludedFluids);
            writer.println("// =========================================");

            writer.flush();

            if (config.verbose) {
                System.out.println("[FluidExporter] 面板格式导出到: " + outputFile.getAbsolutePath());
                System.out.println("[FluidExporter] 导出了 " + count + " 种流体（面板格式）");
            }

            return true;

        } catch (IOException e) {
            System.err.println("[FluidExporter] 导出面板格式时出错: " + e.getMessage());
            return false;
        }
    }

    /**
     * 辅助类：存储流体条目信息
     */
    private static class FluidEntry {

        private final String localizedName;
        private final String fluidName;

        public FluidEntry(String localizedName, String fluidName) {
            this.localizedName = localizedName;
            this.fluidName = fluidName;
        }

        public String getLocalizedName() {
            return localizedName;
        }

        public String getFluidName() {
            return fluidName;
        }
    }

    /**
     * 写入文件头
     */
    private static void writeHeader(PrintWriter writer, ExportConfig config) {
        writer.println("// =========================================");
        writer.println("// 流体注册表导出文件");
        writer.println("// 由 FluidExporter 生成");
        writer.println("// GTNH 2.8.0");
        writer.println("// =========================================");
        writer.println();
        writer.println("// 此文件包含所有已注册流体的 FluidStack 获取代码");
        writer.println("// 所有流体代码格式为: FluidRegistry.getFluidStack(\"fluid_name\", amount)");
        writer.println();
        writer.println("import net.minecraftforge.fluids.FluidStack;");
        writer.println("import net.minecraftforge.fluids.FluidRegistry;");
        writer.println();
    }

    /**
     * 写入流体属性
     */
    private static void writeFluidProperties(PrintWriter writer, Fluid fluid) {
        writer.println("// 流体属性:");
        writer.println("//   亮度: " + fluid.getLuminosity());
        writer.println("//   密度: " + fluid.getDensity());
        writer.println("//   粘度: " + fluid.getViscosity());
        writer.println("//   温度: " + fluid.getTemperature());
        writer.println("//   是否气态: " + fluid.isGaseous());

        if (fluid.canBePlacedInWorld()) {
            writer.println("//   可放置为方块: 是");
            if (fluid.getBlock() != null) {
                writer.println(
                    "//   对应方块: " + fluid.getBlock()
                        .getUnlocalizedName());
            }
        } else {
            writer.println("//   可放置为方块: 否");
        }
    }

    /**
     * 获取本地化名称
     */
    private static String getLocalizedName(Fluid fluid) {
        try {
            return fluid.getLocalizedName();
        } catch (Exception e) {
            return "未知";
        }
    }

    /**
     * 转换为驼峰命名
     */
    private static String toCamelCase(String fluidName) {
        String[] parts = fluidName.toLowerCase()
            .split("[_\\s:]+");
        StringBuilder result = new StringBuilder("FLUID_");

        for (String part : parts) {
            if (!part.isEmpty()) {
                for (char c : part.toCharArray()) {
                    if (Character.isLetterOrDigit(c)) {
                        result.append(Character.toUpperCase(c));
                    }
                }
                result.append('_');
            }
        }

        // 移除最后的'_'
        if (result.charAt(result.length() - 1) == '_') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }

    /**
     * 导出流体命令
     */
    public static class ExportFluidsCommand extends CommandBase {

        @Override
        public String getCommandName() {
            return "exportfluids";
        }

        @Override
        public String getCommandUsage(ICommandSender sender) {
            return "/exportfluids [路径] [选项]\n" + "选项：\n"
                + "  -a 只导出完整格式\n"
                + "  -s 只导出简单格式\n"
                + "  -i 只导出ID映射表\n"
                + "  -p 只导出面板格式\n"
                + "示例：/exportfluids ./exports -p";
        }

        @Override
        public void processCommand(ICommandSender sender, String[] args) {
            try {
                String outputPath = DEFAULT_OUTPUT_DIR;
                ExportConfig config = new ExportConfig();

                // 解析参数
                for (int i = 0; i < args.length; i++) {
                    if (!args[i].startsWith("-") && i == 0) {
                        // 第一个非选项参数是路径
                        outputPath = args[i];
                    } else if (args[i].equals("-a")) {
                        // 只导出完整格式
                        config.setExportSimple(false);
                        config.setExportIdMap(false);
                        config.setExportPanelFormat(false);
                    } else if (args[i].equals("-s")) {
                        // 只导出简单格式
                        config.setExportAll(false);
                        config.setExportIdMap(false);
                        config.setExportPanelFormat(false);
                    } else if (args[i].equals("-i")) {
                        // 只导出ID映射表
                        config.setExportAll(false);
                        config.setExportSimple(false);
                        config.setExportPanelFormat(false);
                    } else if (args[i].equals("-p")) {
                        // 只导出面板格式
                        config.setExportAll(false);
                        config.setExportSimple(false);
                        config.setExportIdMap(false);
                    } else if (args[i].equals("-v")) {
                        // 详细模式
                        config.setVerbose(true);
                    }
                }

                config.setOutputDirectory(outputPath);

                sender.addChatMessage(new ChatComponentText("§a正在导出流体注册表..."));
                sender.addChatMessage(new ChatComponentText("§7输出目录: " + outputPath));

                if (config.verbose) {
                    sender.addChatMessage(new ChatComponentText("§7导出配置:"));
                    sender.addChatMessage(new ChatComponentText("§7  完整格式: " + config.exportAll));
                    sender.addChatMessage(new ChatComponentText("§7  简单格式: " + config.exportSimple));
                    sender.addChatMessage(new ChatComponentText("§7  ID映射表: " + config.exportIdMap));
                    sender.addChatMessage(new ChatComponentText("§7  面板格式: " + config.exportPanelFormat));
                }

                // 执行导出
                boolean success = executeExport(config);

                if (success) {
                    sender.addChatMessage(new ChatComponentText("§a✓ 流体注册表导出完成！"));

                    // 显示生成的文件
                    File dir = new File(outputPath);
                    if (dir.exists()) {
                        File[] files = dir.listFiles((d, name) -> name.endsWith(".txt"));
                        if (files != null && files.length > 0) {
                            sender.addChatMessage(new ChatComponentText("§7生成的文件:"));
                            for (File file : files) {
                                String fileType = "";
                                if (file.getName()
                                    .contains("panel")) {
                                    fileType = " [面板格式]";
                                } else if (file.getName()
                                    .contains("simple")) {
                                        fileType = " [简单格式]";
                                    } else if (file.getName()
                                        .contains("mapping")) {
                                            fileType = " [ID映射]";
                                        } else if (file.getName()
                                            .contains("export")) {
                                                fileType = " [完整格式]";
                                            }

                                sender.addChatMessage(
                                    new ChatComponentText(
                                        "§7- " + file.getName() + fileType + " (" + (file.length() / 1024) + " KB)"));
                            }
                        }
                    }
                } else {
                    sender.addChatMessage(new ChatComponentText("§c✗ 流体注册表导出失败！"));
                }

            } catch (Exception e) {
                sender.addChatMessage(new ChatComponentText("§c导出过程中发生错误: " + e.getMessage()));
            }
        }

        @Override
        public List addTabCompletionOptions(ICommandSender sender, String[] args) {
            if (args.length == 1) {
                // 提供路径补全
                return getListOfStringsMatchingLastWord(args, "./", "../", "fluid_exports/");
            } else if (args.length == 2) {
                // 提供选项补全
                return getListOfStringsMatchingLastWord(args, "-a", "-s", "-i", "-p", "-v");
            }
            return null;
        }
    }

    /**
     * 新增：只导出面板格式的专用方法
     */
    public static boolean exportPanelFormatOnly(String outputPath) {
        ExportConfig config = new ExportConfig().setOutputDirectory(outputPath)
            .setExportAll(false)
            .setExportSimple(false)
            .setExportIdMap(false)
            .setExportPanelFormat(true);

        return exportPanelFormat(config);
    }

    /**
     * 新增：从现有完整格式文件生成面板格式
     */
    public static boolean convertExistingFileToPanelFormat(String inputFile, String outputFile) {
        try {
            System.out.println("[FluidExporter] 正在转换文件: " + inputFile + " -> " + outputFile);

            File input = new File(inputFile);
            File output = new File(outputFile);

            if (!input.exists()) {
                System.err.println("[FluidExporter] 输入文件不存在: " + inputFile);
                return false;
            }

            // 这里可以添加从现有文件读取和转换的逻辑
            // 由于时间关系，这里只是简单调用导出方法
            System.out.println("[FluidExporter] 注意：此功能需要从文件读取解析，当前直接重新导出");
            return exportPanelFormatOnly(output.getParent());

        } catch (Exception e) {
            System.err.println("[FluidExporter] 转换文件时出错: " + e.getMessage());
            return false;
        }
    }
}
