package garen.java.demo.demo10.day19;
// 并发修改异常解决办法 使用ListIterator迭代器
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//import java.util.Iterator;

public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("adc1");
        list.add("adc2");
        list.add("adc3");
        list.add("adc4");
        list.add("adc5");
      //  System.out.println(list);

//        list.add(1,"garen");  //插入方法
//        System.out.println(list);
//
//        list.remove(2); //删除
//        list.remove("adc4");
//        System.out.println(list.get(3)); //获取，查找
//        list.set(2,"garen01"); //更改
//        System.out.println(list);
        function(list);
    }

    public static void function(List<String> list) {
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {

            String s = it.next();
            if (s.equals("adc3")) {
                it.add("adc6");
            }
           // System.out.println(it.next() + "," + it.previousIndex() + "," + it.nextIndex());

        }
        while (it.hasPrevious()){
            System.out.println(it.previous() +" ");
        }
        it = list.listIterator(1);//调用listIterator(n)方法创建一个一开始就指向列表索引为n的元素处的ListIterator。
        while (it.hasNext()){
            String t = it.next();
//            System.out.println(t);
            if("adc4".equals(t)){
                it.set("abc4");
            }
        }
        it.add("kkk");
        System.out.println("After iterate : " + list);
    }

}
