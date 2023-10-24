package cn.lzj66.experiment.ex3;

/**
 * ClassName: ComputerWeight
 * Package: cn.lzj66.experiment.ex3
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/24 14:59
 */
public interface ComputerWeight {
    public double computerWeight();
}
class Television implements ComputerWeight{

    @Override
    public double computerWeight() {
        return 11.232;
    }
}
class Computer implements ComputerWeight{
    @Override
    public double computerWeight() {
        return 2.541;
    }
}
class WashMachine implements ComputerWeight{
    @Override
    public double computerWeight() {
        return 20.433;
    }
}
class Truck{
    public static void main(String[] args) {
        ComputerWeight[] computerWeight = new ComputerWeight[3];
        computerWeight[0] = new Television();
        computerWeight[1] = new Computer();
        computerWeight[2] = new WashMachine();
        System.out.println("货车转载的货物质量为："+
                (computerWeight[0].computerWeight()+computerWeight[1].computerWeight()+computerWeight[2].computerWeight())+"kg");
    }
}