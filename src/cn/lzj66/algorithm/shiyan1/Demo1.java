package cn.lzj66.algorithm.shiyan1;

import java.util.Scanner;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.algorithm.shiyan1
 * Description:
 * 注意:以下算法要求使用函数实现，都放到一个程序文件里面。
 * 即只使用使用一个main函数
 * 1.整数因子分解问题
 * 问题描述:于1的正整数n可以分解成为n=x1*x2*x3:··*xn
 * 例如，当n=12时，共有8种不同的分解式12=12*1
 * 12-6*2
 * 12=4*3
 * 12=3*4   12=3x2x2
 * 12= 2*6  12=2*3*2 12=2*2*3
 * 输入n，输出n的整数因子分解具体形式
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/22 18:22
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println("请输入大于1的正整数");
            return;
        }
        StringBuffer s = new StringBuffer();
        for (int i = 1; i < n; ++i) {
            if (n % i == 0) {
                s.replace(0, s.length(), n + "=" + (n / i) + "*");
                System.out.print(s + (i + "\t"));
                if (i > 3) printFactors(i, s, s.toString());
                System.out.println();
            }
        }
    }

    public static void printFactors(int n, StringBuffer s, String str) {
        for (int i = 2; i < n; ++i) {
            s.replace(0, s.length(), str);
            if (n % i == 0) {
                s.append((n / i)).append("*");
                System.out.print(s + (i + "\t"));
                if (i > 3) printFactors(i, s, s.toString());
            }
        }
    }
}
