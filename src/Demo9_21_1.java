import java.util.Objects;
import java.util.Scanner;

/**
 * ClassName: Demo9_21_1
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/21 17:00
 */
public class Demo9_21_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        Integer num = scanner.nextInt();
        Demo9_21_1.reverseNumber(num);
    }

    /**
     * 实现一个正整数的倒装输出
     * 1230 --》》》 321  ；  1234 --》》 4321
     * @param num
     */
    public static void reverseNumber(Integer num){
        if (num<=0) {
            throw new RuntimeException("数据不合法[num>0]......");
        }
        if (Objects.equals(num%10,0)) {
            num /= 10;
        }
        while (num>0){
            System.out.print(num%10+"\t");
            num/=10;
        }
    }

    /**
     * 输出：1000以内的全部完数
     */
    public static void wanShu(Integer n){
        for (int num = 1; num <= n; num++) {
            int sum = 0;
            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.print(num+"\t");
            }
        }

    }
}
