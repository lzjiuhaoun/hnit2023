package cn.lzj66.ep6;

/**
 * ClassName: JieKo
 * Package: cn.lzj66.ep6
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/10 17:20
 */
public interface JieKo {
    //接口中的默认变量
    public final int HEIGHT = 100;

    int aa();

    double bb();

    public default void add(int a,int b){
        System.out.println(a+b);
    }
    public static int pdd(int i,int j){
        return i+j;
    }

    private void bdd(){
        //可以将此接口的某些算法封装，供default实例方法使用
    }
}

//class Testy{
//    public static void main(String[] args) {
//        System.out.println(JieKo.HEIGHT);
//    }
//
//    @Override
//    public int aa() {
//        return 0;
//    }
//
//    @Override
//    public double bb() {
//        return 0;
//    }
//
//    @Override
//    public int cc() {
//        return 0;
//    }
//
//    @Override
//    public double dd() {
//        return 0;
//    }
//}
