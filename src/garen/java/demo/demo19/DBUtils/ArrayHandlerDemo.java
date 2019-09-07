package garen.java.demo.demo19.DBUtils;

import garen.java.demo.demo19.JDBC.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class ArrayHandlerDemo {
    public static void main(String[] args) {
        try{
            QueryRunner qr = new QueryRunner();
            String sql = "SELECT * FROM sort";
            Object[] params = {};
            Connection conn = JDBCUtils.getConn();
            List<Object[]> objList = qr.query(conn,sql,new ArrayListHandler(),params);
//            Object[] objArray = qr.update(conn,new ArrayHandler(),params);
            for (Object[] objects : objList) {
                System.out.println(Arrays.toString(objects));
            }

            conn.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
