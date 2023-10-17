package cn.lzj66.experiment;

/**
 * ClassName: People
 * Package: cn.lzj66.experiment
 * Description: 实验2《子类与继承》
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/17 14:21
 */
public class People {
    protected double height;
    protected double weight;
    public void speakHello(){}
    public void averageHeight(){}
    public void averageWeigth(){}
}
class Chinese extends People{
    @Override
    public void speakHello() {
        System.out.println("你好");
    }

    @Override
    public void averageHeight() {
        System.out.println("中国人平均身高："+height+"厘米");
    }

    @Override
    public void averageWeigth() {
        System.out.println("中国人平均体重："+weight+"千克");
    }

    public void chinaGongfu(){
        System.out.println("坐如松、站如松、睡如弓");
    }
}

class American extends People{
    @Override
    public void speakHello() {
        System.out.println("How do you do");
    }

    @Override
    public void averageHeight() {
        System.out.println("Amerivan's average height:"+height+" cm");
    }

    @Override
    public void averageWeigth() {
        System.out.println("American's average weight:"+weight+" kg");
    }

    public void americanBoxing(){
        System.out.println("直拳、勾拳、组合拳");
    }
}

class Beijingman extends Chinese{
    @Override
    public void speakHello() {
        System.out.println("您好");
    }

    @Override
    public void averageHeight() {
        System.out.println("北京人平均身高："+height+"厘米");
    }

    @Override
    public void averageWeigth() {
        System.out.println("北京人平均体重："+weight+"千克");
    }

    public void beijingOpera(){
        System.out.println("花脸、青衣、花旦和老生");
    }
}
class Main{
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        American american = new American();
        Beijingman beijingman = new Beijingman();
        chinese.height=168.78; chinese.weight=65;
        american.height=176; american.weight=75;
        beijingman.height=172.5; beijingman.weight=70;
        chinese.speakHello();
        american.speakHello();
        beijingman.speakHello();
        chinese.averageHeight();
        american.averageHeight();
        beijingman.averageHeight();
        chinese.averageWeigth();
        american.averageWeigth();
        beijingman.averageWeigth();
        chinese.chinaGongfu();
        american.americanBoxing();
        beijingman.beijingOpera();
    }
}