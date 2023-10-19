package cn.lzj66.algorithm;

import java.util.Scanner;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.algorithm
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/19 22:18
 */
public class Demo1 {
    static void yingzi(int n, StringBuffer s, String str) {
        for (int i = 2; i < n; ++i) {
            s.replace(0, s.length() , str);
            if (n % i == 0) {
                s.append((n / i) + "*");
                System.out.print(s + (i + " "));
                if (i > 3) yingzi(i, s, s.toString());
            }
        }
    }
    public static void main(String[] args){
        System.out.print("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n; ++i){
            if(n % i == 0){
                StringBuffer s = new StringBuffer(n+"="+(n/i)+"*");
                System.out.print(s+(i+" "));
                if(i>3)yingzi(i,s, s.toString());
                System.out.println();
            }
        }
    }
}
