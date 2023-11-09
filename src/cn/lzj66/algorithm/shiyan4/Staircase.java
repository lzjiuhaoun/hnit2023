package cn.lzj66.algorithm.shiyan4;

import java.util.Arrays;

/**
 * ClassName: Staircase
 * Package: cn.lzj66.algorithm.shiyan4
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/9 16:08
 */
public class Staircase {
    private static void findSteps(int n, int[] steps, int i) {
        if (n == 0) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(steps, 0, i)));
            return;
        }
        if (n >= 1) {
            steps[i] = 1;
            findSteps(n - 1, steps, i + 1);
        }
        if (n >= 2) {
            steps[i] = 2;
            findSteps(n - 2, steps, i + 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[] steps = new int[n];
        findSteps(n, steps, 0);
    }
}
