package cn.lzj66.ep8;

import java.util.StringTokenizer;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep8
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/19 11:31
 */
public class Demo1 {
    public static void main(String[] args) {
//        String str = "123Hello567bird".replaceAll("[a-zA-Z]+","你好"); //str为：123你好567你好
//        System.out.println(str);
//        String[] splits = "公元1949年10月1日是国庆日".split("\\D+");
//        System.out.println(Arrays.toString(splits));
//        StringTokenizer fenxi = new StringTokenizer("you,, #* are*##wel,com","#*"); //分析器中的内容为：you、are和welcom
//        while (fenxi.hasMoreTokens()){
//            System.out.print("["+fenxi.nextToken()+"]");
//        }
        String str = "鱼：32.33元；蔬菜：20.21元；豆制品：11元";
        str = str.replaceAll("[^0123456789.]+","#"); //将符合正则表达式的字符序列替换为”#“  --->>>"###32.33#####20.21#######11##"
        StringTokenizer fenxi = new StringTokenizer(str, "#");//将”#“作为分隔符，分解字符串str  --->>>["32.33","20.21","11"]
        while (fenxi.hasMoreTokens()) { //hasMoreTokens:只要分析器中还有String对象就返回true
            System.out.println(fenxi.nextToken()); //返回分析器中当前String对象，并在分析器中自动删除此String对象
        }
    }
}
