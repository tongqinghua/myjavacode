package cn.Polymorphism;

/**
 * @author : Tongqh
 * @Description: TODO 多态demo
 * @date Date : 2024-02-23
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Student();
        Person p2 = new Teacher();

        p1.sayHello();
        p2.sayHello();

        //只能调用重写过的方法，子类的私有方法无法调用

        if (p1 instanceof Student){
            Student s = (Student) p1;
            s.student();
        }else {
            System.out.println("不是学生，无法强转");
        }
    }
}
