package cn.lzj66.ep10;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep10
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/30 18:47
 */
public class Demo1 {
    public static void main(String[] args) {
        try{
            // 创建一个文件对象
            File file = new File("example.txt");
            new File("D:\\SJX","a"); //等价： new File("D:\\SJX\\a");
            // 判断文件是否存在
            if (file.exists()) {
                System.out.println("文件已存在");
            } else {
                // 创建新文件
                boolean created = file.createNewFile(); //返回true-文件创建成功;false-文件创建失败
            }
            //文件操作
            String absolutePath = file.getAbsolutePath();
            System.out.println("文件的绝对路径：" + absolutePath);
            if (file.isFile()) {
                System.out.println("这是一个文件");
            }
            String fileName = file.getName();
            System.out.println("文件名：" + fileName);
            long fileSize = file.length();
            System.out.println("文件大小：" + fileSize + "字节");

            //目录操作
            if (file.isDirectory()) {
                System.out.println("这是一个目录");
            }
            File directory = new File("exampleDir");
            boolean dirCreated = directory.mkdir();// 创建一个目录
            if (dirCreated) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录创建失败");
            }
            File[] files = directory.listFiles();// 获取目录下的文件列表
            if (files != null) {
                System.out.println("目录下的文件列表：");
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }
            //删除文件或目录
            boolean deleted = file.delete(); //delete方法只能删除文件和空目录，不能删除有文件的目录
            if (deleted) {System.out.println("文件删除成功");} else { System.out.println("文件删除失败");}
            del(file); //删除不为空的目录
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除不为空的目录
     * @param file
     */
    private static void del(File file) {
        if (!file.exists()) {
            return;
        }
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                del(f);
                continue;
            }
            f.delete();
        }
        file.delete();
    }
}
