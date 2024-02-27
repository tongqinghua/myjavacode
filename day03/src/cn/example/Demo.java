package cn.example;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
public class Demo {
    public static void main(String[] args) {
        PPCoach ppCoach = new PPCoach();
        PPSportman ppSportman = new PPSportman();
        BasketballCoach basketballCoach = new BasketballCoach();
        BastetballSportman bastetballSportman = new BastetballSportman();

        ppCoach.eat();
        ppCoach.teach();
        ppCoach.learn("English");

        ppSportman.eat();
        ppSportman.study();
        ppSportman.learn("English");

        basketballCoach.eat();
        basketballCoach.teach();

        bastetballSportman.eat();
        bastetballSportman.study();
    }
}
