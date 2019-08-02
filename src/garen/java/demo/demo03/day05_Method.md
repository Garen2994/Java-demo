## day05 内容

1. 方法基础知识
2. 方法高级内容
3. 方法案例

### 01 方法的概述

- 为什么要有方法？

  ：提高代码的复用性

- 什么是方法？

  ：完成特定功能的代码块

### 02 方法的定义格式

- ##### 方法的格式

  ```java
  修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
  				方法体语句;
  				return 返回值; 
  			} 
  ```

- ##### 方法的格式说明

   - 修饰符：目前就用 public static。后面再详细的讲解其他修饰符。
   
   * 返回值类型：就是功能结果的数据类型。
   * 方法名：符合命名规则即可。方便我们的调用。
   * 参数：
         * 实际参数：就是实际参与运算的。
         * 形式参数；就是方法定义上的，用于接收实际参数的。
   * 参数类型：就是参数的数据类型
   * 参数名：就是变量名
   * 方法体语句：就是完成功能的代码。
   * return：结束方法的。
   * 返回值：就是功能的结果，由return带给调用者。 

### 03  定义方法计算面积

- 定义方法计算面积

  ```java
  public class MethodDemo{
  	
  			public static void main(String[] args){
  				 //调用方法, 方法执行起来
  				 // 在方法main中,调用方法 getArea
  		
  				 int area = getArea(5,6);
  				 System.out.println("面积是: "+area);
  			}
  			/*
  			   要求: 计算一个长方形的面积
  			   定义方法解决这个要求
  			   分析方法定义过程:
  			      1.明确方法计算后的结果的数据类型 int  定义格式对应的就是返回值类型
  				  2.方法计算过程中,有没有未知的数据, 宽和长, 未知数据的数据类型 int
  				      未知数的变量,定义在方法的小括号内
  			*/
  			public static int  getArea(int w, int h){
  				//实现方法的功能主体
  				//int area = w * h;
  				return w * h;
  			}
  		}
  ```

### 04  调用方法

- 调用方法
  * a: 在main函数中调用方法，让方法执行起来
  * b: 方法的形参
       	方法要什么参数我们就给什么类型的参数。
  * c: 方法的返回值
       	方法返回什么类型的值我们就用对应的数据类型的变量来接收
### 05  调用方法执行流程  			
* A: 调用方法执行流程
	* a: 方法的定义是没有顺序的，写在main函数的上边或者下边都可以。
	* b: 方法的执行，是把实参传递给形参，从而来执行的。
	* c: 方法只有被调用才会执行。  		
	
* B: 调用方法执行流程图

  ![方法调用流程](https://github.com/Garen2994/Image/blob/master/img/%E6%96%B9%E6%B3%95%E7%9A%84%E8%B0%83%E7%94%A8%E6%B5%81%E7%A8%8B.JPG)

### 06 方法调用的内存图
* A: 方法调用的内存图
	
  ![方法内存图](https://github.com/Garen2994/Image/blob/master/img/%E6%96%B9%E6%B3%95%E5%86%85%E5%AD%98%E5%9B%BE.JPG)

### 07 方法的重载

Java允许在一个类中定义多个名称相同的方法，但是参数的类型或个数必须不同，这就是方法的重载。下面的三个方法互为重载关系：

- public static int add(int x,int y) {逻辑} //两个整数加法

- public static int
  add(int x,int y,int z) //三个整数加法
  
- public static int add(double x,double y) {逻辑} //两个小数加法


#### * 重载的注意事项

- 重载方法参数必须不同：
	    参数个数不同，如method(int x)与method(int x,int y)不同
	    参数类型不同，如method(int x)与method(double x)不同g
	    参数顺序不同，如method(int x,double y)与method(double x,int y)不同
	
- 重载只与方法名与参数类型相关与返回值无关
        如void method(int x)与int method(int y)不是方法重载，不能同时存在
    
- 重载与具体的变量标识符无关
        如method(int x)与method(int y)不是方法重载，不能同时
    
    

#### * 参数传递

![参数传递](https://github.com/Garen2994/Image/blob/master/img/args.png)

 #### 结论：

- 当调用方法时，如果传入的数值为基本数据类型（包含String类型），形式参数的改变对实际参数不影响。

- 当调用方法时，如果传入的数值为引用数据类型（String类型除外），形式参数的改变对实际参数有影响。

  