package cn.Thread;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-05-09
 */
public class Demo01 {
    public static void main(String[] args) {

        //每个java程序都最少有一个进程.
        Thread thread = Thread.currentThread();

        System.out.println(thread.getName());

        System.out.println(thread.getId());
    }
}
