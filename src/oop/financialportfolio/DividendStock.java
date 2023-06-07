package OOP.financePortfolio;

 public class DividendStock extends  Stock{
   private double dividends;
  public DividendStock(String symbol, double totalCost, double currentPrice) {
   super(symbol, totalCost, currentPrice);
    dividends = 0;
  }


  @Override
  public double calculateMarketValue() {
   return super.calculateMarketValue() + dividends;
  }

  public void payDividend(double amountPerShare){
   dividends += amountPerShare;
  }
 }
