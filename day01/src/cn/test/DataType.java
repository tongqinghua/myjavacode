package cn.test;

/**
 * @author : Tong
 * @Description: TODO 类型转换
 * @date Date : 2024-02-06
 */
public class DataType {
    public static void main(String[] args) {
        //自动转换：小范围类型——>大范围类型
        int a = 10;
        byte b = 5;
        //a+b的类型为int
        System.out.println(a+b);

        //强制转换：大范围类型——>小范围类型
        double c = 3.1514926;
        int d = (int)c;
        System.out.println(d);

        //e->ascii=97,97+1=98
        char e = 'a';
        int f = 1;
        System.out.println(e+f);



    }
}
