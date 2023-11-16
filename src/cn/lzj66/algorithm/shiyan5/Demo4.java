package cn.lzj66.algorithm.shiyan5;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo4
 * Package: cn.lzj66.algorithm.shiyan5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/16 18:41
 */
public class Demo4 {
    private static boolean dfs(int[] nums, int target, int cur, int sum, List<String> expr, List<String> result, int prev) {
        if (cur == nums.length) {
            if (sum == target) {
                result.addAll(expr);
                return true;
            }
            return false;
        }
        for (int i = cur; i < nums.length; i++) {
            if (i > cur && nums[cur] == 0) {
                break;
            }
            int value = nums[cur];
            if (i > cur) {
                value = value * 10 + nums[i];
            }
            expr.add("+");
            expr.add(String.valueOf(value));
            if (dfs(nums, target, i + 1, sum + value, expr, result, value)) {
                return true;
            }
            expr.remove(expr.size() - 1);
            expr.remove(expr.size() - 1);

            expr.add("-");
            expr.add(String.valueOf(value));
            if (dfs(nums, target, i + 1, sum - value, expr, result, -value)) {
                return true;
            }
            expr.remove(expr.size() - 1);
            expr.remove(expr.size() - 1);

            expr.add("*");
            expr.add(String.valueOf(value));
            if (dfs(nums, target, i + 1, sum - prev + prev * value, expr, result, prev * value)) {
                return true;
            }
            expr.remove(expr.size() - 1);
            expr.remove(expr.size() - 1);

            expr.add("/");
            expr.add(String.valueOf(value));
            if (dfs(nums, target, i + 1, sum - prev + prev / value, expr, result, prev / value)) {
                return true;
            }
            expr.remove(expr.size() - 1);
            expr.remove(expr.size() - 1);
        }
        return false;
    }

    public static List<String> findExpression(int[] nums, int target) {
        List<String> expr = new ArrayList<>();
        List<String> result = new ArrayList<>();
        dfs(nums, target, 0, 0, expr, result, 0);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5};
        int target = 25;
        List<String> expression = findExpression(nums, target);
        System.out.println(expression);
    }
}
