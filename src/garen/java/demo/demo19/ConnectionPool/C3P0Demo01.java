package garen.java.demo.demo19.ConnectionPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo01 {
    public static void main(String[] args) {
        try {
            DataSource dataSource = new ComboPooledDataSource();

            Connection conn = dataSource.getConnection();
            System.out.println(conn);

            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        }
}
