package cn.lzj66.ep8;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.ep8
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/25 18:47
 */
public class Demo3 {
    public static void main(String[] args) {
//        String str = "qz 234.5yuan xiguan 232.44yuan";
//        Scanner scanner = new Scanner(str);
//        scanner.useDelimiter("[^\\d.]+");
//        double sum = 0;
//        while (scanner.hasNext()) {
//            sum += scanner.nextDouble();
//        }
//        System.out.println("sum=" + sum);

//        BigInteger bigInteger = new BigInteger("123412541234");
//        BigDecimal bigDecimal = new BigDecimal("32423234.323223");
//        System.out.println(bigInteger);
//        System.out.println(bigDecimal);
//        Random random1 = new Random(1234);
//        Random random2 = new Random(1234);
//
//        int randomNumber1 = random1.nextInt(100);
//        int randomNumber2 = random2.nextInt(100);
//
//        System.out.println(randomNumber1); // 输出：47
//        System.out.println(randomNumber2); // 输出：47
//        System.out.println(rand(1));
        Demo3 demo3 = new Demo3();
        Class<? extends Demo3> aClass = demo3.getClass();
        System.out.println(aClass);
        System.out.println(aClass.getName());
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] ints = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(ints));

    }

    /**
     * 生成指定位数num的随机数
     *
     * @param num
     * @return
     */
    public static int rand(int num) {
//        Random random = new Random();
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 0; i < num; i++) {
//            stringBuffer.append(random.nextInt());
//        }
//        return Integer.valueOf(stringBuffer.toString());
        Random random = new Random(1234);
        return random.nextInt();
    }
}
