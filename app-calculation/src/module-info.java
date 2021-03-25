module app.calculation {
    exports br.com.app.calc;
    requires transitive app.logging;

    exports br.com.app.calc.internal to app.finance;
}