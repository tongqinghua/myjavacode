package cn.example2;

import java.util.Scanner;

/**
 * @author : Tongqh
 * @Description: TODO统计大小写数字特殊字符数量
 * @date Date : 2024-02-28
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upper = 0;
        int low = 0;
        int number = 0;
        int special = 0;

        System.out.println("请输入字符串：");

        String next = scanner.next();

        for (int i = 0; i <next.length(); i++) {
            if (next.charAt(i)>='a'&&next.charAt(i)<='z'){
                upper++;
            }else if (next.charAt(i)>='A'&&next.charAt(i)<='Z'){
                low++;
            }else if (next.charAt(i)>='0'&&next.charAt(i)<='9'){
                number++;
            }else{
                special++;
            }
        }
        System.out.println("大写字母有"+upper);
        System.out.println("小写字母有"+low);
        System.out.println("数字有"+number);
        System.out.println("特殊字符有"+special);

    }
}
