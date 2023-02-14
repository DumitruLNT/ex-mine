package src.Model;

public class Uah extends MoneyCurency {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double uahToLeu() {
        double rsp = amount * 0.51;
        return rsp;
    }

    public double uahToEuro() {
        double rsp = amount * 0.03;
        return rsp;
    }

    public double uahToDollar() {
        double rsp = amount * 0.0271;
        return rsp;
    }

    public double uahToRon() {
        double rsp = amount * 0.12;
        return rsp;
    }

    public double uahToRub() {
        double rsp = amount * 1.99;
        return rsp;
    }
}
