package cn.staticcode;

/**
 * @author : Tongqh
 * @Description: TODO静态代码块
 * @date Date : 2024-02-26
 */
public class demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Dog dog1 = new Dog();
        dog1.eat();
    }

}

class Dog{
    //静态代码块
    static {
        System.out.println("狗狗出生了");
    }

    public void eat(){
        System.out.println("狗狗要吃奶");
    }
}
