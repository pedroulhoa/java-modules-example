package br.com.app.calc;

import br.com.app.calc.internal.ArithmeticOperators;

public class Calculator {

    private ArithmeticOperators ao = new ArithmeticOperators();

    public double sum(Double... nums) {
        return ao.sum(nums);
    }
}
