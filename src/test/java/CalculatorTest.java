package src.test.java;

import src.main.java.Calculator;

public class CalculatorTest {
    
    @Tag("fast")
    @Test
    public void testAdditionAndMultiplication(){
        Calculator calculator = new Calculator();

        assertEquals(10, calculator.sum(3,7), "3 + 7 must be 10");
        assertEquals(-6, calculator.sum(-10,3), "-10 + 3 must be -7");

        assertEquals(21, calculator.mul(3,7), "3 * 7 must be 21");
        assertEquals(-20, calculator.sum(2,-10), "2 * -10 must be -20");
    }
}
