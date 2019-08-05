package garen.java.demo.demo05.PersonTest;

/*  封装
    private关键字
    get和set方法
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        //调用set方法,设置成员变量的值
        p.setAge(18);
        p.setName("李蕾");
        p.speak();
        //调用get方法,获取成员变量的值
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.equalsAge(p));

    }
}
