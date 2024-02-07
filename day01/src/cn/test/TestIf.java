package cn.test;

import java.util.Scanner;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-07
 */
public class TestIf {
    public static void main(String[] args) {
        //If判断
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数：");
        int i = scanner.nextInt();
        if (i<=10) {
            System.out.println("太小了");
        }else {
            System.out.println("太大了");
        }

    }
}
