package garen.java.demo.demo19.ConnectionPool;

import org.apache.commons.dbutils.QueryRunner;
/**/
public class ConnectionPoolTest {
    public static void main(String[] args) {
        try{
            QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
            String sql = "INSERT INTO sort VALUES(?,?)";
            Object[] params = {32610,"佳"};
            int line = qr.update(sql, params);
            System.out.println("line = " + line);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
