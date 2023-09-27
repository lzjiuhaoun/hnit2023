package cn.lzj66.demo;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep4.demo
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/27 18:31
 */
public class Demo1 {
    public static void main(String[] args) {
        Animal cat = new Cat("小猫", 2);
        Animal dog = new Dog("小狗", 3);

        cat.introduce();
        cat.eat();
        cat.sleep();

        dog.introduce();
        dog.eat();
        dog.sleep();
    }
}

/**
 * 抽象类-动物类
 */
abstract class Animal {
    protected String name;
    protected int age;

    /**
     * 构造方法
     * @param name
     * @param age
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 抽象方法
     */
    public abstract void eat();
    /**
     * 抽象方法
     */
    public abstract void sleep();
    /**
     * 具体方法
     */
    public void introduce() {
        System.out.println("我是一只" + name + "，今年" + age + "岁。");
    }
}

/**
 * 子类，继承抽象类并实现抽象方法
 */
class Cat extends Animal {
    /**
     * 子类特有的方法
     * @param name
     * @param age
     */
    public Cat(String name, int age) {
        super(name, age);
    }

    /**
     * 子类实现的父类方法
     */
    @Override
    public void eat() {
        System.out.println("猫吃鱼。");
    }
    /**
     * 子类实现的父类方法
     */
    @Override
    public void sleep() {
        System.out.println("猫睡觉。");
    }
}

/**
 * 子类，继承抽象类并实现抽象方法
 */
class Dog extends Animal {
    /**
     * 子类特有的方法
     * @param name
     * @param age
     */
    public Dog(String name, int age) {
        super(name, age);
    }
    /**
     * 子类实现的父类方法
     */
    @Override
    public void eat() {
        System.out.println("狗吃骨头。");
    }
    /**
     * 子类实现的父类方法
     */
    @Override
    public void sleep() {
        System.out.println("狗睡觉。");
    }
}