package cn.lzj66.algorithm.shiyan4;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: SubsetSum
 * Package: cn.lzj66.algorithm.shiyan4
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/9 16:01
 */
public class SubsetSum {
    private static void findSubsets(int[] arr, int i, int sum, List<Integer> subset) {
        if (i == arr.length) {
            if (sum == 9) {
                System.out.println(subset);
            }
            return;
        }
        findSubsets(arr, i + 1, sum, new ArrayList<>(subset));
        subset.add(arr[i]);
        findSubsets(arr, i + 1, sum + arr[i], subset);
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 3, 2, 1};
        findSubsets(arr, 0, 0, new ArrayList<>());
    }
}
