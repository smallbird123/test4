package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.beanutils.BeanUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

public class JdbcUtil {
    private static DataSource ds = new ComboPooledDataSource();  //创建一个单列模式

    public static DataSource getDs() {
        return ds;
    }

    public static Connection getCon() { //用于测试 jdbc
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T toBean(Class<T> c, Map map) {
        try {
            T t = c.newInstance();
            BeanUtils.populate(t, map);
            return t;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {  //测试运行 jdbc连接
        System.out.println(getCon());
    }
}
