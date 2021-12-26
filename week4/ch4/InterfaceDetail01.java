package com.hspedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        /**接口使用细节
         * 1.接口不能被实例化,但接口类型的变量可以去指向实现该接口的实例
         * 2.接口中的所有方法都是公共方法，接口中的抽象方法可以不用abstract修饰
         * 3.一个普通类实现接口，就必须将接口的所有方法都实现
         * 4.抽象类实现接口，可以不用实现接口的方法
         * */
    }
}
interface IA {
    public void say();//这里默认方法是公共的，public写不写无所谓
    void hi();//默认是公共方法，且必须是公共的
}
class AA implements IA{
    @Override
    public void say() {
    }

    @Override
    public void hi() {
    }
}
abstract class BB implements IA{}