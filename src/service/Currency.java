package src.service;

import src.exception.NoSuchCurrencyException;

import java.util.Arrays;

public enum Currency {

    USD(0.05),
    EUR(0.05),
    MDL(1),
    RON(0.24),
    RUB(3.91),
    UAH(1.97);

    public static Currency currency(String currency) {
        return Arrays.stream(Currency.values())
                .filter(c -> c.name().equalsIgnoreCase(currency))
                .findFirst()
                .orElseThrow(() -> new NoSuchCurrencyException(String.format("Currency [%s] does not exist", currency)));
    }

    public double convertToTarget(double amount, Currency target) {
        return (convertToMDL(amount) * target.multiplier);
    }

    /**
     * Converts target currency to default (MDL)
     * @param amount of current currency
     * @return double value that represents amount of default (MDL) currency
     */
    private double convertToMDL(double amount) {
        return (amount / this.multiplier);
    }

    public final double multiplier;

    Currency(double multiplier) {
        this.multiplier = multiplier;
    }

}
