package garen.java.demo.demo19.DBUtils;

import garen.java.demo.demo19.JDBC.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
//import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.util.List;

public class BeanHandlerDemo {
    public static void main(String[] args) {
        try{
            QueryRunner qr = new QueryRunner();
            String sql = "SELECT * FROM sort WHERE sid = ?";
            String sql1 = "SELECT * FROM sort";
            Object[] params1 = {};
            Object[] params = {12345};

            Connection conn = JDBCUtils.getConn();
//            SortDBBean sb = qr.query(conn,sql,new BeanHandler<SortDBBean>(SortDBBean.class),params);
            List<SortDBBean> sbList = qr.query(conn, sql1, new BeanListHandler<SortDBBean>(SortDBBean.class),
                    params1);
            for (SortDBBean bean : sbList) {
                System.out.println(bean.toString());
            }
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
