package com.example.calculator;

public class Calculator {
    public static float calculate (float firstNumber, float secondNumber, char calculator) {
        switch (calculator) {
            case '+' :
                return firstNumber + secondNumber;
            case '-' :
                return firstNumber - secondNumber;
            case '*' :
                return firstNumber * secondNumber;
            case '/' :
                if (secondNumber != 0) {
                    return firstNumber / secondNumber;
                }else {
                    throw new RuntimeException("Can't divide by zero");
                }
            default:
                throw new RuntimeException("invalid calculator");
        }
    }
}
