package cn.lzj66.ep4;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.ep4
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/25 19:01
 */
public class Demo3 {
    public static void main(String[] args) {
        String name="doll";
        System.out.println(name);
        setName(name);
        System.out.println(name);
    }

    public static void setName(String  name){
        System.out.println("month:"+name);
        name = "seck";
        System.out.println("month:"+name);

    }
}
