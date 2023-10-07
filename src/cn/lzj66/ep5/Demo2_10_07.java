package cn.lzj66.ep5;

/**
 * ClassName: Demo2_10_07
 * Package: cn.lzj66.ep5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/7 10:46
 */
public class Demo2_10_07 {
    public static void main(String[] args) {
        Student student = new Student();
        student.show(12,21,"lzj");
        Person person = new Person();
        person = student;
        student = (Student) person;
        student.stuTeYou();
    }
}
class Person{
    public int no;
    public int age;
    public String name;

    public void show(int no,int age,String name){
        System.out.println("no:"+no+",age:"+age+",name:"+name);
    }

}
class Student extends Person{
    public int no;
    public void show(int no,int age,String name){
        System.out.println("Person.show()");
        super.show(no,age,name);
        System.out.println("Student.show()");
        System.out.println("no:"+super.no+",age:"+age+",name:"+name);
    }
    public void stuTeYou(){
        System.out.println("studnet特有的方法");
    }
}
