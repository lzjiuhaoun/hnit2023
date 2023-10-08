package cn.lzj66.ep5;

/**
 * 继承的动态多态：
 *  对于非静态方法——new谁调谁
 *  对于属性和静态方法——引用谁调谁
 */
public class Demo2_10_08 {
    public static void main(String[] args) {
        Animals animals1 = new Cat(); //向上转型
        Animals animals2 = new Dog();
        animals1.show(); //喵喵喵喵~~~~
        animals2.show(); //汪汪汪汪~~~~
    }
}
class Animals{
    public void show(){
        System.out.println("动物叫");
    }
}
class Cat extends Animals{
    public void show(){
        System.out.println("喵喵喵喵~~~~");
    }
}
class Dog extends Animals{
    public void show(){
        System.out.println("汪汪汪汪~~~~");
    }
}