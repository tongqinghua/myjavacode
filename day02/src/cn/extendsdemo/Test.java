package cn.extendsdemo;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-23
 */
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("zs",12);
        Student s1 = new Student("ws", 19);
        System.out.println(t1.toString());
        System.out.println(s1.toString());
        t1.teacher();
        s1.student();
        t1.eat();
        s1.eat();
        t1.sayHello();
        s1.sayHello();
    }
}
