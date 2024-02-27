package cn.example;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
public class PPSportman extends Sportman implements langurage{
    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃乒乓球教练");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void learn(String lang) {
        System.out.println("乒乓球运动员学会了"+lang);
    }

    public PPSportman() {
    }

    public PPSportman(String name, int age) {
        super(name, age);
    }
}
