package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("/calculate/{num1}/{num2}/{oper}")
    public Long calculate(@PathVariable("num1") String num1, @PathVariable("num2") String num2, @PathVariable("oper") String oper) {
        Long result = 0L;
        Long number1 = Long.valueOf(num1);
        Long number2 = Long.valueOf(num2);
        Operation operation = Operation.of(oper);
        switch (operation) {
            case PLUS:
                result = number1 + number2;
                break;
            case MINUS:
                result = number1 - number2;
                break;
            default:
                break;
        }
        return result;
    }
}
