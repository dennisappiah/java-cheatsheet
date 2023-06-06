package OOP.financePortfolio;

public class Main {
    public static void main(String[] args) {
        /*
        A company has a financial portfolio -
         1. We have Stocks, Dividend Stocks, Mutual Funds, Real Estate, Cash
          How would you design a complete portfolio system?

         2. Relations: DividendStock is-a Stock

         3. The market value or behavior of each of the assets are implemented differently,
         we use Interface: calculateMarketValue, calculateProfit

         4. Similarities between mutual Funds and stocks
         both stock assets are based on shares
         */

        Asset asset = new MutualFund("AMX", 200,90.7);
        Asset asset2 = new Stock("SS", 30, 20);
        System.out.println(asset.calculateMarketValue());
        System.out.println(asset2.calculateProfit());

    }
}
