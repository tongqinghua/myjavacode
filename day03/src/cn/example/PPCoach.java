package cn.example;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
public class PPCoach extends Coach implements langurage{
    @Override
    public void eat() {
        System.out.println("乒乓球教练吃乒乓球");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }



    public PPCoach() {
    }

    public PPCoach(String name, int age) {
        super(name, age);
    }


    @Override
    public void learn(String lang) {
        System.out.println("乒乓球教练学会了"+lang);
    }
}
