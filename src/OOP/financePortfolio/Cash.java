package OOP.financePortfolio;

public class Cash implements Asset{
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }


    @Override
    public double calculateMarketValue() {
        return amount;
    }

    // no profit since cash is a fixed asset
    @Override
    public double calculateProfit() {
        return 0;
    }
}
