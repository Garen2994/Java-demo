package garen.java.demo.gjpProject.domain;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtils {
    private static String DRIVERNAME = null;
    private static String URL = null;
    private static String USER = null;
    private static String PASSWORD = null;

//    private static final String DRIVERNAME = "com.mysql.cj.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/day28_demo?serverTimezone=UTC&characterEncoding" +
//            "=utf-8";
//    private static final String USER = "root";
//    private static final String PASSWORD = "hjl1115326";

    static {

        try{
            Properties pro = new Properties();
            Reader r;
            r = new FileReader("F:\\workspace\\Java-demo\\src\\garen\\java\\demo\\demo19\\JDBC\\info.properties");
            pro.load(r);
            DRIVERNAME = pro.getProperty("driver");
            URL = pro.getProperty("url");
            USER = pro.getProperty("user");
            PASSWORD = pro.getProperty("password");

            Class.forName(DRIVERNAME);
        }catch(Exception e){
            System.out.println("注册驱动失败！");
        }
    }
    public static Connection getConn() {
            Connection conn = null;
        try {

            conn = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {
            System.out.println("获取连接失败！");
        }
        return conn;
    }
}
