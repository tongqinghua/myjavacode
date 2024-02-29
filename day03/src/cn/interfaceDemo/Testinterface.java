package cn.interfaceDemo;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-26
 */
public class Testinterface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.studay();
    }

}
abstract class Animal{
    abstract void eat();
}

class Dog extends Animal implements study{
    @Override
    void eat() {
        System.out.println("狗狗吃骨头");
    }

    @Override
    public void studay() {
        System.out.println("狗狗学会了bigdate");
    }
}
