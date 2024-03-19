package cn.JDBCDemo;

import java.sql.*;

/**
 * @author : Tongqh
 * @Description: TODO 使用jdbc完成CRUD
 * @date Date : 2024-03-18
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2、返回连接对象
        String url = "jdbc:mysql://localhost:3306/day04_jdbc";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);

        //3、返回操作平台statment
        Statement statement = connection.createStatement();

        //4、执行sql语句
        /*
        executeUpdate():用于执行insert、update、delete操作，结果返回影响的行数
        executeQuery():用于执行select操作，返回结果集
        execute():任何sql语句都可以操作，结果返回true或flase，true表示select操作，false表示非select操作
         */
//        String sql = "insert into day04_jdbc.user values (003,'Marry','woman',20)";
//        statement.executeUpdate(sql);

//        String sql = "update day04_jdbc.user set age = 21 where id = '003'";
//        int i = statement.executeUpdate(sql);
//        System.out.println(i);

//        String sql = "delete from day04_jdbc.user where id = '003'";
//        int i = statement.executeUpdate(sql);
//        System.out.println(i);

        String sql = "select * from day04_jdbc.user";
        ResultSet resultSet = statement.executeQuery(sql);

        /*
        获取sql查询该表的列名和个数
        ResultSetMetaData metaData = resultSet.getMetaData();
        System.out.println(metaData);
         */

        //5、对返回的结果集操作（select语句）
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            int age = resultSet.getInt(4);
            System.out.println("id:"+id+",name:"+name+",sex:"+sex+",age:"+age);
        }

        //6、关闭连接
        statement.close();
        connection.close();
    }
}
