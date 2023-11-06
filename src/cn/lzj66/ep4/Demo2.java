package cn.lzj66.ep4;

/**
 * ClassName: Service
 * Package: cn.lzj66.ep4
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/25 11:10
 */
public class Demo2 {

    public static void main(String[] args) {
        System.out.println("a" instanceof String);

        waiceng: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==3){
                    break waiceng;
                }
                System.out.println("j="+j+'\t');
            }
        }
    }
}
