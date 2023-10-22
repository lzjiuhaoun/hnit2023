package cn.lzj66.algorithm.shiyan1;

/**
 * ClassName: Demo4
 * Package: cn.lzj66.algorithm.shiyan1
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/22 19:32
 */
public class Demo4 {
    public static void main(String[] args) {
        daying(1,1);
    }
    static void daying(int i,int j){
        if (i > 9) {
            return;
        }
        if (j > i) {
            System.out.println();
            daying(i + 1, 1);
            return;
        }
        System.out.print(i + " * " + j + " = " + (i * j) + "\t");
        daying(i, j + 1);

    }
}
