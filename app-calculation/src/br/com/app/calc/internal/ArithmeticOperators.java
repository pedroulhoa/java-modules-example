package br.com.app.calc.internal;

import java.util.Arrays;

public class ArithmeticOperators {

    public double sum(Double... nums) {
        return Arrays.stream(nums).reduce(0.0, Double::sum);
    }

}
