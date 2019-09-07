package garen.java.demo.demo19.DBUtils;

import garen.java.demo.demo19.JDBC.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilesDemo {
    public static void main(String[] args) {

        Connection conn = null;
        try{
            conn = JDBCUtils.getConn();
            insert(conn);
        }catch(Exception e){
            e.printStackTrace();
        }finally {

            try {
                conn.close();
            }catch(SQLException e){
                e.printStackTrace();

            }
        }
    }

    public static void insert(Connection conn){
        try {
            QueryRunner qr = new QueryRunner();
            Object[] params = {1234, "嘎"};
            int line = qr.update(conn, "INSERT INTO sort VALUES(?,?)", params);
            System.out.println("line = " + line);
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
