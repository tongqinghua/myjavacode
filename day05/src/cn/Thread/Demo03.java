package cn.Thread;

/**
 * @author : Tongqh
 * @Description: TODO 测试继承线程父类
 * @date Date : 2024-05-22
 */
public class Demo03 extends MyThreadRunnable{
    public static void main(String[] args) throws InterruptedException {
        MyThreadRunnable threadRunnable = new MyThreadRunnable();

        Thread thread = new Thread(threadRunnable);

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程"+i);
            Thread.sleep(50);

        }


    }
}
