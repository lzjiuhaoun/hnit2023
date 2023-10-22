package cn.lzj66.algorithm.shiyan1;

import java.util.*;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.algorithm.shiyan1
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/22 18:54
 */
public class Demo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("请输入一组整数数组（自动排序,输入任意非数字字符退出）：");
        while (scanner.hasNextInt()) {
            list.add(Integer.valueOf(scanner.nextInt()));
        }
        Collections.sort(list);
        System.out.println("你输入的数组为：");
        System.out.println(list);
        System.out.print("输入要查询的值：");
        int num = new Scanner(System.in).nextInt();
        System.out.println(binarySearch(list, 0, list.size(), num));

    }

    public static int binarySearch(ArrayList<Integer> list, int left, int right, int num) {
        if (left > right || list.isEmpty()) return -1;
        int mid = (left + right) / 2;
        if (num == list.get(mid)) {
            return (mid + 1);
        } else if (num < list.get(mid)) {
            return binarySearch(list, left, mid - 1, num);
        } else {
            return binarySearch(list, mid + 1, right, num);
        }
    }
}
