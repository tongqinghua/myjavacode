package cn.collectDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author : Tongqh
 * @Description: TODO 测试ArrayList
 * @date Date : 2024-03-06
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建一个ArrayList
        ArrayList<String> l1 = new ArrayList<>();

        //增加元素
        l1.add("tom");
        l1.add("jarry");
        l1.add(0,"JJB");
        //collect底层修改了toString
        System.out.println(l1);

        //根据下标获取元素
        System.out.println(l1.get(1));

        //修改元素
        l1.set(2,"mkbk");
        System.out.println(l1);

        //删除元素
//        l1.remove(2);
//        l1.remove("tom");
//        System.out.println(l1);

        //遍历元素
        //方式一：for
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        //方式二：增强for
        for (String s : l1) {
            System.out.println(s);
        }

        //方式三：迭代器
        Iterator<String> iterator = l1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //获取集合长度、判断集合是否为空、判断是否包含指定元素、清空集合、
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        System.out.println(l1.contains("pp"));
        l1.clear();
        System.out.println(l1);
    }
}
