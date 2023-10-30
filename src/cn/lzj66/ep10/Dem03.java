package cn.lzj66.ep10;

import java.io.*;

/**
 * ClassName: Dem03
 * Package: cn.lzj66.ep10
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/30 20:01
 */
public class Dem03 {
    public static void main(String[] args) {
        try (FileWriter out = new FileWriter("out.txt", true); //输出流
             FileReader in = new FileReader("input.txt"); //输入流
        ) {
            File sourceFile = new File("a.txt");
            File targetFile = new File("a.txt");
            char[] chars = new char[1024];
            int count = -1;
            while ((count = in.read(chars)) != -1) {
                out.write(chars, 0, count);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
