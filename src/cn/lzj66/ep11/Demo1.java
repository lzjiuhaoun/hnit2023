package cn.lzj66.ep11;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep11
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/2 11:59
 */
public class Demo1 {
    static Integer num = 0;

    public static void main(String[] args) {

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 1000; ++i) {
                num += 1;
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 1000; ++i) {
                num -= 1;
            }
        });
        th1.start();
        th2.start();
        // 等待子线程执行完毕
        try {
            th1.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("num:" + num);

    }


}
