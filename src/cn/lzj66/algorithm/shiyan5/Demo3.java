package cn.lzj66.algorithm.shiyan5;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.algorithm.shiyan5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/16 18:39
 */
public class Demo3 {
    private static void decompose(int n, String result, int start) {
        if (n == 0) {
            System.out.println(result);
            return;
        }
        for (int i = start; i > 0; i--) {
            if (i <= n) {
                decompose(n - i, result + i + (n - i == 0 ? "" : "+"), i);
            }
        }
    }

    public static void main(String[] args) {
        int num = 6;
        decompose(num, "", num);
    }
}
