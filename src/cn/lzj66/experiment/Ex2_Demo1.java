package cn.lzj66.experiment;

/**
 * ClassName: Ex2_Demo1
 * Package: cn.lzj66.experiment
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/17 14:10
 */
public class Ex2_Demo1 {

}

class Vehicle {
    private double speed;
    private int power;

    public void speedUp(int n) {
        this.speed = n;
    }

    public void speedDown(int n) {
        this.speed = n;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setPower(int n) {
        this.power = n;
    }

    public int getPower() {
        return this.power;
    }

}

class User{
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("car1目前的功率是："+car1.getPower());
        System.out.println("car2目前的功率是："+car2.getPower());
        car1.speedUp(120);
        car2.speedUp(100);
        System.out.println("car1目前的速度是："+car1.getSpeed());
        System.out.println("car2目前的速度是："+car2.getSpeed());
        car1.getSpeed();
        car2.getSpeed();
        car1.speedDown(80);
        car2.speedDown(30);
        System.out.println("car1目前的速度是："+car1.getSpeed());
        System.out.println("car2目前的速度是："+car2.getSpeed());

    }
}
