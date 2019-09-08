package garen.java.demo.demo19.DBUtils;

import garen.java.demo.demo19.JDBC.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;

public class ScalarHandlerDemo {
    public static void main(String[] args) {
        try{
            QueryRunner qr = new QueryRunner();
            String sql = "SELECT count(*) FROM sort";
            Connection conn = JDBCUtils.getConn();
            Object[] params = {};
            long count = qr.query(conn, sql, new ScalarHandler<Long>(), params);
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
