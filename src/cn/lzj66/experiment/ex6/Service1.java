package cn.lzj66.experiment.ex6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Service1
 * Package: cn.lzj66.experiment.ex6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/14 19:01
 */
//服务器
public class Service1 {
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
            int random = new Random().nextInt(100) + 1;
            while (true) {
                String guess = in.readUTF();
                int guessNumber = Integer.parseInt(guess);
                if (guessNumber > random) {
                    out.writeUTF(guessNumber+",猜大了");
                } else if (guessNumber < random) {
                    out.writeUTF(guessNumber+",猜小了");
                } else {
                    out.writeUTF(guessNumber+"===猜对了");
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//客户端
class Client1 {
    public static void main(String[] args) {
        Socket mysocket;
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入服务器的IP:");
        String houst = scanner.next();
        System.out.print("输入端口号:");
        int port = scanner.nextInt();
        System.out.println("给你一个1至100之间的随机数，猜猜它是多少啊!");

        try {
            mysocket = new Socket(houst, port);
            DataInputStream in = new DataInputStream(mysocket.getInputStream());
            DataOutputStream out = new DataOutputStream(mysocket.getOutputStream());
            while (true) {
                System.out.print("好的，我输入猜测：");
                String mess = new Scanner(System.in).next();
                out.writeUTF(mess);
                String response = in.readUTF();
                System.out.println(response);
                if (response.equals("猜对了")) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
