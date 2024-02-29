package cn;

import java.util.Calendar;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-29
 */
public class CalendarDemo {
    public static void main(String[] args) {

        //因为Calendar是protected权限的，不能new，通过调用他的静态方法getInstance来获取实例对象
        Calendar instance = Calendar.getInstance();

        System.out.println(instance.get(Calendar.DATE));
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));
    }
}
