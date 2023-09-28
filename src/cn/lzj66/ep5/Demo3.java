package cn.lzj66.ep5;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.ep5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/28 11:02
 */
public class Demo3 {
    static int num1;
    static int num2 = 0;
    Demo3() {
        System.out.println("呵呵");
        ++num1;
        ++num2;
    }
    static {
        System.out.println("哈哈");
        ++num1;
        ++num2;
    }
    static Demo3 demo = new Demo3();
    public static void main(String[] args) {
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
