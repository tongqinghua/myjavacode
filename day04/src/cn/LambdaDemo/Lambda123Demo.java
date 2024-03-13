package cn.LambdaDemo;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-03-13
 */
public class Lambda123Demo {
    public static void main(String[] args) {
        //不省略版
        showone(()->{System.out.println("干饭");});
        showtwo((String s)->{System.out.println(s+"学习英语");});
        showthree((int a,int b)->{return a*b;});

        //不省略版



    }

    public static void showone(Lambdaone l1){
        l1.eat();
    }

    public static void showtwo(Lambdatwo l2){
        l2.student("Tom");
    }

    public static void showthree(Lambdathree l3){
        System.out.println(l3.add(3,2));
    }
}
