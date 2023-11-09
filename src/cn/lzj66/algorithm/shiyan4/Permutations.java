package cn.lzj66.algorithm.shiyan4;

import java.util.Arrays;

/**
 * ClassName: Permutations
 * Package: cn.lzj66.algorithm.shiyan4
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/9 16:07
 */
public class Permutations {
    private static void permute(int[] arr, int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i); // backtrack
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        permute(arr, 0, arr.length - 1);
    }
}
