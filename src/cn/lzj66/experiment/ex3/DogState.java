package cn.lzj66.experiment.ex3;

/**
 * ClassName: DogState
 * Package: cn.lzj66.experiment.ex3
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/24 15:16
 */
public interface DogState {
    void showState();
}

class DogA implements DogState {
    @Override
    public void showState() {
        System.out.println("狗在主人面前：听主人命令");
    }
}

class DogB implements DogState {
    @Override
    public void showState() {
        System.out.println("狗遇到敌人：狂叫，并冲上去狠咬敌人");
    }
}

class DogC implements DogState {
    @Override
    public void showState() {
        System.out.println("狗遇到朋友：晃动尾巴，表示欢迎");
    }
}

class DogD implements DogState {
    @Override
    public void showState() {
        System.out.println("狗遇到同伴：嬉戏");
    }
}
class Dog {
    DogState state;

    public Dog(DogState state) {
        this.state = state;
    }

    public void show() {
        state.showState();
    }
}

class MainTestDog {
    public static void main(String[] args) {
        new Dog(new DogA()).show();
        new Dog(new DogB()).show();
        new Dog(new DogC()).show();
        new Dog(new DogD()).show();
    }
}