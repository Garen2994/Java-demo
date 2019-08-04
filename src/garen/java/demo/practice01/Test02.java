package garen.java.demo.practice01;

/*水仙花数练习(easy)
 明确什么样的数就是水仙花数。水仙花数是指一个3位数（100-999之间），其每位数字立方之和等于该3位数本身。
  如153 = 1*1*1 + 3*3*3 + 5*5*5，即 3位数本身 = 百位数立方 + 十位数立方 + 个位数立方;
 获取水仙花范围内的所有3位数（100-999之间的每个3位数）
 判断该3位数是否满足水仙花数，满足，打印该3位数
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i =100 ; i<= 999; i++) {

            int bai = (i/100)%10;
            int shi = (i/10)%10;
            int ge = i % 10;
            if(i == bai*bai*bai + shi*shi*shi + ge*ge*ge) {

                System.out.println(i + "=" + bai * bai * bai + "+" + shi * shi * shi + "+" + ge * ge * ge);

            }
        }
    }
}
