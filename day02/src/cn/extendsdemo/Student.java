package cn.extendsdemo;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-23
 */
public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void student(){
        System.out.println("学生可以学习");
    }

    @Override
    public void sayHello() {
        System.out.println("老师好");
    }
}
