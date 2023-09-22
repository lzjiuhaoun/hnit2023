import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Demo9_21
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/21 16:48
 */
public class Demo9_21 {
    public static void main(String[] args) {
        List<Integer> perfectNumbers = getPerfectNumbers();
        System.out.println("1000以内的完数是：" + perfectNumbers);
        System.out.println("1000以内的完数是：[1, 6, 28, 496]");

    }

    public static List<Integer> getPerfectNumbers() {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int num = 1; num <= 1000; num++) {
            if (isPerfectNumber(num)) {
                perfectNumbers.add(num);
            }
        }
        return perfectNumbers;
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != 1 && i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
