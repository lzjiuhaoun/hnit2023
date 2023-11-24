package cn.lzj66.algorithm.shiyan6;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Parentheses
 * Package: cn.lzj66.algorithm.shiyan6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/24 16:28
 */
public class Parentheses {
    public static int getLegalCount(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result.size();
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int count = getLegalCount(n);
        System.out.println(n + "对括号的合适组合有 " + count + " 种");
    }
}
