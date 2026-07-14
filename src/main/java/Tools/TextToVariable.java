package Tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 文本转变量声明工具类
 * 功能：将特定格式的文本内容转换为变量声明格式
 * 输入格式：// "VariableName" \n getModItem(Minecraft.ID, "item_id", 1L),
 * 输出格式：VariableName = getModItem(Minecraft.ID, "item_id", 1L);
 *
 * @author GTNH Tools
 * @version 1.0
 */
public class TextToVariable {

    /**
     * 输入文件路径配置
     * 可手动修改此变量以指定输入文件的路径
     */
    private static final String INPUT_FILE_PATH = "src/main/resources/Tools_OutputFile/itempanel_290_Misc_converted.txt";

    /**
     * 输出文件路径配置
     * 可手动修改此变量以指定输出文件的路径
     */
    private static final String OUTPUT_FILE_PATH = "src/main/resources/VariableResult/itempanel_290_Misc_Variable.txt";

    /**
     * 执行文本转换任务
     * 读取输入文件，转换内容，写入输出文件
     *
     * @throws IOException 文件读写异常
     */
    public void convert() throws IOException {
        // 检查输入文件是否存在
        File inputFile = new File(INPUT_FILE_PATH);
        if (!inputFile.exists() || !inputFile.isFile()) {
            throw new IOException("输入文件不存在或不是有效文件: " + INPUT_FILE_PATH);
        }

        // 读取输入文件内容
        List<String> lines = readLines(INPUT_FILE_PATH);

        // 转换每一行内容
        List<String> convertedLines = convertLines(lines);

        // 确保输出目录存在
        File outputFile = new File(OUTPUT_FILE_PATH);
        File parentDir = outputFile.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            boolean created = parentDir.mkdirs();
            if (!created) {
                throw new IOException("无法创建输出目录: " + parentDir.getAbsolutePath());
            }
        }

        // 写入转换后的内容到输出文件
        writeLines(OUTPUT_FILE_PATH, convertedLines);

        // 输出转换完成信息
        System.out.println("转换完成！共处理 " + convertedLines.size() + " 行");
        System.out.println("输入文件: " + INPUT_FILE_PATH);
        System.out.println("输出文件: " + OUTPUT_FILE_PATH);
    }

    /**
     * 从文件读取所有行
     *
     * @param filePath 文件路径
     * @return 字符串列表，每行作为一个元素
     * @throws IOException 文件读取异常
     */
    private List<String> readLines(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    /**
     * 转换行列表内容
     * 将两行一组（注释行 + 代码行）转换为一行的变量声明
     *
     * @param lines 原始行列表
     * @return 转换后的行列表
     */
    private List<String> convertLines(List<String> lines) {
        List<String> convertedLines = new ArrayList<>();

        // 遍历行，每次处理两行（注释行 + 代码行）
        for (int i = 0; i < lines.size(); i++) {
            // 获取当前行并去除前后空格
            String line = lines.get(i).trim();

            // 跳过空行
            if (line.isEmpty()) {
                continue;
            }

            // 检查是否为注释行（以 "//" 开头）
            if (line.startsWith("//")) {
                // 提取变量名：从 "// " 和 "" 之间提取
                String variableName = extractVariableName(line);

                // 检查是否有下一行（代码行）
                if (i + 1 < lines.size()) {
                    String nextLine = lines.get(i + 1).trim();

                    // 如果下一行是代码行（以 "getModItem" 开头或包含 "getModItem"）
                    if (nextLine.contains("getModItem")) {
                        // 提取并处理代码行
                        String processedCodeLine = processCodeLine(nextLine);

                        // 组合成变量声明行
                        String convertedLine = "public static final ItemStack " + variableName + " = " + processedCodeLine;
                        convertedLines.add(convertedLine);

                        // 跳过已处理的代码行
                        i++;
                    } else {
                        // 如果下一行不是代码行，只添加注释行本身（保留原始格式）
                        convertedLines.add(line);
                    }
                } else {
                    // 如果是最后一行且为注释行，保留原样
                    convertedLines.add(line);
                }
            } else {
                // 非注释行，保留原样（可能是单独的代码行或其他内容）
                convertedLines.add(line);
            }
        }

        return convertedLines;
    }

    /**
     * 从注释行提取变量名
     * 格式示例：// "Gunpowder" -> Gunpowder
     *
     * @param commentLine 注释行字符串
     * @return 提取的变量名
     */
    private String extractVariableName(String commentLine) {
        // 查找第一个双引号的位置
        int firstQuote = commentLine.indexOf("\"");
        if (firstQuote == -1) {
            // 如果没有找到双引号，返回处理后的注释内容（去除 "// " 前缀）
            return commentLine.replace("// ", "").trim();
        }

        // 查找第二个双引号的位置
        int secondQuote = commentLine.indexOf("\"", firstQuote + 1);
        if (secondQuote == -1) {
            // 如果没有找到第二个双引号，返回第一个双引号之后的内容
            return commentLine.substring(firstQuote + 1).trim();
        }

        // 提取双引号之间的内容作为变量名
        String variableName = commentLine.substring(firstQuote + 1, secondQuote);

        // 将变量名中的空格替换为下划线
        variableName = variableName.replace(" ", "_");

        return variableName;
    }

    /**
     * 处理代码行：移除末尾的逗号，并确保以分号结尾
     * 格式示例：getModItem(Minecraft.ID, "gunpowder", 1L), -> getModItem(Minecraft.ID, "gunpowder", 1L);
     *
     * @param codeLine 原始代码行
     * @return 处理后的代码行
     */
    private String processCodeLine(String codeLine) {
        // 去除前后空格
        String processed = codeLine.trim();

        // 移除末尾的逗号（如果存在）
        if (processed.endsWith(",")) {
            processed = processed.substring(0, processed.length() - 1);
        }

        // 确保以分号结尾
        if (!processed.endsWith(";")) {
            processed = processed + ";";
        }

        return processed;
    }

    /**
     * 将行列表写入文件
     *
     * @param filePath 输出文件路径
     * @param lines 要写入的行列表
     * @throws IOException 文件写入异常
     */
    private void writeLines(String filePath, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    /**
     * 主方法 - 程序入口
     * 执行文本转变量声明的转换任务
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        try {
            // 创建转换器实例并执行转换
            TextToVariable converter = new TextToVariable();
            converter.convert();

        } catch (IOException e) {
            // 捕获并打印文件操作异常
            System.err.println("转换过程中发生错误: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // 捕获其他未预期的异常
            System.err.println("发生未预期的错误: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
