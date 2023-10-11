package cn.lzj66.ep7;

/**
 * ClassName: Demo2
 * Package: cn.lzj66.ep7
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/11 21:24
 */
public class Demo2 {
    public static void main(String[] args) {
        Son son = new Son();
        son.sayHello(new Father(){

        });
    }
}
abstract class Father{
    int a = 1223;

    public Father() {
    }

    public Father(int a) {
        this.a = a;
    }
}
class Son {
    public void sayHello(Father father){
        System.out.println(father.a);
    }
}