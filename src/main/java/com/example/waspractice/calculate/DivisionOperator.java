package com.example.waspractice.calculate;

public class DivisionOperator implements NewArithmeticOperator{

    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operate1, PositiveNumber operate2) {
        if (operate2.toInt() == 0)
            throw new IllegalArgumentException("0으로 나눌수 없습니다.");
        return operate1.toInt()/operate2.toInt();
    }
}
