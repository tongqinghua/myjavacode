package cn.equalsDemo;

import java.util.Objects;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-27
 */
public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    //比如stuent queals(student2)中，this代表student,o代笔student2
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
