package cn.lzj66.algorithm.shiyan6;

/**
 * ClassName: Sequence
 * Package: cn.lzj66.algorithm.shiyan6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/24 16:26
 */
public class Sequence {
    public static int getResult(int n) {
        if (n <= 3) {
            return n;
        }
        int a = 1, b = 2, c = 3, d = 0;
        for (int i = 4; i <= n; i++) {
            d = c + 2 * b + 3 * a;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }

    public static void main(String[] args) {
        int n = 10; // 例如，计算第10个数是多少
        int result = getResult(n);
        System.out.println("第" + n + "个数是：" + result);
    }
}
