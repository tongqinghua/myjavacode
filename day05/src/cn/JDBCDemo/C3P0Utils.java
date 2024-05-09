package cn.JDBCDemo;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.*;

/**
 * @author : Tongqh
 * @Description: TODO
 * @date Date : 2024-05-09
 */
public class C3P0Utils {
    //静态代码块，使连接池在编译时只加载一次，由于静态代码块里的变量是局部变量，所有需要定义为全局变量
    private static DataSource ds = null;

    static {
        ds = new ComboPooledDataSource();
    }
     static Connection getConnect() throws SQLException {
        Connection connection = ds.getConnection();
        return connection;
    }

    //由于用户可能会创建查询，所以使用方法重载来实现动态关闭资源
    static void closeConnect(ResultSet rs, PreparedStatement ps,Connection c) throws SQLException {
        if (rs!=null) rs.close();
        if (ps!=null) ps.close();
        if (c!=null) c.close();
    }

    static void closeConnect(PreparedStatement ps,Connection c) throws SQLException {
        if (ps!=null) ps.close();
        if (c!=null) c.close();
    }

    static void closeConnect(Connection c) throws SQLException {
        if (c!=null) c.close();
    }


}
