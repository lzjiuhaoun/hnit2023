package cn.lzj66.ep7;

/**
 * ClassName: Demo3
 * Package: cn.lzj66.ep7
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/12 10:15
 */
public class Demo3 {

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        System.out.println(demo3.showNum());
//        System.out.println(demo3.showName());
//        System.out.println(demo3.showNameStr());
    }

    /**
     * finally会在return之前执行
     * 当方法执行到return num;时只是将num作为了方法的返回值【数值】，先执行finally块最后再return
     * 因为方法的返回值类型是基本数据类型，而在return中就已经确定了返回值，所以在finally中对num的修改不会影响最终返回值
     *
     * @return
     */
    public int showNum(){
        int num = 2;
        try{
            return num; //方法最终返回2
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ++num;
            System.out.println("finally.num="+num); //打印3
        }
        return num;
    }

    /**
     * finally会在return之前执行
     * 当方法执行到return sbf;时只是将sbf作为了方法的返回值【地址】，先执行finally块最后再return
     * 因为方法的返回值StringBuffer是引用数据类型，所以在finally中修改sbf的值就是修改地址上的值，因而会影响到方法的返回值
     * @return
     */
    public StringBuffer showName(){
        StringBuffer sbf = new StringBuffer();
        try {
            sbf.append("湖南");
            return sbf;
        }catch (Exception e){
            e.printStackTrace();
            sbf.append("工");
        }finally {
            sbf.append("学院");
        }
        return sbf;
    }
    public String showNameStr(){
        String str = "湖南";
        try {
            str = "asdfas";
            return str;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            str = "it";
        }
        return str;
    }
}
class Fulei{
    int a=10;
    static class Inner{
        int b=11;
    }
}
class Example11{
    public static void main(String[] args) {
//        Fulei.Inner inner = new Fulei().new Inner();
        Fulei.Inner inner = new Fulei.Inner();
    }
}