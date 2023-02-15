package src.service;

public class Converter {

    private final Currency currentCurrency;
    private final Currency targetCurrency;
    private final double currentAmount;

    public Converter(String currentCurrency, String targetCurrency, double currentAmount) {
        this.currentCurrency = Currency.currency(currentCurrency);
        this.targetCurrency = Currency.currency(targetCurrency);
        this.currentAmount = currentAmount;
    }

    public double convert() {
        return currentCurrency.convertToTarget(currentAmount, targetCurrency);
    }

}
