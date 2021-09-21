package com.example.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface CoreController {
    @GetMapping("/calculate/{num1}/{num2}/{oper}")
    Long calculate(@PathVariable("num1") String num1, @PathVariable("num2") String num2, @PathVariable("oper") String oper);
}
