package cn.test;

import java.util.Scanner;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-06
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //自动补全代码：1、command+option+v；2、代码后.var后回车
        System.out.println("输入：");
        String name = scanner.next();
        System.out.println("输入的是："+name);

    }
}
