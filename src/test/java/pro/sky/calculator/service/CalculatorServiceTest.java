package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorServiceTest {
    private CalculatorService calculatorService = new CalculatorService();

    public static List<Arguments> plusTestSuites() {
        return List.of(
                Arguments.of(10, 5),
                Arguments.of(-5, 6),
                Arguments.of(6, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("plusTestSuites")
    public void plusTest(int num1, int num2) {
        int result = num1 + num2;
        Assertions.assertEquals(result, calculatorService.plus(num1, num2));
        System.out.printf("Всё верно, %d + %d = %d\n", num1, num2, result);
    }

    @ParameterizedTest
    @MethodSource("plusTestSuites")
    public void minusTest(int num1, int num2) {
        int result = num1 - num2;
        Assertions.assertEquals(result, calculatorService.minus(num1, num2));
        System.out.printf("Всё верно, %d - %d = %d\n", num1, num2, result);
    }

    @ParameterizedTest
    @MethodSource("plusTestSuites")
    public void multiplyTest(int num1, int num2) {
        int result = num1 * num2;
        Assertions.assertEquals(result, calculatorService.multiply(num1, num2));
        System.out.printf("Всё верно, %d * %d = %d\n", num1, num2, result);
    }

    @ParameterizedTest
    @MethodSource("plusTestSuites")
    public void divideNotNullException(int num1, int num2) {
        if (num2 != 0) {
            int result = num1 / num2;
            Assertions.assertEquals(result, calculatorService.divide(num1, num2));
            System.out.printf("Всё верно, %d / %d = %d\n", num1, num2, result);
        } else {
            Assertions.assertThrows(IllegalArgumentException.class,
                    () -> calculatorService.divide(num1, num2));
            System.out.printf("Всё верно, деление на ноль (%d / %d) выбросит ошибку IllegalArgumentException\n", num1, num2);
        }
    }
}
