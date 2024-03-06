package cn.collectDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-03-06
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建一个LinkedList
        LinkedList<Teacher> l1 = new LinkedList<>();

        //增加元素
        l1.add(new Teacher("jack",12));
        l1.addLast(new Teacher("tone",14));
        l1.addFirst(new Teacher("rows",42));
        //collect底层修改了toString
        System.out.println(l1);

        //根据下标获取元素
        System.out.println(l1.get(1));

        //修改元素
        l1.set(0,new Teacher("meng",27));
        System.out.println(l1);


        //删除元素
//        l1.remove(0);
//        l1.removeLast();
//        System.out.println(l1);

        System.out.println("-----------------------");
        //遍历元素
        //方式一：for
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        //方式二：增强for
        for (Teacher teacher : l1) {
            System.out.println(teacher);
        }


        //方式三：迭代器
        Iterator<Teacher> iterator = l1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //获取集合长度、判断集合是否为空、判断是否包含指定元素、清空集合、
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        System.out.println(l1.contains("pp"));
        //l1.clear();
        System.out.println(l1);

        //模拟队列，从左侧弹出
        Teacher t1 = l1.pollFirst();
        System.out.println(t1);

        //模拟队列，从右侧弹出
        Teacher t2 = l1.pollLast();
        System.out.println(t2);
    }
}
