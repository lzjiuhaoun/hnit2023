package cn.lzj66.experiment.ex5;

import java.util.Random;

/**
 * Classcode: Demo2
 * Package: cn.lzj66.experiment.ex5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/7 14:53
 */
public class Demo2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println((char)(random.nextInt(26) + 97));
    }
}
