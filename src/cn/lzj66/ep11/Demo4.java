package cn.lzj66.ep11;

/**
 * ClassName: Demo4
 * Package: cn.lzj66.ep11
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/11/2 18:22
 */
public class Demo4 {
    private static int count = 0;

    public synchronized static void modifyCount() {
        try {
            for (int i = 0; i < 100000; i++) {
                count += 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized static void jiangCount() {
        try {
            for (int i = 0; i < 100000; i++) {
                count -= 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            modifyCount();
        });
        Thread thread2 = new Thread(() -> {
            jiangCount();
        });
        thread1.start();
        thread2.start();

        try {
            thread1.sleep(100);
            thread2.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + count);
    }
}
