package cn.lzj66.ep10;

import java.io.*;

/**
 * ClassName: Service
 * Package: cn.lzj66.ep10
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/30 19:18
 */
public class Demo2 {
    public static void main(String[] args) {
        try (    //将需要手动关闭的资源放入try()中，jvm会自动关闭此资源
                 // 创建一个文件字节输入流
                 FileInputStream inputStream = new FileInputStream("input.txt");
        ) {
            // 创建一个文件字节输出流
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            // 读取文件内容并写入到输出文件
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            // 关闭输入输出流
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}