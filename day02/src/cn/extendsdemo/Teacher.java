package cn.extendsdemo;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-23
 */
public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teacher(){
        System.out.println("老师可以教学");
    }

    @Override
    public void sayHello() {
        System.out.println("学生你好");
    }
}
