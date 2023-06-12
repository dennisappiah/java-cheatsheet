package oop.interfaces;

public class TaxReport {
    private ITaxCalculator calculator;
    /* To use the calculator method of the TaxCalculator2020 object,
    we can use the Interface instead to avoid over-dependency of the report class to the
    TaxCalculator2020 class
    * */

    public TaxReport(ITaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

}
