package cn.lzj66.algorithm.shiyan6;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName: IntegerTransformation
 * Package: cn.lzj66.algorithm.shiyan6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/10 17:02
 */
public class IntegerTransformation {
    public static void main(String[] args) {
        int n = 15; // 初始整数
        int m = 4;  // 目标整数
        branch(n, m);
    }

    static class Node {
        int value;
        String path;

        Node(int value, String path) {
            this.value = value;
            this.path = path;
        }
    }

    public static void branch(int n, int m) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(new Node(n, ""));

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.value == m) {
                System.out.println("找到路径: " + node.path);
                return;
            }

            if (node.value < m) {
                String path1 = node.path + "f"; // 乘3操作
                queue.add(new Node(node.value * 3, path1));
            }
            if (node.value % 2 == 0) {
                String path2 = node.path + "g"; // 除2操作
                queue.add(new Node(node.value / 2, path2));
            }
        }

        System.out.println("无法找到路径");
    }
}
