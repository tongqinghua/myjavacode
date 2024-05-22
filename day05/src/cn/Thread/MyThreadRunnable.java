package cn.Thread;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-05-22
 */
public class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程"+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
