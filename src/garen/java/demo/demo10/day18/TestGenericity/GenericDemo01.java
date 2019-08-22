package garen.java.demo.demo10.day18.TestGenericity;

import garen.java.demo.demo08.HotelDemo.Cook;
import garen.java.demo.demo08.HotelDemo.Employee;
import garen.java.demo.demo08.HotelDemo.Manager;
import garen.java.demo.demo08.HotelDemo.Waiter;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  将的酒店员工,厨师,服务员,经理,分别存储到3个集合中
 *  定义方法,可以同时遍历3集合,遍历三个集合的同时,可以调用工作方法
 */
public class GenericDemo01 {
    public static void main(String[] args) {
        ArrayList<Cook> cooks = new ArrayList<>();
        ArrayList<Waiter> waiters = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();

        cooks.add(new Cook("张三", "后厨001"));
        cooks.add(new Cook("李四", "后厨002"));

        waiters.add(new Waiter("翠花", "服务部001"));
        waiters.add(new Waiter("酸菜", "服务部002"));

        managers.add(new Manager("小名", "董事会001", 123456789.32));
        managers.add(new Manager("小强", "董事会002", 123456789.33));

        iterator(cooks);
        iterator(waiters);
        iterator(managers);
    }
    public static void iterator(ArrayList<? extends Employee> array){

        Iterator<? extends Employee> it = array.iterator();
        while(it.hasNext()){
            Employee e = it.next();
            e.work();
        }

    }
}
