package cn.lzj66.ep12;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: Service
 * Package: cn.lzj66.ep12
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/6 17:05
 */
// 服务端类
public class Service {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2066); //【服务端套接字】服务器监听 2066端口
            System.out.println("服务器启动成功，监听端口2066....");
            Socket socket = serverSocket.accept();
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            System.out.println("服务器端接收到请求：" + in.readUTF()); //阻塞状态，服务器读取请求
            out.writeUTF("me too"); //服务器发送响应
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("客户已断开" + e);
        }

    }
}

//客户端
class Client {
    public static void main(String[] args) {
        try {
            Socket mysocket = new Socket("127.0.0.1", 2066); //【客户端套接字】客户端向 127.0.0.1:2066的服务器发生请求
            DataInputStream in = new DataInputStream(mysocket.getInputStream());
            DataOutputStream out = new DataOutputStream(mysocket.getOutputStream());
            out.writeUTF("Nice to meet you"); //请求数据
            System.out.println("客户端接收到响应：" + in.readUTF()); //读取服务器的响应数据
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("服务器已断开" + e);
        }
    }
}
