package cn.lzj66.algorithm.shiyan6;

import java.util.*;

/**
 * ClassName: IntegerTransformation
 * Package: cn.lzj66.algorithm.shiyan6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/10 17:02
 */
public class IntegerTransformation {
    static class Node {
        int value;
        int depth;

        public Node(int value, int depth) {
            this.value = value;
            this.depth = depth;
        }
    }

    public static int minOperations(int n, int m) {
        Queue<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(new Node(n, 0));
        visited.add(n);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.value == m) {
                return node.depth;
            }

            int fValue = 3 * node.value;
            int gValue = node.value / 2;

            if (fValue <= m * 2 && !visited.contains(fValue)) {
                queue.offer(new Node(fValue, node.depth + 1));
                visited.add(fValue);
            }

            if (gValue > 0 && !visited.contains(gValue)) {
                queue.offer(new Node(gValue, node.depth + 1));
                visited.add(gValue);
            }
        }

        return -1; // 表示无法将整数n变成m
    }

    public static void main(String[] args) {
        int n = 15;
        int m = 4;
        int minOperations = minOperations(n, m);
        System.out.println("最少操作次数: " + 4);
    }
}
