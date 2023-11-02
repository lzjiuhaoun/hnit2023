package cn.lzj66.ep11;

/**
 * ClassName: Demo5
 * Package: cn.lzj66.ep11
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/2 19:23
 */
public class Demo5 {
    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("守护线程执行中~~~~~~~~");
            }
        });
        th.setDaemon(true); //设置th1为守护线程
        th.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("用户线程执行中~~~~~~~~");
        }
        System.out.println("用户线程执行完毕");
    }
}
