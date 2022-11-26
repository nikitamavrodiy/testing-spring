package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        return num1 + " + " + num2
                + " = " + (num1 + num2);
    }

    public String minus(int num1, int num2) {
        return num1 + " - " + num2
                + " = " + (num1 - num2);
    }

    public String multiply(int num1, int num2) {
        return num1 + " * " + num2
                + " = " + (num1 * num2);
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Ошибка: в качестве второго параметра число 0 передать нельзя");
        }
        return num1 + " / " + num2
                + " = " + (num1 / num2);
    }

}
