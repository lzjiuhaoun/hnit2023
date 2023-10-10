package cn.lzj66.experiment;


import java.util.Scanner;

/**
 * ClassName: Ex1_Demo1
 * Package: cn.lzj66.experiment
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/10 15:56
 */
public class Ex1_Demo1 {
    public static void main(String[] args) {
        //实验题二测试
        isNum();
        //实验三测试
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        reversal(arr);

    }

    /**
     * 实验题二
     */
    public static void isNum() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; ++i) {
            System.out.print("请输入第" + i + "个整数：");
            arr[i] = sc.nextInt();
        }
        System.out.println("输入的数组为：");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.print("请输入要找的数：");
        int num = sc.nextInt();
        boolean flge = true;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println(num + "在这个数组中");
                flge = false;
                break;
            }
        }
        if (flge) {
            System.out.println(num + "不在这个数组中");
        }
    }

    /**
     * 实验题三
     *
     * @param arr
     * @return
     */
    public static void reversal(int[][] arr) {
        System.out.println("原数组：");
        printArray(arr);
        int[][] reverArr = new int[arr[0].length][arr.length];
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                reverArr[j][i] = arr[i][j];
            }
        }
        System.out.println("转换后数组：");
        printArray(reverArr);
    }

    /**
     * 输出二维数组的工具方法
     *
     * @param arr
     */
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
