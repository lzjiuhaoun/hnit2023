package cn.lzj66.algorithm.shiyan6;

/**
 * ClassName: SelfPower
 * Package: cn.lzj66.algorithm.shiyan6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/24 16:25
 */
public class SelfPower {
    public static boolean isSelfPower(int n, int d) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, d);
            temp /= 10;
        }
        return sum == n;
    }

    public static int getSum(int n) {
        int sum = 0;
        int count = 0;
        for (int i = 10000; i <= 99999; i++) {
            if (isSelfPower(i, n)) {
                sum += i;
                count++;
            }
        }
        System.out.println("共有" + count + "个五位自幂数");
        return sum;
    }

    public static void main(String[] args) {
        int sum = getSum(5);
        System.out.println("所有五位自幂数的和为：" + sum);
    }
}
