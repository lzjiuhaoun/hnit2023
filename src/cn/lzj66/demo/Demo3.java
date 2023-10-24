package cn.lzj66.demo;

import java.util.*;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.demo
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/24 16:49
 */
public class Demo3 {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        demo3.rep();
        demo3.sum();
    }

    public void rep() {
        String str = new Scanner(System.in).nextLine();
        System.out.println("用户输入的字符串为：");
        System.out.println(str);
        System.out.println("剔除了数字字符后的字符串为；");
        System.out.println(str.replaceAll("[0-9]*", ""));
    }

    public Double sum() {
        String str = "牛奶8.5元，香蕉4.6元，酱油2.8元，西瓜26.5元";
        String ss = str.replaceAll("[^\\d.]+", "#");
        StringTokenizer fenxi = new StringTokenizer(ss, "#");
        Double sum = 0D;
        while (fenxi.hasMoreTokens()) {
            sum += Double.valueOf(fenxi.nextToken());
        }
        System.out.println("总价为：" + sum);
        return sum;
    }
}
