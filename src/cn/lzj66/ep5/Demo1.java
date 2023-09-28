package cn.lzj66.ep5;

/**
 * ClassName: Demo1
 * Package: cn.lzj66.ep5
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/9/28 10:31
 */
abstract class Demo1 {
    abstract float getFloat();
    void f(){}
}
class B extends Demo1{
    private float m  =1.0f;

    @Override
    float getFloat() {
        return 0;
    }
}
