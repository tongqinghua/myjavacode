package cn.example;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
abstract public class Coach extends People{
    @Override
    abstract public void eat();

    abstract public void teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

}
