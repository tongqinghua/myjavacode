package cn.oop;

/**
 * @author : Tongqh
 * @Description: TODO 测试构造器
 * @date Date : 2024-02-23
 */
public class apple {
    public static void main(String[] args) {
        Phone2 apple5 = new Phone2();
        cn.oop.Phone2 apple8 = new Phone2("苹果", 1500, "red");
        apple8.call("zs");
        System.out.println(apple8.toString());


    }
}
