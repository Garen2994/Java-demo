package garen.java.demo.demo02;

import java.util.Scanner;

/* 练习1：
   编写代码实现如下内容：if语句实现考试成绩分等级(使用switch语句)。
	[90-100]	A等。
	[80-90) 	B等。
	[70-80) 	C等。
	[60-70) 	D等。
	[0-60)  	E等。
	请根据给定成绩，输出对应的等级。
	说明："["表示包含，")"表示不包含
 */
public class Demo02 {
    public static void main(String[] args) {
        char c;
        while (true) {
            System.out.println("请输入学生成绩");
            @SuppressWarnings("resource")
            int studentScore = new Scanner(System.in).nextInt();
            if (studentScore >= 90 && studentScore <= 100) {
                c = 'A';
                break;
            } else if (studentScore >= 80 && studentScore < 90) {
                c = 'B';
                break;
            } else if (studentScore >= 70 && studentScore < 80) {
                c = 'C';
                break;
            } else if (studentScore >= 60 && studentScore < 70) {
                c = 'D';
                break;
            } else if (studentScore >= 0 && studentScore < 60) {
                c = 'E';
                break;
            } else {
                System.out.println("数值超出范围,请重新输入！");
            }
        }
        switch (c) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("出现错误！");
        }
    }
}

