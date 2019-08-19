package garen.java.demo.demo08.HotelDemo;

import garen.java.demo.demo04.CallStuName_Random.Student;

import java.util.ArrayList;
import java.util.Random;

public class Demo01HotelService {
    public static void main(String[] args) {
        ArrayList<Employee> array = new ArrayList<Employee>();

        Employee one = addManager("Garen01","mg89757",3000);
        Employee two = addCook("Garen02","ck89757");
        Employee three = addWaiter("Jane","wt89757");
        Employee four = addWaiter("Rain","wt89758");
        array.add(one);
        array.add(two);
        array.add(three);
        array.add(four);
        printEmployeeList(array);
        lottery(array);
//        method(one);
//        method(two);
//        method(four);

    }


    public static Employee addCook(String name, String id) {
        Employee ee = new Cook(name, id);
        return ee;
    }

    public static Employee addManager(String name, String id, int award) {
        Employee ee = new Manager(name, id, award);
        return ee;
    }

    public static Employee addWaiter(String name, String id) {
        Employee ee = new Waiter(name, id);
        return ee;
    }

    public  static void method(Employee ee){
        ee.work();
    }
    public static void printEmployeeList(ArrayList<Employee> array){
        System.out.println("=====全体员工列表======");
        System.out.println("Name     " + "    ID   ");
        for (Employee ee : array) {
            System.out.println(ee.getName() + "    " + ee.getId());
        }

    }
    public static void lottery(ArrayList<Employee> array){
        Random ran = new Random();
        int index = ran.nextInt(array.size());
        Employee ee = array.get(index);
        System.out.println("=====中奖公示=====");
        System.out.println("中奖的员工是工号为：" + ee.getId() + " 的 " + ee.getName() + " 员工。恭喜他！！！");
    }

}
