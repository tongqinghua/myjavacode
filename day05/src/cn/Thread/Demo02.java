package cn.Thread;

/**
 * @author : Tongqh
 * @Description: TODO 多线程测试
 * @date Date : 2024-05-19
 */
public class Demo02 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread myThread = new MyThread();
        myThread.start();
        myThread1.start();

    }


}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程0输出："+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("线程1输出："+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
