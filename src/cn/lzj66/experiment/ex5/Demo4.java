package cn.lzj66.experiment.ex5;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Demo4
 * Package: cn.lzj66.experiment.ex5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/8 23:41
 */
public class Demo4 {
    public static Integer random = null; //随机数
    public static Integer count = 0; //猜测次数
    public static Integer inPut = null; //用户输入的数

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object lock = new Object();
        System.out.println("随机给你一个0至100之间的整数，猜猜是多少");
        //线程1负责给出随机数，并校验
        Thread th1 = new Thread(() -> {
            synchronized (lock) {
                while (true) {
                    if (random == null) {
                        random = new Random().nextInt(11);
                    } else if (inPut == random) {
                        System.out.println("恭喜你猜对了");
                        System.exit(0);
                    } else if (inPut < random) {
                        System.out.println("你猜小了");
                    } else {
                        System.out.println("你猜大了");
                    }
                    try {
                        //唤醒在此对象监视器上等待的单个线程，即第二个线程
                        lock.notify();
                        //等待直到第二个线程调用 notify() 唤醒第一个线程
                        lock.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        th1.start();
        //第二个线程，负责输入数据
        Thread th2 = new Thread(() -> {
            while (scanner.hasNext()) {
                synchronized (lock) {
                    ++count;
                    inPut = scanner.nextInt();
                    System.out.println("我第" + count + "次猜的数字是：" + inPut);
                    lock.notify();
                }

            }
        });
        th2.start();
    }
}


