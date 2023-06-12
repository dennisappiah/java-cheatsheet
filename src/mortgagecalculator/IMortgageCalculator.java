package mortgagecalculator;

public interface IMortgageCalculator {
    double calculateMortgagePayment();
    double calculateBalance( short numberOfPaymentsMade);

    double[] getRemainingBalances();
}
