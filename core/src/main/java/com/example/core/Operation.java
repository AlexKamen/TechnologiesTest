package com.example.core;

public enum Operation {
    PLUS,
    MINUS;

    static Operation of (String str) {
        return Operation.valueOf(str.toUpperCase());
    }
}
