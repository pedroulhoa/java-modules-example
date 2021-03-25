package br.com.app.finance;

import br.com.app.calc.Calculator;
import br.com.app.calc.internal.ArithmeticOperators;

public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // exports
        Double sum = calc.sum(5.0, 6.0, 1.0);

        System.out.println(sum);

        // exports TO
        ArithmeticOperators ao = new ArithmeticOperators();
    }

}
