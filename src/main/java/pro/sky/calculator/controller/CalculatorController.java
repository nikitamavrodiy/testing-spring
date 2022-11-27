package pro.sky.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<String> illegalNumberHandler(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @GetMapping()
    public String welcome() {
        return this.calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(int num1, int num2) {
        return String.format("%d + %d = %d", num1, num2, calculatorService.plus(num1, num2));
    }

    @GetMapping("/minus")
    public String minus(int num1, int num2) {
        return String.format("%d - %d = %d", num1, num2, calculatorService.minus(num1, num2));
    }

    @GetMapping("/multiply")
    public String multiply(int num1, int num2) {
        return String.format("%d * %d = %d", num1, num2, calculatorService.multiply(num1, num2));
    }
    @GetMapping("/divide")
    public String divide(int num1, int num2) {
        return String.format("%d * %d = %d", num1, num2, calculatorService.divide(num1, num2));
    }


}
