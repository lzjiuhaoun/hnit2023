package cn.lzj66.ep5;

/**
 * ClassName: Demo1_10_08
 * Package: cn.lzj66.ep5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/8 13:25
 */
public class Demo1_10_08 {
    public static void main(String[] args) {
        Som som = new Som();
        som.myStaticBase();
//        som.myStaticSom();
        Base.myStaticBase();
        Som.myStaticBase();
    }
}

class Base {
    public static void myStaticBase() {
        System.out.println("这是父类的静态方法");
    }
}

class Som extends Base {
    public static void myStaticBase() {
        System.out.println("这是父类的静态方法11111");
    }

}
