package garen.java.demo.demo16.JDK8_FunctionalInterface;
/*
* Lambda优化日志案例
*/

public class LoggerDemo {
    public static void main(String[] args) {
        String msg1 = "Hello, ";
        String msg2 = "This is ";
        String msg3 = "Garen.";

        //先拼接字符串再作为参数传递
        //简化的Lambda表达式作为参数传递

        showLog(1,(()->msg1+msg2+msg3));
    }

    public static void showLog(int level,MessageBuilder mb){
        //根据日志等级，显示日志信息
        if(level == 1){

            System.out.println(mb.buildMessage());

        }
    }

}
