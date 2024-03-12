package cn.collectDemo;

import java.util.Objects;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-03-06
 */
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;


    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setAge(int age) {
        this.age = age;


    }

    //重写Teacher类的比较规则，按年龄升序排序
    @Override
    public int compareTo(Teacher o) {
        //参考 return (x < y) ? -1 : ((x == y) ? 0 : 1);
        return (this.age < o.age) ? -1 : ((this.age == o.age) ? 0 : 1);
    }
}
