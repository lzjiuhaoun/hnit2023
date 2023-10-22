package cn.lzj66.algorithm.shiyan1;

import java.util.Scanner;

/**
 * ClassName: Demo2
 * Package: cn.lzj66.algorithm.shiyan1
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/22 18:48
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.print("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        inSum(n, n, new StringBuilder());
    }

    public static void inSum(int n, int m, StringBuilder sb) {
        if (n == 1 || m == 1) {
            for (int i = 0; i < n - 1; ++i) {
                sb.append("1+");
            }
            sb.append("1");
            System.out.println(sb);
            return;
        } else if (m > n) {
            inSum(n, n, sb);
            return;
        } else if (n == m) {
            System.out.println(sb.toString() + n);
            inSum(n, m - 1, sb);
            return;
        }
        inSum(n - m, m, new StringBuilder(sb).append(m).append("+"));
        inSum(n, m - 1, sb);
    }
}
