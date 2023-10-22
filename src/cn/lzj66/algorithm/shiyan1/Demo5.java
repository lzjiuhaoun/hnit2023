package cn.lzj66.algorithm.shiyan1;

import java.util.*;

/**
 * ClassName: Demo5
 * Package: cn.lzj66.algorithm.shiyan1
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/22 19:35
 */
public class Demo5 {
    public static void main(String[] args) {
        System.out.print("请输入数组大小:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        System.out.print("请输入数组数据:");
        for (int i = 0; i < num; i++) {
            arr[i]=scanner.nextInt();
        }
        bubbleSort(arr, arr.length);
        System.out.println("排序后的数组：");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }
}
