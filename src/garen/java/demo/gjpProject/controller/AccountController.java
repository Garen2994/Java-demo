package garen.java.demo.gjpProject.controller;

import garen.java.demo.gjpProject.domain.Account;
import garen.java.demo.gjpProject.service.AccountService;

import java.util.List;

/**
 * @Author : Garen
 * @Date : 2019/10/21 20:28
 */
public class AccountController {
    private AccountService service = new AccountService();

    public void addAccount(Account account){
        service.addAccount(account);
    }
    public void deleteAccount(int id){
        service.deleteAccount(id);
    }
    public void updateAccount(Account account){
        service.updateAccount(account);
    }
    public List<Account> selectAll() {
        return service.selectAll();
    }

    public List<Account> select(String s1, String s2){
        return service.select(s1,s2);
    }
}
