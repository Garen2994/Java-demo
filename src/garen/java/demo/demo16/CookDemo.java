package garen.java.demo.demo16;
/*
* 使用lambda标准格式调用invokeCook方法*/
public class CookDemo {
    public static void main(String[] args) {
        //调用invokeCook()，参数是Cook接口
/*        invokeCook(new Cook (){
            @Override
            public void makefood() {
                System.out.println("开饭啦！");
            }
        });*/

        //使用lambda表达式调用，简化匿名内部类的书写
        invokeCook(()->{
            System.out.println("开饭啦！");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makefood();
    }
}
