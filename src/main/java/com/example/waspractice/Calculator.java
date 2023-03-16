package com.example.waspractice;


import com.example.waspractice.calculate.*;

import java.util.List;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperators = List.of(new ADDitionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());


    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2){
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
