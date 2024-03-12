package cn.collectDemo;

import java.util.HashSet;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-03-07
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();

        s1.add("你好");
        s1.add("世界");
        s1.add("你好");
        s1.add("你好");

        System.out.println(s1);

        HashSet<Teacher> s2 = new HashSet<>();
        s2.add(new Teacher("jarry",12));
        s2.add(new Teacher("tom",12));
        s2.add(new Teacher("jarry",12));
        s2.add(new Teacher("jarry",12));

        System.out.println(s2);
    }
}
