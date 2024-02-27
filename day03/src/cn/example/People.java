package cn.example;

/**
 * @author : Tongqh
 * @Description: TODO 人类
 * @date Date : 2024-02-27
 */
abstract public class People {
    private String name;
    private int age;

    abstract public void eat();

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
