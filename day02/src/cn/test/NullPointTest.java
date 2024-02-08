package cn.test;

import java.util.Scanner;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-07
 */
public class NullPointTest {
    public static void main(String[] args) {
        Scanner inputname = new Scanner(System.in);
        System.out.print("please input you name:");
        String iname = inputname.next();
        String name = "jack";

        //如果iname是null，就会触发空指针异常
        System.out.println(iname.equals(name));

        //可以避免空指针异常
        System.out.println(name.equals(iname));
    }
}
