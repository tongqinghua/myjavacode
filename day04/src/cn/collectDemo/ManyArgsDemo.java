package cn.collectDemo;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-03-12
 */
public class ManyArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1));
    }

    //自定义可变参数
    public static int sum(Integer...a){
        int result = 0;
        for (int i:a){
            result += i;
        }
        return result;
    }
}
