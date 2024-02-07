package cn.test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-02-07
 */
public class ArrayTest {
    public static void main(String[] args) {
        //Type1:动态初始化会根据长度类型自动赋值
        int[] ints = new int[5];
        System.out.println(Arrays.toString(ints));

        //Type2：静态赋值:根据数据类型和值来指定长度
        int[] ints2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(ints2));
    }
}
