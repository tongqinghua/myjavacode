package cn.example2;

import java.util.Arrays;

/**
 * @author : Tongqh
 * @Description: TODO Arrays测试
 * @date Date : 2024-02-28
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] i = {12,2,34,123,52,32,12,4,1};
        System.out.println(i);
        String string = Arrays.toString(i);
        System.out.println(string);
        Arrays.sort(i);
        String string2 = Arrays.toString(i);
        System.out.println(string2);

    }
}
