package garen.java.demo.demo18.ReflectDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getName());
//Field
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("====================");
        //getField(String name)
        Field a = personClass.getField("name");
        Field b = personClass.getField("age");
        //获取成员变量的值  get()
        Person p = new Person();
        Object value = a.get(p);
        Object value2 = b.get(p);
//        System.out.println(value);
        //设置成员变量的值 set()方法
        a.set(p,"张三");
        b.set(p,28);
        System.out.println(p);

        //getDeclaredFields() 获取所有成员变量 无论是否是public
        System.out.println("===================");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declareField : declaredFields) {
            System.out.println(declareField);
        }


//Constructor 用来创建对象的
        System.out.println("===================");
        Constructor<Person> constructor = personClass.getConstructor();
        Person person = constructor.newInstance();
        person.setAge(18);
        person.setName("Garen");
        System.out.println(person);

//Method
        System.out.println("==================");
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-------------------");
        Method eat_method = personClass.getMethod("eat");
        eat_method.invoke(person);
        Method eat_method2 = personClass.getMethod("eat",String.class); //String.class是指参数类型
        eat_method2.invoke(person,"Fish");
        System.out.println("------------------");
        System.out.println(eat_method.getName());

//        System.out.println();
    }
}
