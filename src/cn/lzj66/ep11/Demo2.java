package cn.lzj66.ep11;

/**
 * ClassName: Service
 * Package: cn.lzj66.ep11
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/2 12:26
 */
public class Demo2 {
    public static void main(String[] args) {
        SpeakHello speakHello = new SpeakHello();// 创建线程1
        SpeakName speakName = new SpeakName(); //创建线程2
        speakHello.start(); //运行线程1
        speakName.start(); //运行线程2
        //主线程
        for (int i = 0; i < 10; i++) {
            System.out.println("mainmain   "+i);
        }
    }

}
class SpeakName extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("NameName  "+i);
        }
    }
}
class SpeakHello extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloHello  "+i);
        }
    }
}
