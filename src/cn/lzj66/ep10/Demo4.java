package cn.lzj66.ep10;

import java.io.*;

/**
 * ClassName: Demo4
 * Package: cn.lzj66.ep10
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/2 10:36
 */
public class Demo4 {
    public static void main(String[] args) {
        try {
            // 创建BufferedReader对象读取文件
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            // 创建BufferedWriter对象写入文件
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            // 逐行读取文件内容并写入输出文件
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            // 关闭流
            reader.close();
            writer.close();
            System.out.println("文件复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
