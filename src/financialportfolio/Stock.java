package financialportfolio;

public class Stock extends SharedAsset {
    private int totalShares;

    public Stock(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        totalShares = 0;
    }

    @Override
    public double calculateMarketValue() {
        return totalShares * getCurrentPrice();
    }

    @Override
    public double calculateProfit() {
        return calculateMarketValue();
    }

    public int getTotalShares() {
        return totalShares;
    }
}
