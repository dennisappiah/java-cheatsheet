package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2020(20000);
        var report = new TaxReport(calculator);

        report.show();
    }
}
