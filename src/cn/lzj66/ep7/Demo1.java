package cn.lzj66.ep7;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep7
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/11 20:47
 */
public class Demo1 {
    private int aa=11;
    int bb=22;
    protected int cc=33;
    private int dd =44;
    public RedDemo1 redDemo1 = new RedDemo1(); //内部类声明对象
    private void getAA(){
        System.out.println(aa);
    }
    void getBB(){
        System.out.println(bb);
    }
    protected void getCC(){
        System.out.println(cc);
    }
    public void getDD(){
        System.out.println(dd);
    }
    public void getTest(){
        redDemo1.test();
    }


    //内部类
    class RedDemo1{
        private int aa=110;
        int bb=220;
        protected int cc=330;
        private int dd =440;
        public void getDD(){
            System.out.println("redDemo.getDD()");
        }
        public void test(){
            getAA();
            getBB();
            getCC();
            getDD();
            System.out.println(aa+","+bb+","+cc+","+dd);
        }
    }
}
class Test1{
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.redDemo1.test();
    }
}