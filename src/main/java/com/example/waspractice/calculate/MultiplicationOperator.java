package com.example.waspractice.calculate;

public class MultiplicationOperator implements NewArithmeticOperator{
    @Override
    public boolean supports(String operator) {
        return "*".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operate1, PositiveNumber operate2) {
        return operate1.toInt()*operate2.toInt();
    }
}
