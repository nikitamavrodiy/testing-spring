package pro.sky.calculator.constructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String welcome() {
        return this.calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(int num1, int num2) {
        return this.calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(int num1, int num2) {
        return this.calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(int num1, int num2) {
        return this.calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public String divide(int num1, int num2) {
        return this.calculatorService.divide(num1, num2);
    }


}
