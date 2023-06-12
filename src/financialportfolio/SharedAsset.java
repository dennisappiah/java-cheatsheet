package financialportfolio;

public abstract class SharedAsset implements Asset {
    private String symbol;
    private double totalCost;
    private double currentPrice;

    public SharedAsset(String symbol, double totalCost, double currentPrice) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.currentPrice = currentPrice;
    }

    public double addCost(double cost) {
        return totalCost += cost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }


    public abstract double calculateMarketValue();

    public abstract double calculateProfit();
}
