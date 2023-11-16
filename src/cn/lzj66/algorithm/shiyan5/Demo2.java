package cn.lzj66.algorithm.shiyan5;

import java.util.Arrays;

/**
 * ClassName: Demo2
 * Package: cn.lzj66.algorithm.shiyan5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/16 18:38
 */
public class Demo2 {
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(int[] matrix, int index, int num) {
        for (int i = 0; i < index; i++) {
            if (!isPrime(matrix[i] + num)) {
                return false;
            }
        }
        return true;
    }

    private static void findPrimeMatrix(int[] matrix, int index, int n) {
        if (index == 9) {
            System.out.println(Arrays.toString(matrix));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (isValid(matrix, index, i)) {
                matrix[index] = i;
                findPrimeMatrix(matrix, index + 1, n);
                matrix[index] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] matrix = new int[9];
        int n = 15; // 假设N为15
        findPrimeMatrix(matrix, 0, n);
    }
}
