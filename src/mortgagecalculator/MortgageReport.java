package mortgagecalculator;

import java.text.NumberFormat;

public class MortgageReport {
    private final NumberFormat currencyInstance;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        //once the field is set in the constructor, it cannot be set
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgagePayment();

        String mortgageFormatted = currencyInstance.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENTS SCHEDULE");
        System.out.println("--------");
        for (double balance: calculator.getRemainingBalances())
            System.out.println(currencyInstance.format(balance));
    }
}
