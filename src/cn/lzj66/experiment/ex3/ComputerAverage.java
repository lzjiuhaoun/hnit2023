package cn.lzj66.experiment.ex3;


import java.util.*;
/**
 * ClassName: ComputerAverage
 * Package: cn.lzj66.experiment.ex3
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/24 14:14
 */
public interface ComputerAverage {
    /**
     * 计算成绩
     * @return
     */
    public abstract Double pleaseTranslate(ArrayList<Integer> list);
}

class Gymnastics implements ComputerAverage{
    public ArrayList<Integer> inputComputer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入运动员分数：");
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        System.out.println("输入的运动员分数为：" + list);
        return list;
    }

    @Override
    public Double pleaseTranslate(ArrayList<Integer> list) {
        Collections.sort(list);
        Double sum = 0D;
        for (int i = 1; i < list.size()-1; ++i) {
            sum += list.get(i);
        }
        return (sum/(list.size()-2));
    }
}
class School implements ComputerAverage{
    public ArrayList<Integer> inputComputer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        System.out.println("输入的学生成绩为：" + list);
        return list;
    }

    @Override
    public Double pleaseTranslate(ArrayList<Integer> list) {
        Double sum = 0D;
        for (Integer num : list) {
            sum += num;
        }
        return (sum/list.size());
    }
}
class Demo1{
    public static void main(String[] args) {
        Gymnastics gymnastics = new Gymnastics();
        School school = new School();
        System.out.println("运动员平均成绩为；"+gymnastics.pleaseTranslate(gymnastics.inputComputer()));
        System.out.println("班级平均成绩为；"+school.pleaseTranslate(school.inputComputer()));
    }

}
