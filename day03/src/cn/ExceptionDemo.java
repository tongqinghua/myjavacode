package cn;

/**
 * @author : Tongqh
 * @Description: TODO try-catch-finaly
 * @date Date : 2024-03-01
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a ;
        try {
            a = 5 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("执行完成");
        }

    }
}
