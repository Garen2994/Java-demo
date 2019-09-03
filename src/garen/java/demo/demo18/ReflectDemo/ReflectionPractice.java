package garen.java.demo.demo18.ReflectDemo;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/* 案例：
 * 写一个"框架"，不能改变该类的任何代码的前提下
 * 可以帮我们创建任意类的对象
 * 并且执行其中任意方法
 * 实现：
 * 1. 配置文件properties
 * 2. 反射
 * 步骤：
 * 1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 2. 在程序中加载读取配置文件
 * 3. 使用反射技术来加载类文件进内存
 * 4. 创建对象
 * 5. 执行方法
 * */
public class ReflectionPractice {
    public static void main(String[] args) throws Exception{
        Properties pro = new Properties();
        //创建本类加载器 getResourceAsStream() 加载获取资源的输入流
        ClassLoader classLoader = ReflectionPractice.class.getClassLoader();

        InputStream is = classLoader.getResourceAsStream("garen/java/demo/demo18/ReflectDemo/pro.properties");//相对路径
//        InputStream is = classLoader.getResourceAsStream("pro.properties");

        //从输入流中加载出一个属性集，双列的
        pro.load(is);

        String className = pro.getProperty("className");
        System.out.println(className);

        String methodName = pro.getProperty("methodName");
        System.out.println(methodName);

        //加载类进入内存，Class的forName()方法，有参数是本类的类加载器，如果没有指定加载器则默认使用根类加载器
//        返回Class对象，使用newInstance实例化
//        Object obj  = Class.forName(className).getDeclaredConstructor().newInstance();
        Class<?> cls = Class.forName(className);
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);

    }

}
