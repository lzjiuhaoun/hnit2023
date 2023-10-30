package cn.lzj66.experiment.ex5;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: cn.lzj66.experiment.ex4
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/31 14:09
 */
public class Main {
    public static void main(String[] args) {
        Integer count = 0;

    }
}

class Display extends Thread {
    public void run() {
        for (int i = 'a'; i < 'z'; ++i) {
            System.out.println("显示的字符：" + i);
        }
    }
}

class Input implements Runnable {
    private char in;

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        this.in = scanner.next().charAt(0);
    }
}
