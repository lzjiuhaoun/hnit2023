import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer num1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        num1 = scanner.nextInt();
        System.out.println("你输入的整数是：" + num1);
        Main main = new Main();
        System.out.println("哈哈哈，git提交测试成功");
        System.out.println("哈哈哈web上修改代码，pull测试成功");
    }

    Main(){
        System.out.println("这是一个Main方法");
    }
}
