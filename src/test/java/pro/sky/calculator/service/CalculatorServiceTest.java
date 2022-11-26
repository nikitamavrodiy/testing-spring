package pro.sky.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorServiceTest {
    private int num1;
    private int num2;
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp(){
        num1 = 5;
        num2 = 0;
        calculatorService = new CalculatorService();
    }

    @Test
    public void plusNotNull() {
        assertNotNull(calculatorService.plus(num1, num2));
    }

    @Test
    public void minusNotNull() {
        assertNotNull(calculatorService.minus(num1, num2));
    }

    @Test
    public void multiplyNotNull() {
        assertNotNull(calculatorService.multiply(num1, num2));
    }

    @Test
    public void divideNotNullException() {
        if (num2 == 0) {
            try {
                assertNotNull(calculatorService.divide(num1, num2));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            assertNotNull(calculatorService.divide(num1, num2));
        }
    }
}
