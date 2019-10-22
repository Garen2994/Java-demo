package garen.java.demo.gjpProject.view;

import garen.java.demo.gjpProject.controller.AccountController;
import garen.java.demo.gjpProject.domain.Account;

import java.util.List;
import java.util.Scanner;

/**
 * @Title : 界面类
 * @Description ： 实现界面效果 接受用户的输入 根据数据，调用不同方法
 * @Author : Garen
 * @Date : 2019/10/21 20:30
 */
public class MainView {
    private AccountController controller = new AccountController();

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=====================Garen记账APP====================");
            System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
            System.out.print("请输入要操作的功能序号[1-5]:");
            switch (sc.nextInt()) {
                case 1:
                    //添加账务模块
                    addAccount();
                    break;
                case 2:
                    //修改账务模块
                    updateAccount();
                    break;
                case 3:
                    //删除账务模块
                    deleteAccount();
                    break;
                case 4:
                    //查询账务模块
                    selectAccount();
                    break;
                case 5:
                    System.exit(0);  //退出当前界面
                    break;
            }
        }
    }

    /**
     * @description 添加账目数据
     */
    public void addAccount(){
        System.out.println("===============================================");
        System.out.println("请输入新的账目内容");
        Scanner sc = new Scanner(System.in);
        System.out.print("输入类别: ");
        String sortName = sc.next();
        System.out.print("输入金额: ");
        double money = sc.nextDouble();
        System.out.print("输入支付方式: ");
        String pay_way = sc.next();
        System.out.print("输入日期(XXXX-XX-XX): ");
        String date = sc.next();
        System.out.print("输入备注信息: ");
        String description = sc.next();

        Account account = new Account(2,sortName,money,pay_way,date,description); //id设置为自动增长,传入0即可
        controller.addAccount(account);
        System.out.println("添加账目成功!");
    }

    /**
     * @description 删除账目数据
     */
    private void deleteAccount(){
        selectAll();
        System.out.println("================================================");
        System.out.print("请输入要删除的账目id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        controller.deleteAccount(id);
        System.out.println("删除账目成功!");
    }

    private void updateAccount(){
        selectAll();
        System.out.println("================================================");
        System.out.print("请输入要修改的账目id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.print("输入分类名称: ");
        String sortName = sc.next();
        System.out.print("输入金额: ");
        double money = sc.nextDouble();
        System.out.print("输入支付方式: ");
        String pay_way = sc.next();
        System.out.print("输入日期(XXXX-XX-XX): ");
        String createtime = sc.next();
        System.out.print("输入备注信息: ");
        String description = sc.next();
        Account account = new Account(id, sortName, money, pay_way, createtime, description);
        controller.updateAccount(account);
        System.out.println("修改账目成功!");
    }
    /**
     * @description 查询子菜单界面 ：1.查询所有 2.条件查询
     */
    private void selectAccount() {
        System.out.println("========================查询界面========================");
        System.out.println("1. 查询所有账目\t\t\t2. 按条件查询账目\t\t\t  3.返回上一层");
        System.out.print("请输入要操作的功能序号[1-2]:");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                selectAll();
                break;
            case 2:
                select();
                break;
            case 3:
                run();
                break;
        }
    }

    /**
     * @description 查询所有账目的方法
     */
    private void selectAll() {
        List<Account> list = controller.selectAll();
        if (list.size() == 0) {
            System.out.println("没有查询到数据!");
        } else {
            print(list);
        }
    }

    /**
     * @description 按条件查询账目方法
     */
    private void select() {
        System.out.println("===================================================");
        System.out.println("请输入查询日期条件(xxxx-xx-xx)");
        Scanner sc = new Scanner(System.in);
        System.out.print("开始日期: ");
        String startDate = sc.nextLine();
        System.out.print("结束日期: ");
        String endDate = sc.nextLine();
        List<Account> list = controller.select(startDate,endDate);

        if(list.size() == 0){
            System.out.println("没有查询到数据!");
        }else{
            print(list);
        }
    }

    /**
     * @description 输出表数据
     * @param list
     */
    private void print(List<Account> list) {
        System.out.println("=============================账目清单============================");
        System.out.println("ID\t\t类别\t\t金额\t\t支付方式\t\t\t时间\t\t备注");
        for (Account account : list) {
            System.out.println(account.getId() + "\t\t" + account.getSortname() + "\t\t"
                    + account.getMoney() + "\t\t" + account.getPay_way() + "\t\t" + account.getCreatetime() +
                    "\t\t" + account.getDescription());
        }
    }
}
