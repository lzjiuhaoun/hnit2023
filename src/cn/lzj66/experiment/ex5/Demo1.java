package cn.lzj66.experiment.ex5;

import java.util.Scanner;

/**
 * Classcode: Demo1
 * Package: cn.lzj66.experiment.ex4
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/31 14:05
 */
public class Demo1 {
    static char out = ' ';
    static char in = ' ';

    public static void main(String[] args) {
        XianShiChar xianShiChar = new XianShiChar();
        ShuruChar shuruChar = new ShuruChar();

        int count = 1;
        System.out.println("键盘练习（输入#结束程序）");
        System.out.println("输入显示的字母（回车）");

        while (in != '#') {
            try {
                xianShiChar.start();
                shuruChar.start();
                xianShiChar.wait();
                shuruChar.wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (in == out) {
                    System.out.println("输入对了，目前分数" + (++count));
                } else {
                    System.out.println("输入错了，目前分数" + count);
                }




        }
    }
}

class XianShiChar extends Thread {
    char outChar;

    @Override
    public void run() {
        for (int i = 'a'; i <= 'z'; ++i) {
            outChar = (char) i;
            System.out.println("显示的字符:" + outChar);
        }
    }
}

class ShuruChar extends Thread {
    char inputChar;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        inputChar = scanner.next().charAt(0);
    }
}

