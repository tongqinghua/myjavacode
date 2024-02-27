package cn.example;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
abstract public class Sportman extends People{
    @Override
    abstract public void eat();

    abstract public void study();

    public Sportman() {
    }

    public Sportman(String name, int age) {
        super(name, age);
    }
}
