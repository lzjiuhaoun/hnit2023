package cn.lzj66.algorithm.shiyan2;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: cn.lzj66.algorithm.shiyan2
 * Description:算法实验2
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/26 20:26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入要运行的程序(1-6)，或输入-1退出：");
            int choice = scanner.nextInt();

            if (choice == -1) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("请输入两个正整数 m 和 n:");
                    int m = scanner.nextInt();
                    int n = scanner.nextInt();
                    int result = gcd(m, n);
                    System.out.println("最大公约数: " + result);
                    break;

                case 2:
                    System.out.println("请输入一个正整数 n:");
                    int num = scanner.nextInt();
                    System.out.println("逆序输出整数:");
                    reverse(num);
                    System.out.println();
                    break;

                case 3:
                    int times = 10;
                    double[] distances = ballDrop(100, times);
                    System.out.println("第10次落地总距离: " + distances[0] + " 米");
                    System.out.println("第10次反弹高度: " + distances[1] + " 米");
                    break;

                case 4:
                    System.out.println("请输入 n, f1, a, b:");
                    int nVal = scanner.nextInt();
                    int f1Val = scanner.nextInt();
                    int aVal = scanner.nextInt();
                    int bVal = scanner.nextInt();
                    int sequenceResult = recursiveSequence(nVal, f1Val, aVal, bVal);
                    System.out.println("fn: " + sequenceResult);
                    break;

                case 5:
                    System.out.println("请输入一个整数 n:");
                    int nAge = scanner.nextInt();
                    int age = findAge(nAge);
                    System.out.println("Number " + nAge + " is " + age + " age!");
                    break;

                case 6:
                    System.out.println("请输入盒状分形的度 n:");
                    int nFractal = scanner.nextInt();
                    drawFractal(nFractal);
                    break;

                default:
                    System.out.println("无效选择，请重新输入.");
            }
        }
    }

    // 求最大公约数
    public static int gcd(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    // 递归实现逆序输出整数
    public static void reverse(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }

    // 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
    public static double[] ballDrop(double height, int times) {
        double[] distances = new double[2];
        double totalDistance = height;
        for (int i = 1; i <= times; i++) {
            totalDistance += height * 2;
            height /= 2;
        }
        distances[0] = totalDistance;
        distances[1] = height;
        return distances;
    }

    // 递归递推
    public static int recursiveSequence(int n, int f1, int a, int b) {
        if (n == 1) {
            return f1;
        } else {
            return a * recursiveSequence(n - 1, f1, a, b) + b;
        }
    }

    // 递归求年龄
    public static int findAge(int n) {
        if (n == 1) {
            return 10;
        } else {
            return findAge(n - 1) + 2;
        }
    }

    // 分形的递归输出
    public static void drawFractal(int n) {
        String[] fractal = generateFractal(n);
        for (String line : fractal) {
            System.out.println(line);
        }
    }

    public static String[] generateFractal(int n) {
        if (n == 0) {
            return new String[]{"X"};
        } else {
            String[] smaller = generateFractal(n - 1);
            String[] result = new String[smaller.length * 2 + 1];
            for (int i = 0; i < smaller.length; i++) {
                result[i] = smaller[i] + smaller[i];
            }
            result[smaller.length] = "-";
            for (int i = 0; i < smaller.length; i++) {
                result[i + smaller.length + 1] = smaller[i] + " ".repeat(smaller[i].length()) + smaller[i];
            }
            return result;
        }
    }
}

