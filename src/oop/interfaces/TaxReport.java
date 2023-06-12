package oop.interfaces;

public class TaxReport {
    private TaxCalculator calculator;
    /* To use the calculator method of the TaxCalculator2020 object,
    we can use the Interface instead to avoid over-dependency of the report class to the
    TaxCalculator2020 class
    * */

    public TaxReport(TaxCalculator2020 calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

}
