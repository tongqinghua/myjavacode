package cn.JDBCDemo;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

import javax.sql.DataSource;
import java.sql.*;

/**
 * @author : Tongqh
 * @Description: TODO使用C3P0连接池
 * @date Date : 2024-05-09
 */
public class Demo04 {
    public static void main(String[] args) throws Exception {
        //1、创建连接池
        DataSource ds = new ComboPooledDataSource();


        //2、获取连接
        Connection connection = ds.getConnection();


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
