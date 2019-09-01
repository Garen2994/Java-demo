package garen.java.demo.demo16;

import java.util.Arrays;
import java.util.Comparator;

public class PersonArrayDemo {
    public static void main(String[] args) {
        Person[] arr = {new Person("Garen",18),new Person("Ariana",28),new Person("Skylar",24)};
/*        Arrays.sort(arr, new Comparator<Person>() { //前面-后面 为升序
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/
        //有参数有返回值的方法 用lambda表达式
        Arrays.sort(arr,(o1,o2)-> o1.getAge()-o2.getAge());//省略了可以推导出的参数类型、{}、return、分号
        for (Person person : arr) {
            System.out.println(person.getName() + "..." +person.getAge());
        }

    }
}
