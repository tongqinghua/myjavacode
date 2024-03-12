package cn.collectDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-03-12
 */
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(6);
        l1.add(9);
        l1.add(1);

        ArrayList<Teacher> l2 = new ArrayList<>();
        l2.add(new Teacher("tom",12));
        l2.add(new Teacher("jarry",34));
        l2.add(new Teacher("anda",1));
        l2.add(new Teacher("quer",28));

        System.out.println(l1);
        System.out.println(l2);

        //shuffle:每次都是重新排序
//        Collections.shuffle(l1);
//        System.out.println(l1);
//        Collections.shuffle(l2);
//        System.out.println(l2);

        //reverse：颠倒顺序
//        Collections.reverse(l1);
//        System.out.println(l1);
//        Collections.reverse(l2);
//        System.out.println(l2);

        /*
        sort()
        默认是升序排序，也可以重写比较规则
         */
//        Collections.sort(l1);
//        System.out.println(l1);


        //通过匿名内部类，重写comparator规则，降序排序
        Collections.sort(l1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 < o2) ? 1 : ((o1 == o2) ? 0 : -1);
            }
        });
        System.out.println(l1);

        Collections.sort(l2);
        System.out.println(l2);
    }
}
