package cn.innerClass;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
public class Demo2 {
    //抽象类的匿名内部类
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };
        dog.eat();

        //接口的匿名内部类
        skill gg = new skill() {
            @Override
            public void play() {
                System.out.println("狗狗玩游戏");
            }
        };
        gg.play();
    }
}
