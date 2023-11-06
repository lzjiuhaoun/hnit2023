package cn.lzj66.ep12;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep12
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/6 16:37
 */
public class Demo1 {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://hais.oss-cn-shenzhen.aliyuncs.com/welcome.jpg?Expires=1699261311&OSSAccessKeyId=TMP.3KgZNQAENuzCwdnGgXaSagRjVeBcnxqQQnCVurzrrRLVU7qdaqW9u7W44xiVKsTixDF34ex8u7HeoHbfNoTuAUjnpYBdFL&Signature=DjkPRFDI41zdW2wKK7vRd1GKplY%3D&response-content-type=application%2Foctet-stream");
            InputStream input = url.openStream();
            // 定义一个文件输出流，用于将输入流中的数据写入到文件中
            FileOutputStream output = new FileOutputStream("downloaded.jpg");
            // 将输入流中的数据写入到输出流中
            byte[] data = new byte[1024];
            int length = -1;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
            // 关闭输入流和输出流
            input.close();
            output.close();
            System.out.println("资源下载完毕");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
