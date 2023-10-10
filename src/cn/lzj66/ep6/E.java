package cn.lzj66.ep6;

/**
 * ClassName: E
 * Package: cn.lzj66.ep6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/10 18:55
 */
public class E {
    public static void main(String[] args) {
        B b = new B();
        Cn cn = b;
        System.out.println(cn.add(12,6));
        A a = b;
        System.out.println(a.add(10,5));
    }
}
interface Cn{
    int add(int a,int b);
}
abstract class A{
    abstract int add(int a,int b);
}
class B extends A implements Cn{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}