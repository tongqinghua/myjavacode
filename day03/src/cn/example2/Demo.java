package cn.example2;

import java.util.Scanner;

/**
 * @author : Tongqh
 * @Description: TODO 模拟登录
 * @date Date : 2024-02-28
 */
public class Demo {
    public static void main(String[] args) {
        String account = "奥巴马";
        String password = "abm123@";

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账户：");
            String input_account = scanner.next();
            System.out.println("请输入密码：");
            String input_password = scanner.next();
            if (account.equals(input_account)&&password.equals(input_password)){
                System.out.println("登录成功");
                break;
            }
            else if (i<2){
                System.out.println("账户或密码错误，还有"+(2-i)+"次机会");
            }else {
                System.out.println("账号密码冻结");
            }
        }
    }
}
