package cn.equalsDemo;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三",18);
        Student student2 = new Student("张三",18);

        //==比较地址
        System.out.println(student==student2);

        //equals在没有重写前比较的是hashcode
        System.out.println(student.equals(student2));
    }
}
