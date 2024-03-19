package cn.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author : Tongqh
 * @Description: TODO 使用try-catch处理sql异常，并回滚事务
 * @date Date : 2024-03-19
 */
public class Demo02 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/day04_jdbc";
            String user = "root";
            String password = "12345678";
            connection = DriverManager.getConnection(url,user,password);

            statement = connection.createStatement();

            //关闭事务的自动提交
            connection.setAutoCommit(false);

            String sql1 = "update day04_jdbc.user set age = 20 where id = '001' ";
            String sql2 = "update day04_jdbc.user set agea = 20 where id = '003' ";

            statement.execute(sql1);
            statement.execute(sql2);

            //当执行成功后手动提交
            connection.commit();

        } catch (Exception e) {
            System.out.println("执行异常，请检查");
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } finally {
            try {
                if (statement != null){
                    statement.close();
                }
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
