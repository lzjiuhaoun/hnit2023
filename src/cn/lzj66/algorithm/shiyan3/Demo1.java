package cn.lzj66.algorithm.shiyan3;

import java.util.Arrays;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.algorithm.shiyan3
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/1 19:10
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] penny = {1, 2, 4};
        System.out.println("方案数目：" + changeMoren(penny, 3, 3));
//        int[] nums = {1,2,3,4,-4,-12,30,4,-100,3030,-23213,213213,45324,423};
//        System.out.println("最长不下降子序列的长度为：" + isLongAndNotDownArrray(nums));
//        int[] w = {2, 3, 4, 5};
//        int[] v = {3, 4, 5, 6};
//        int C = 8;
//        int maxVal = beibao(w, v, C);
//        System.out.println("背包能够装下的最大价值为：" + maxVal);
//        int[] arr = {1,2,3,4,-4,-12,30,4,-100,3030,-23213,213213,45324,423,-1,0};
//        System.out.println("arr的最大子序列和为："+isMaxSum(arr));
    }

    /**
     * 题1：01背包问题
     *
     * @param w
     * @param v
     * @param C
     * @return
     */
    public static int beibao(int[] w, int[] v, int C) {
        int n = w.length;
        int[][] m = new int[n + 1][C + 1];

        for (int j = 0; j <= C; j++) {
            m[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= C; j++) {
                if (j >= w[i - 1]) {
                    m[i][j] = Math.max(m[i - 1][j], m[i - 1][j - w[i - 1]] + v[i - 1]);
                } else {
                    m[i][j] = m[i - 1][j];
                }
            }
        }
        return m[n][C];
    }

    /**
     * 2.最大子段和
     *
     * @param nums
     * @return
     */
    public static int isMaxSum(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int maxSum = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }

    /**
     * 3.求一个数列的最长不下降子序列.
     *
     * @param nums
     * @return
     */
    public static int isLongAndNotDownArrray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] flag = new int[n];
        Arrays.fill(flag, -1);

        int maxLen = 1;
        int maxIdx = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] <= nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    flag[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIdx = i;
            }
        }

        int[] subsequence = new int[maxLen];
        int idx = maxLen - 1;
        while (maxIdx >= 0) {
            subsequence[idx] = nums[maxIdx];
            maxIdx = flag[maxIdx];
            idx--;
        }

        System.out.print("最长不下降子序列为：");
        for (int num : subsequence) {
            System.out.print(num + " ");
        }
        System.out.println();

        return maxLen;
    }

    /**
     * 4.找零钱问题
     *
     * @param penny
     * @param pennySize
     * @param aim
     * @return
     */
    public static int changeMoren(int[] penny, int pennySize, int aim) {
        int[][] dp = new int[pennySize][aim + 1];

        for (int i = 0; i < pennySize; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < pennySize; i++) {
            for (int j = 1; j <= aim; j++) {
                if (i > 0) {
                    dp[i][j] = dp[i - 1][j];
                }
                if (j >= penny[i]) {
                    dp[i][j] += dp[i][j - penny[i]];
                }
            }
        }

        return dp[pennySize - 1][aim];
    }


}
