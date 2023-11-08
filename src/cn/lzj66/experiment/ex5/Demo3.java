package cn.lzj66.experiment.ex5;

import java.util.Scanner;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.experiment.ex5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/8 22:56
 */
public class Demo3 {
    public static Integer score = 0; // 初始化分数
    public static Character ch; // 存储每轮显示的字符

    public static void main(String[] args) {
        // 创建一个新的 Scanner 对象来读取命令行输入
        Scanner scanner = new Scanner(System.in);

        // 创建一个对象作为同步锁
        Object lock = new Object();

        System.out.println("键盘练习，输入#结束练习");
        System.out.println("输入显示的字符(回车)");

        // 创建并启动第一个线程，该线程负责生成字母
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                for (char c = 'a'; c <= 'z'; c++) {
                    System.out.println("显示的字符是: " + c);
                    ch = c;
                    try {
                        // 唤醒在此对象监视器上等待的单个线程，即第二个线程
                        lock.notify();
                        // 等待直到第二个线程调用 notify()
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();

        // 创建并启动第二个线程，该线程负责读取命令行输入
        Thread thread2 = new Thread(() -> {
            while (scanner.hasNext()) {
                String input = scanner.next();
                synchronized (lock) {
                    if (input.equals("#")) {
                        System.out.println("练习结束，您的最终分数是: " + score);
                        System.exit(0);
                    }
                    if (input.length() == 1 && input.charAt(0) == ch) {
                        score++;
                        System.out.println("恭喜你，输入正确！当前分数: " + score);
                    } else {
                        System.out.println("很遗憾，输入错误。当前分数: " + score);
                    }
                    // 唤醒在此对象监视器上等待的单个线程，即第一个线程
                    lock.notify();
                }
            }
        });
        thread2.start();
    }
}
