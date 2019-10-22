package garen.java.demo.gjpProject.Dao;

import garen.java.demo.demo19.JDBC.JDBCUtils;
import garen.java.demo.gjpProject.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Title : Dao
 * @Description : 连接数据库 对数据进行增删改查
 * @Author : Garen
 * @Date : 2019/10/21 20:15
 */
public class AccountDao {
    private QueryRunner qr = new QueryRunner();
    Connection conn = JDBCUtils.getConn();

    /**
     * ***************************
     * **       增添账目         **
     * **                       **
     * ***************************
     */

    public void addAccount(Account account) {
        try {
            String sql = "INSERT INTO account(sortname,money,pay_way,createtime,description) VALUES (?,?,?,?,?)";

            Object[] param = {account.getSortname(), account.getMoney(), account.getPay_way(), account.getCreatetime(),
                    account.getDescription()};
            int update = qr.update(conn, sql, param);
//            System.out.println(update);
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("添加账目操作失败!");
        }
    }

    /**
     * ***************************
     * **       删除账目         **
     * **                       **
     * ***************************
     */

    public void deleteAccount(int id) {

        try {
            String sql = "DELETE FROM account WHERE id = ?";
            Object[] param = {id};
            qr.update(conn, sql, param);
        } catch (SQLException se) {
            System.out.println(se);
            throw new RuntimeException("删除账目操作失败!");
        }
    }

    /**
     * ***************************
     * **       更改账目         **
     * **                       **
     * ***************************
     */

    public void updateAccount(Account account) {
        try {
            String sql = "UPDATE account SET sortname = ?,money = ?,pay_way = ?,createtime = ?,description = ? WHERE " +
                    "id = ? ";
            Object[] param = {account.getSortname(), account.getMoney(), account.getPay_way(), account.getCreatetime(),
                    account.getDescription(), account.getId()};
            qr.update(conn, sql, param);
        } catch (SQLException se) {
            System.out.println(se);
            throw new RuntimeException("修改账目操作失败");
        }
    }
    /**
     * ***************************
     * **       查询账目         **
     * **                       **
     * ***************************
     */

    /**
     * @return
     * @description 查询所有账目操作
     */
    public List<Account> selectAll() {
        try {
            String sql = "SELECT * FROM account";
            List<Account> accounts = qr.query(conn, sql, new BeanListHandler<Account>(Account.class));
            return accounts;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("查询账目操作失败!");
        }
    }

    /**
     * @param s1
     * @param s2
     * @return
     * @description 按条件查询账目
     */
    public List<Account> select(String s1, String s2) {
        try {
            Object[] param = {s1, s2};
            String sql = "SELECT *FROM account WHERE createtime BETWEEN ? AND ?";
            List<Account> list = qr.query(conn, sql, new BeanListHandler<Account>(Account.class), param);
            return list;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("查询账目操作失败!");
        }
    }
}
