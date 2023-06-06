package OOP.financePortfolio;

public interface Asset {
    // How much asset is worth
    double calculateMarketValue();

    // How much profit has been made of the asset
    double calculateProfit();
}
