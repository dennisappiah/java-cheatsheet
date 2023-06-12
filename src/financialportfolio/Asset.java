package financialportfolio;

public interface Asset {
    // How much is the asset is worth
    double calculateMarketValue();

    // How much profit has been made of the asset
    double calculateProfit();
}
