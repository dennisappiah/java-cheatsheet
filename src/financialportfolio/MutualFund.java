package financialportfolio;

public class MutualFund extends SharedAsset{
    private double totalShares;
    public MutualFund(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        totalShares = 0;
    }

    @Override
    public double calculateMarketValue() {
        return totalShares * getCurrentPrice();
    }

    @Override
    public double calculateProfit() {
        return 0;
    }
}
