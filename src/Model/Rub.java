package src.Model;

public class Rub extends MoneyCurency {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double rubToLeu() {
        double rsp = amount * 0.26;
        return rsp;
    }

    public double rubToEuro() {
        double rsp = amount * 0.01;
        return rsp;
    }

    public double rubToDollar() {
        double rsp = amount * 0.0136;
        return rsp;
    }

    public double rubToRon() {
        double rsp = amount * 0.06;
        return rsp;
    }

    public double rubToUah() {
        double rsp = amount * 0.5;
        return rsp;
    }
}
