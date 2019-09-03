package garen.java.demo.demo18.JUnitDemo;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    /*
     * 测试add方法
     * */
    @BeforeEach
    public void init(){
        System.out.println("init...");

    }
    @AfterEach
    public void close(){
        System.out.println("Close...");
    }
    @Test
    public void testAdd() {

        Calculator cal = new Calculator();
        int result = cal.add(6, 8);

        System.out.println(result);
        Assertions.assertEquals(14,result);

    }
}
