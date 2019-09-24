package garen.java.demo.gjpProject;

import garen.java.demo.gjpProject.domain.JDBCUtils;

import java.sql.Connection;

public class AccountDemo {
    public static void main(String[] args) {
        Connection conn = JDBCUtils.getConn();
    }
}
