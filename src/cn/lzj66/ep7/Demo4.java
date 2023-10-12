package cn.lzj66.ep7;

/**
 * ClassName: Demo4
 * Package: cn.lzj66.ep7
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/12 11:26
 */
public class Demo4 {
    public static void main(String[] args) {
        throw new RuntimeException("haohaoh");

    }
    public void ddd() {
        boolean flag = true;
        if(flag){
            throw new RuntimeException("添加数据异常");
        }
    }
}
