package cn.lzj66.ep4;

/**
 * ClassName: Demo1
 * Package: ep4.lzj66.cn
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/25 10:21
 */
public class Demo1 {
    static Demo1 demo = new Demo1();
    static int num1;
    static int num2 = 0;

    Demo1() {
        System.out.println("呵呵");
        ++num1;
        ++num2;
    }

    static {
        System.out.println("哈哈");
        ++num1;
        ++num2;
    }

    public static void main(String[] args) {
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
    }
}
