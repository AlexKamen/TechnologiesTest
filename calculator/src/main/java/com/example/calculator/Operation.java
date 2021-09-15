package com.example.calculator;

import java.util.Locale;

public enum Operation {
    PLUS,
    MINUS;

    static Operation of (String str) {
        return Operation.valueOf(str.toUpperCase());
    }
}
