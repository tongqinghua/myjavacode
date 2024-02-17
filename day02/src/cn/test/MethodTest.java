package cn.test;

import java.sql.Array;
import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-07
 */
public class MethodTest {
    public static void main(String[] args) {
        int[] arr = {1,5,34,2,92,573,24};
        ergodicArrary(arr);
        int max = maxArrary(arr);
        System.out.println("最大值是："+max);

        String[] arr2 = {"hello","world","animal"};
        ergodicArrary(arr2);

        double[] arr3 = {1.11,1.12,1.13,1.14};
        ergodicArrary(arr3);

    }

    /**
     * 定义一个用于接收一个数组变量, 然后对这个数组进行遍历
     */
    public static void ergodicArrary(int[] a){
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    /**
     * 类的重载：定义在同一个类、同一个方法名、不同参数
     */
    public static void ergodicArrary(String[] a){
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void ergodicArrary(double[] a){
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    /** 
     * 获取数组最值(例如: 最大值)
     */
    public static int maxArrary(int[] a){
        int max = a[0];
        for (int value : a) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
