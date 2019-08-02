package garen.java.demo.demo03;

import java.util.Scanner;

/*
库存管理系统
@author Garen.Hou

将对下列功能进行方法封装：
1.	打印库存清单功能
2.	库存商品数量修改功能
3.	退出程序功能
*/
public class ManageDemo {
    public static void main(String[] args) {
        //记录库存商品信息
        //品牌型号
        String[] brands = new String[]{"MacBookAir", "ThinkpadT450"};
        //尺寸大小
        double[] sizes = new double[]{13.3, 14.0};
        //价格
        double[] prices = new double[]{6988.88, 5999.99};
        //库存个数
        int[] counts = new int[]{0, 0};


        while (true) {
            int func = chooseFunc();
            switch (func) {
                case 1:
                    printStore(brands,sizes,prices,counts);
                    break;
                case 2:
                    update(brands,counts);
                    break;
                case 3:
                    exit();
                    return;  //break只退出循环体，return 主函数运行结束
                default:
                    System.out.println("------------------------------");
                    System.out.println("序号输入错误！请输入正确序号！");
                    break;
            }
        }
    }

    /**
     * 库存管理功能菜单
     *
     * @return 管理员键盘输入的功能操作序号
     */
    public static int chooseFunc() {

        System.out.println("--------------库存管理--------------");
        System.out.println("1.查看库存");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
        System.out.println("-------请输入要执行的操作序号-------");

        Scanner sc = new Scanner(System.in);
        int choose =sc.nextInt();
        return choose;

    }

    /**
     * 查看库存清单
     *
     * @param brands 商品品牌型号
     * @param sizes  商品尺寸大小
     * @param prices 商品价格
     * @param counts 商品库存个数
     */

    public static void printStore(String[] brands, double[] sizes, double[] prices, int[] counts) {

        int totalCount = 0;
        double totalMoney = 0.0;

        System.out.println("---------------------------查看库存清单--------------------------");
        System.out.println("品牌型号		尺寸	价格	库存数");
        for (int i = 0; i < brands.length; i++) {
            totalCount += counts[i];
            totalMoney += prices[i] * counts[i];
            System.out.println(brands[i] + "	" + sizes[i] + "	" + prices[i] + "    " + counts[i]);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("总库存数：" + totalCount);
        System.out.println("库存商品总金额：" + totalMoney);
    }

    /**
     * 修改商品库存数量
     * @param brands 商品品牌型号
     * @param counts 商品库存个数
     */
    public static void update(String[] brands, int[] counts) {

        System.out.println("------------修改商品库存数量-----------");
        for (int i = 0; i < brands.length; i++) {
            System.out.println("请输入 " + brands[i] + "的库存数");
            counts[i] = new Scanner(System.in).nextInt();
        }

    }
    /**
     * 退出
     */
    public static void exit(){

        System.out.println("----------------退出---------------");
        System.out.println("您已退出系统");

    }
}


