package cn.example;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
public class BasketballCoach extends Coach{
    @Override
    public void eat() {
        System.out.println("篮球教练吃篮球");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教投篮");
    }

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

}
