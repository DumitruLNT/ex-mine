package src.Model;

public class Dollar extends MoneyCurency {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double dollarToLeu() {
        double rsp = amount * 18.76;
        return rsp;
    }

    public double dollarToEuro() {
        double rsp = amount * 0.94;
        return rsp;
    }

    public double dollarToRon() {
        double rsp = amount * 4.59;
        return rsp;
    }

    public double dollarToRub() {
        double rsp = amount * 73.44;
        return rsp;
    }

    public double dollarToUah() {
        double rsp = amount * 36.92;
        return rsp;
    }
}
