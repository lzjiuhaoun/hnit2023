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
        String random = randomForNum(6);
        System.out.println(random);
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
