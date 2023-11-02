package cn.lzj66.ep11;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.ep11
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/2 18:12
 */
public class Demo3 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new RunnableDemo());
        th1.start();
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("th2th2");
                }
            }
        });
        th2.start();
        Thread th3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("th3th3");
            }
        });
        th3.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("mainmainmainmainmainmain");
        }
    }
}

class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("RunnableDemoRunnableDemoRunnableDemoRunnableDemo");
        }
    }
}
