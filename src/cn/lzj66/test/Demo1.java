package cn.lzj66.test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.test
 * Description:
 * D:\图片
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/7 16:24
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.dingtalk.com/dingtalk.exe");
            InputStream input = url.openStream();
            // 定义一个文件输出流，用于将输入流中的数据写入到文件中
            FileOutputStream output = new FileOutputStream("D:\\dingtalk.exe");
            // 将输入流中的数据写入到输出流中
            byte[] data = new byte[10240];
            int length = -1;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
            // 关闭输入流和输出流
            input.close();
            output.close();
            System.out.println("软件下载完毕");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        try (FileInputStream inputStream = new FileInputStream("D:\\图片\\huawei1111.jpg");
//             FileOutputStream outputStream = new FileOutputStream("D:\\图片\\copyhuawei1111.jpg");) {
//            byte[] data = new byte[10240];
//            int count = -1;
//            while ((count = inputStream.read(data)) != -1) {
//                outputStream.write(data, 0, count);
//            }
//            System.out.println("文件复制完毕");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        permanentlyDelete(new File("D:\\\\图片\\\\copyhuawei1111.jpg"));
//        StringArraySort();
//    }

    public static void permanentlyDelete(File file) {
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    permanentlyDelete(subFile);
                }
            }
        }
    }

    public static void StringArraySort() {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "12", "6", "24", "38", "8", "42");
        list = list.stream().sorted(Comparator.comparing(Integer::parseInt)).collect(Collectors.toList());
        list = list.stream().sorted(Comparator.comparing((str) -> Integer.parseInt(str))).collect(Collectors.toList());
        list = list.stream().sorted(Comparator.comparing(Integer::parseInt, Collections.reverseOrder())).collect(Collectors.toList());
        System.out.println(list);
    }

}
