package garen.java.demo.demo19.JDBC;

import java.sql.*;

public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
        //注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取数据库连接对象
        Statement stat = null;
        Connection conn = null;
        try {
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day28_demo?serverTimezone=UTC" +
//                    "&characterEncoding=utf-8", "root", "hjl1115326");
            JDBCUtils jd = new JDBCUtils();
            conn = jd.getConn();
            stat = conn.createStatement();
            //增
            String sql1 = "INSERT INTO sort VALUES(89757,'粒')";
            int i1 = stat.executeUpdate(sql1);
            //        int i1 = stat.executeUpdate("INSERT INTO sort VALUES(105326,'琳')");
            //删
            int i2 = stat.executeUpdate("DELETE FROM sort where sid = 67890");
            //改
            String sql3 = "UPDATE sort set sname = '侯' where sid = 67890";
            int i3 = stat.executeUpdate(sql3);
            //查
            ResultSet result = stat.executeQuery("SELECT distinct * from sort");
            while (result.next()) {

                int id = result.getInt(1);
                String name = result.getString("sname");
                System.out.println(id + "---" + name);

            }
        } catch (SQLException se) {

            se.printStackTrace();

        } finally {
//            stat.close();
//            conn.close();
            if(stat != null){
                try{
                    stat.close();
                }catch(SQLException s){
                    s.printStackTrace();
                }
            }

            if(conn != null){
                try{
                    conn.close();
                }catch(SQLException s1){
                    s1.printStackTrace();
                }
            }
        }

    }
}
