package cn.lzj66.ep7;

/**
 * ClassName: A
 * Package: cn.lzj66.ep7
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/12 11:20
 */
public interface A {
    void show();
}
class B{
    public void sayHello(A a){
        a.show();
    }
}
class C{
    public static void main(String[] args) {
        B b = new B();
        b.sayHello(()->{
            System.out.println("哈哈");
        });
    }
}
