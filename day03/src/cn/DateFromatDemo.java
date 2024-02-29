package cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author : Tongqh
 * @Description: TODO 日期格式转换
 * @date Date : 2024-02-29
 */
public class DateFromatDemo {
    public static void main(String[] args) throws ParseException {
        String s1 = "2023-12-12 08:00:05";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        //调用parse方法将String转换为Date
        System.out.println(simpleDateFormat.parse(s1));

        Date parse = simpleDateFormat.parse(s1);

        //调用format方法将Date转换为String
        System.out.println(simpleDateFormat.format(parse));



    }
}
