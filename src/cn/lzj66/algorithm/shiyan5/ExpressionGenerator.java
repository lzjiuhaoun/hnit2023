package cn.lzj66.algorithm.shiyan5;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ExpressionGenerator
 * Package: cn.lzj66.algorithm.shiyan5
 * Description:
 * 实验5最后一题：给定n个正整数和4个运算符+，-，*，/，且运算符无优先级，如2+3*5=25。
 * 对于任意给定的整数m，是设计一个算法，用以上给出的n个数和4个运算符，
 * 产生整数m，且用的运算次数最少。给出的n个树中的每个数最多只能用1次，但每种运算符可以任意使用。
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/10 16:59
 */
public class ExpressionGenerator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4}; // 给定的正整数
        int target = 10; // 目标整数

        List<String> result = generateExpression(numbers, target);
        if (result.size() > 0) {
            System.out.println("找到表达式：");
            for (String exp : result) {
                System.out.println(exp);
            }
        } else {
            System.out.println("无法生成目标整数的表达式");
        }
    }

    public static List<String> generateExpression(int[] numbers, int target) {
        List<String> result = new ArrayList<>();
        generate(numbers, target, 0, "", result);
        return result;
    }

    public static void generate(int[] numbers, int target, int index, String expression, List<String> result) {
        if (index == numbers.length) {
            if (evaluateExpression(expression) == target) {
                result.add(expression);
            }
            return;
        }

        int number = numbers[index];
        if (index == 0) {
            generate(numbers, target, index + 1, "" + number, result);
        } else {
            generate(numbers, target, index + 1, expression + "+" + number, result);
            generate(numbers, target, index + 1, expression + "-" + number, result);
            generate(numbers, target, index + 1, expression + "*" + number, result);
            generate(numbers, target, index + 1, expression + "/" + number, result);
        }
    }

    public static int evaluateExpression(String expression) {
        String[] tokens = expression.split("[\\+\\-\\*\\/]");
        char[] operators = expression.replaceAll("[0-9]", "").toCharArray();

        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i++) {
            int number = Integer.parseInt(tokens[i]);
            char operator = operators[i - 1];
            if (operator == '+') {
                result += number;
            } else if (operator == '-') {
                result -= number;
            } else if (operator == '*') {
                result *= number;
            } else if (operator == '/') {
                result /= number;
            }
        }
        return result;
    }
}
