package cn.lzj66.experiment;

/**
 * ClassName: Demo22
 * Package: cn.lzj66.experiment
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/24 16:40
 */
public class Demo22 {
    final void show(){
        System.out.println("Demo22.show");
    }
}
class Demo33 extends  Demo22{

}
class MainTest{
    public static void main(String[] args) {
        Demo33 demo33 = new Demo33();
        demo33.show();
    }
}
