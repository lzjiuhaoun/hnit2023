package cn.lzj66.ep5;

/**
 * ClassName: Service
 * Package: cn.lzj66.ep5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/28 10:57
 */
public class Demo2 {
    static {
        System.out.println("执行顺序①");
    }
    public static void main(String[] args) {
        AAA aaa = new AAA();
        System.out.println("执行顺序③");
    }
}
class AAA{
    static {
        System.out.println("执行顺序②");
    }
}
