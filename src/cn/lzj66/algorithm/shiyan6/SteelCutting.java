package cn.lzj66.algorithm.shiyan6;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: SteelCutting
 * Package: cn.lzj66.algorithm.shiyan6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/24 16:29
 */
class Result {
    int maxValue;
    List<Integer> lengths;

    Result(int maxValue, List<Integer> lengths) {
        this.maxValue = maxValue;
        this.lengths = lengths;
    }
}

public class SteelCutting {
    public static Result getSteelMaxValue(int[] a, int n, int[] prices, int m) {
        int[] dp = new int[n + 1];
        int[] cuts = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                if (max < prices[j - 1] + dp[i - j]) {
                    max = prices[j - 1] + dp[i - j];
                    cuts[i] = j;
                }
            }
            dp[i] = max;
        }

        int maxValue = dp[n];
        List<Integer> lengths = new ArrayList<>();
        while (n > 0) {
            lengths.add(cuts[n]);
            n -= cuts[n];
        }

        return new Result(maxValue, lengths);
    }

    public static void main(String[] args) {
        int L = 8;
        int[] a = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        Result result = getSteelMaxValue(a, L, a, L);
        System.out.println("钢管能获得的最大价值为：" + result.maxValue);
        System.out.println("最佳的切割长度序列为：" + result.lengths);
    }
}
