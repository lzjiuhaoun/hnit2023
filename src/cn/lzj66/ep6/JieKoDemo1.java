package cn.lzj66.ep6;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/10 17:51
 */
public interface JieKoDemo1 {
    double aa();
    int bb();
    public static void ff(){
        System.out.println("hh");
    }
}
class Demo2 implements  JieKoDemo1{
    @Override
    public double aa() {
        return 0;
    }
    @Override
    public int bb() {
        return 0;
    }
    public int cc(){
        return 111;
    }
}
class Test1{
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        JieKoDemo1 jk = demo2;
        jk.aa();
        jk.bb();
        JieKoDemo1.ff();
        demo2.aa();
        demo2.bb();
        demo2.cc();
    }
    public static int anii(){
        return 4325;
    }
}
class MyClass {
    public static void myClassMethod() {
        System.out.println("这是一个类方法");
    }
    public  void shili() {
        System.out.println("这是一个实例方法");
    }
}

class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.shili();
        MyClass.myClassMethod(); // 使用类对象调用类方法
    }
}
interface SingleCom{
    public abstract int compu(int a,int b);
}
class Com{
    public static void main(String[] args) {
        SingleCom singleCom = (a,b)->{
            return a+b;
        };
        System.out.println(singleCom.compu(1,1));
    }
}