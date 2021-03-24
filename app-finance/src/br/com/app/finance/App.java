package br.com.app.finance;

import br.com.app.calc.Calculator;

public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Double sum = calc.sum(5.0, 6.0, 1.0);

        System.out.println(sum);
    }

}
