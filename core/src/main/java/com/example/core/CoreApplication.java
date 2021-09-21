package com.example.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CoreApplication implements CoreController {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

	@Override
	public Long calculate(final String num1, final String num2, final String oper) {
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
