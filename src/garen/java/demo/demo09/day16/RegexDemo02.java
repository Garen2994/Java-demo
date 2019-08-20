package garen.java.demo.demo09.day16;
/*
检查邮件地址是否合法
        1234567@qq.com
mym_ail@sina.com
nimail@163.com
        wodemail@yahoo.com.cn
@: 前  数字字母_ 个数不能少于1个
@: 后  数字字母     个数不能少于1个
        .: 后面 字母
        */
public class RegexDemo02 {
    public static void main(String[] args) {
        String email = "1234567@qq.com";
        String email1 = "mym_ail@sina.com";
        String email2 = "sdsd@sina.co1m";
        String email3 = "@123.com";

        checkMail(email);
        checkMail(email1);
        checkMail(email2);
        checkMail(email3);
    }
    public static void checkMail(String email){
        boolean b = email.matches("\\w+@[0-9a-z]+\\.[a-z]+");
        if (b) {
            System.out.println("邮件地址 " + email + " 合法！");
        }else{
            System.out.println("邮件地址 " + email + " 不合法！") ;
        }

    }

}
