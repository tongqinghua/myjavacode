package cn.example;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
public class BastetballSportman extends Sportman{
    @Override
    public void eat() {
        System.out.println("篮球运动员吃篮球教练");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学篮球");
    }

    public BastetballSportman() {
    }

    public BastetballSportman(String name, int age) {
        super(name, age);
    }
}
