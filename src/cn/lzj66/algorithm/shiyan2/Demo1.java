package cn.lzj66.algorithm.shiyan2;

import java.util.Scanner;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.algorithm.shiyan2
 * Description:递归与分治2
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/29 15:45
 */
public class Demo1 {
    public static void main(String[] args) {
        greatestCommonDivisor();
        reverseOrder();
        bounceBack();
        recursion();
        age();
        graphics();

    }

    public static Scanner scanner = new Scanner(System.in);

    public static void greatestCommonDivisor() {
        System.out.println("请输入两个正整数:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        gcd(n, m);
    }

    public static void gcd(int n, int m) {
        int t;
        System.out.print("gcd(" + n + "," + m + ") ");
        if (n < m) {
            gcd(m, n);
            return;
        }
        if (n % m == 0) {
            System.out.println(m);
            return;
        }
        gcd(m, n % m);
    }


    public static void reverseOrder() {
        System.out.println("输入一个正整数(逆序输出):");
        int n = scanner.nextInt();
        reverse(n);
        System.out.println();
    }

    public static void reverse(int n) {
        if (n <= 0) return;
        System.out.print(n % 10);
        reverse(n / 10);
    }

    public static void bounceBack() {
        System.out.println("共经过:" + heigth(100, 10) + "米");
    }

    public static double heigth(double h, int n) {
        if (n <= 1) {
            System.out.println("最后一次反弹：" + h / 2 + "米");
            return h;
        }
        return h + h / 2 + heigth(h / 2, n - 1);
    }

    public static void recursion() {
        System.out.println("请输入包含若干行数据，其中每行4个整数:");
        int[] a = new int[40];
        for (int p = 0; ; p++) {
            int n = scanner.nextInt();
            a[p] = n;
            if (n == -1)
                break;
        }
        for (int i = 0; a[4 + 4 * i] != -1; i++)
            System.out.println(fn(a[0 + 4 * i], a[1 + 4 * i], a[2 + 4 * i], a[3 + 4 * i]));
        System.out.println(fn(2, 2, 1, 1));
    }

    public static int fn(int n, int f1, int a, int b) {
        if (n == 1) return f1;
        return a * fn(n - 1, f1, a, b) + b;

    }

    public static void age() {
        System.out.println("请输入人的位置:");
        int n = scanner.nextInt();
        System.out.println("第 " + n + " 个人的年龄为： " + age(n));
    }

    public static int age(int n) {
        if (n == 1) return 10;
        return 2 + age(n - 1);
    }

    public static char[][] maps = new char[200][200];

    public static void graphics() {

        System.out.println("输入若干个度值，每行给出一个不大于7的正整数:");

        int[] a = new int[10];

        int i = 0, j, n, p;

        for (p = 0; ; p++) {
            n = scanner.nextInt();
            a[p] = n;
            if (n == -1)
                break;
        }
        for (p = 0; ; p++) {
            if (a[p] != -1) {
                int size = (int) Math.pow(3, a[p] - 1);
                for (i = 0; i < size; i++) {
                    for (j = 0; j < size; j++) {
                        maps[i][j] = ' ';
                        maps[i][size] = '\0';
                    }
                }
                print(a[p], 0, 0);
                for (i = 0; i < size; i++)
                    System.out.println(maps[i]);
                System.out.println("_");
            } else return;
        }
    }


    public static void print(int n, int x, int y) {
        if (n == 1) {
            maps[x][y] = 'X';
        } else {
            int m = (int) Math.pow(3, n - 2);
            print(n - 1, x, y);
            print(n - 1, x + 2 * m, y);
            print(n - 1, x + m, y + m);
            print(n - 1, x, y + 2 * m);
            print(n - 1, x + 2 * m, y + 2 * m);
        }
    }

}
