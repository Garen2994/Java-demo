package garen.java.demo.gjpProject.view;

import java.util.Scanner;

/**
 * @Title : 界面类
 * @Description ： 实现界面效果 接受用户的输入 根据数据，调用不同方法
 * @Author : Garen
 * @Date : 2019/10/21 20:30
 */
public class MainView {
    public void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("=====================  Garen 记账APP ====================");
            System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
            System.out.print("请输入要操作的功能序号[1-5]:");
            switch(sc.nextInt()){
                case 1:
                    //对应添加账务模块
                    break;
                case 2:
                    //修改账务模块
                    break;
                case 3:
                    //删除账务模块
                    break;
                case 4:
                    //查询账务模块
                    break;
                case 5:
                    System.exit(0);  //退出当前界面
                    break;
            }

        }
    }
}
