package cn.lzj66.experiment.ex6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: Service
 * Package: cn.lzj66.experiment.ex6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/14 17:56
 */
//服务器端
public class Service {
    public static void main(String[] args) {
        ServerSocket serverForClient = null;
        Socket socketOnServer = null;
        DataOutputStream out = null;
        DataInputStream in = null;
        try {
            serverForClient = new ServerSocket(4331);
            socketOnServer = serverForClient.accept();
            System.out.println("客户的地址:" + socketOnServer.getInetAddress() + "\n" + "正在监听");
            out = new DataOutputStream(socketOnServer.getOutputStream());
            in = new DataInputStream(socketOnServer.getInputStream());
            String s = in.readUTF();
            //处理客户端数据
            String sum = sum(s);
            out.writeUTF(sum);
            Thread.sleep(1000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String sum(String str) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(str);
        double sum = 0D;
        while (matcher.find()) {
            sum += Double.parseDouble(matcher.group());
        }
        return str + "\n总额：" + sum + "元";
    }
}

//客户端
class Client {
    public static void main(String[] args) {
        Socket mysocket;
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入服务器的IP:");
        String houst = scanner.next();
        System.out.print("输入端口号:");
        int port = scanner.nextInt();
        System.out.print("输入账单：\n");
        String mess = new Scanner(System.in).nextLine();
        try {
            mysocket = new Socket(houst, port);
            DataInputStream in = new DataInputStream(mysocket.getInputStream());
            DataOutputStream out = new DataOutputStream(mysocket.getOutputStream());
            out.writeUTF(mess);
            String s = in.readUTF();
            System.out.println("您的账单：\n"+ s);
            Thread.sleep(1000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
