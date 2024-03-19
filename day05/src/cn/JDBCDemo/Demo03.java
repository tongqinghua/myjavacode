package cn.JDBCDemo;

import java.sql.*;

/**
 * @author : Tongqh
 * @Description: TODO 注入与预编译
 * @date Date : 2024-03-18
 */
public class Demo03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2、返回连接对象
        String url = "jdbc:mysql://localhost:3306/day04_jdbc";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select * from day04_jdbc.user where id = ? and name = ?";

        //3、返回预编译平台preparestatment
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //4、对参数进行赋值
        //对第一个参数赋值001
        preparedStatement.setInt(1,001);
        //对第二个参数赋值Jack
        preparedStatement.setString(2,"Jack");

        ResultSet resultSet = preparedStatement.executeQuery();

        //5、对返回的结果集操作（select语句）
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            int age = resultSet.getInt(4);
            System.out.println("id:"+id+",name:"+name+",sex:"+sex+",age:"+age);
        }

        //6、关闭连接
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
