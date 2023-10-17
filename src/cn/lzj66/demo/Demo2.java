package cn.lzj66.demo;

import java.util.Random;

/**
 * ClassName: Demo2
 * Package: cn.lzj66.demo
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/16 16:02
 */
public class Demo2 {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[0]);
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2)); //true
        StringBuffer str3 = new StringBuffer("hello");
        System.out.println(str1.equals(str3)); //false
        System.out.println(str1.contentEquals(str3)); //true
        String str = new String("sdaf");
        byte b = Byte.parseByte(str);
        short i = Short.parseShort(str);
        long l = Long.parseLong(str);
        float v = Float.parseFloat(str);
        double v1 = Double.parseDouble(str);

    }

    /**
     * 随机生成num位数字验证码。
     * @param num 验证码位数
     * @return 返回验证码
     */
    public static String randomForNum(int num) {
        StringBuffer sbf = new StringBuffer();
        Random rnd = new Random();
        for (int i = 0; i < num; ++i) {
            sbf.append(rnd.nextInt(10));
        }
        return sbf.toString();
    }
}
