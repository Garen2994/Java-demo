package garen.java.demo.demo04.ManageStore;

import java.util.ArrayList;
import java.util.Scanner;

/*
    库存查看案例加入集合优化
 */
public class ManageDemo2_0 {
    public static void main(String[] args) {
        ArrayList<Goods> array = new ArrayList<Goods>();
        addGoods(array);

        while(true) {
            int choose = chooseFunction();
            switch (choose) {
                case 1:
                    //查看清单
                    printStore(array);
                    break;
                case 2:
                    //修改
                    update(array);
                    break;
                case 3:
                    exit();
                    return;
                default:
                    System.out.println("输入错误！请重新输入：");
                    break;
            }
        }

    }

    /*
       定义方法,将商品的信息存储到集合中
       集合是所有方法的共享数据,参数传递
    */
    public static void addGoods(ArrayList<Goods> array) {
        Goods g1 = new Goods();
        Goods g2 = new Goods();
        Goods g3 = new Goods();

        g1.brand = "MacBook";
        g1.size = 13.3;
        g1.price = 10000;
        g1.count = 3;

        g2.brand = "MacBook Pro";
        g2.size = 15.6;
        g2.price = 20000;
        g2.count = 2;

        g3.brand = "ThinkPad";
        g3.size = 15.6;
        g3.price = 4000;
        g3.count = 1;

        //Goods类型的变量,存储到集合中
        array.add(g1);
        array.add(g2);
        array.add(g3);

    }

    /*
    定义方法,查看库存清单,遍历集合
    */
    public static void printStore(ArrayList<Goods> array) {
        System.out.println("========商品库存清单========");
        System.out.println("品牌型号    尺寸    价格     库存数");
        int totalCount = 0;
        double totalMoney = 0.0;

        for (Goods g : array) {
            System.out.println("  " + g.brand + "    " + g.size + "    " + g.price + "    " + g.count);
            totalCount += g.count;
            totalMoney += g.count * g.price;
        }

        System.out.println("总库存数: " + totalCount);
        System.out.println("商品库存总金额: " + totalMoney);

    }

    /*
        方法定义,修改库存
		键盘的输入,将Goods中的属性值,修改
     */
    public static void update(ArrayList<Goods> array) {
        Scanner sc = new Scanner(System.in);
        for (Goods g : array) {
            System.out.println("请输入" + g.brand + "的库存数");
            g.count = sc.nextInt();
        }

    }

    public static int chooseFunction() {

        System.out.println("-------------库存管理------------");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
        System.out.println("请输入要执行的操作序号：");

        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        return choose;

    }

    public static void exit() {

        System.out.println("========您已退出========");

    }

}
