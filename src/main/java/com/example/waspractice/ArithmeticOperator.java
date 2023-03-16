package com.example.waspractice;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+"){
        @Override
        public int calculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }, SUBTRACTION("-") {
        @Override
        public int calculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int calculate(int operand1, int operand2) {
            return operand1*operand2;
        }
    }, DIVISION("/") {
        @Override
        public int calculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    private final String operator;

    public static int Arithmeticcalculate(int a, String b, int c) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(b))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다"));
        return arithmeticOperator.calculate(a,c);
    }


    public abstract int calculate(final int operand1 , final int operand2);
}
