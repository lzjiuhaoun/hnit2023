package cn.lzj66.demo;

/**
 * ClassName: Person
 * Package: cn.lzj66.demo
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/16 16:31
 */
public class Person {
    private String id,name,job;

    public Person() {}

    public Person(String id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public void login() {}

    public void register() {}

    public void talk() {
        System.out.print("编号-" + id + "  姓名-" + name + "  职位-" + job);
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(String id, String name, String job, double salary) {
        super(id, name, job);
        this.salary = salary;
    }

    public void talk() {
        super.talk();
        System.out.println("  工资—" + salary);
    }
}

class Student extends Person {
    private double money;

    public Student() {}

    public Student(String id, String name, String job, double money) {
        super(id, name, job);
        this.money = money;
    }

    public void talk() {
        super.talk();
        System.out.println("  学费—" + money);
    }
}

class TestPerson {
    public static void main(String[] args) {
        new Teacher("s001", "zs", "老师", 8000).talk();
        new Student("s002", "lzj", "学生", 18000).talk();
    }
}

