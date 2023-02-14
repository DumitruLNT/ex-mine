package src.Model;

public class Euro extends MoneyCurency {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double euroToLeu() {
        double rsp = amount * 20.03;
        return rsp;
    }

    public double euroToDollar() {
        double rsp = amount * 1.07;
        return rsp;
    }

    public double euroToRub() {
        double rsp = amount * 78.41;
        return rsp;
    }

    public double euroToRon() {
        double rsp = amount * 4.90;
        return rsp;
    }

    public double euroToUah() {
        double rsp = amount * 39.41;
        return rsp;
    }
}
