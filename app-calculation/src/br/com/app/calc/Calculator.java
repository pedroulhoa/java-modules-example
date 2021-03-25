package br.com.app.calc;

import br.com.app.calc.internal.ArithmeticOperators;
import br.com.app.logging.Logger;

public class Calculator {

    private ArithmeticOperators ao = new ArithmeticOperators();

    public double sum(Double... nums) {
        Logger.info("Somando...");
        return ao.sum(nums);
    }
}
