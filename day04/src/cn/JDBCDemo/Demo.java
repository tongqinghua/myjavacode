package cn.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author : Tongqh
 * @Description: TODO JDBC创建步骤
 * @date Date : 2024-03-15
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2、获取连接对象connection(url要具体到数据库)
        String url = "jdbc:mysql://localhost:3306/day04_jdbc";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);

        //3、获取sql执行平台statment
        Statement statement = connection.createStatement();

        //4、执行sql
        boolean result = statement.execute("insert into day04_jdbc.user values (002,'Tom','woman',19);");
        /*
        result返回true和flase
        true表示有返回结果，用于select操作
        false表示没有返回结果，用于create、update、delete、insert操作
         */
        System.out.println(result);

        //5、处理返回结果集（可选）

        //6、关闭连接、释放资源
        statement.close();
        connection.close();
    }
}
