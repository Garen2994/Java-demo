package garen.java.demo.gjpProject.service;

import garen.java.demo.gjpProject.Dao.AccountDao;
import garen.java.demo.gjpProject.domain.Account;

import java.util.List;

/**
 * @Title :　业务层类
 * @Description : 接受控制层controller的数据，经过计算，传递给dao层，操作数据库
 * 调用dao层中的类，类成员位置，创建dao类中的对象
 * @Author : Garen
 * @Date : 2019/10/21 20:21
 */
public class AccountService {
    private AccountDao dao = new AccountDao();

    /**
     * @description 增加账目
     * @param account
     */
    public void addAccount(Account account){
        dao.addAccount(account);
    }

    /**
     * @description 删除账目---按id
     * @param id
     */
    public void deleteAccount(int id){
        dao.deleteAccount(id);
    }

    public void updateAccount(Account account){
        dao.updateAccount(account);
    }
    public List<Account> selectAll() {
        return dao.selectAll();
    }

    /**
     * @description 查询账目---按起止时间
     * @param s1
     * @param s2
     * @return
     */
    public List<Account> select(String s1,String s2){
        return dao.select(s1, s2);
    }
}
