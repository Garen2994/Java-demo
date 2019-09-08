package garen.java.demo.demo19.DBUtils;

import garen.java.demo.demo19.JDBC.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import java.sql.Connection;
import java.util.List;


public class ColumnListHandlerDemo {
    public static void main(String[] args) {
        try {
            QueryRunner qr = new QueryRunner();
            Connection conn = JDBCUtils.getConn();
            String sql = "SELECT sid FROM sort";
            Object[] params = {};
            List<Integer> list = qr.query(conn, sql, new ColumnListHandler<Integer>(), params);

            for (Integer id : list) {
                System.out.println(id);
            }

            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
