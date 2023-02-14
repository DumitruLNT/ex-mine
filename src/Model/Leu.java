package src.Model;

public class Leu extends MoneyCurency {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double setAmount(double amount) {
        this.amount = amount;
        return amount;
    }


    public double leuToEuro() {
        double rsp = amount * 0.05;
        return rsp;
    }

    public double leuToDollar() {
        double rsp = amount * 0.053;
        return rsp;
    }

    public double leuToRub() {
        double rsp = amount * 3.91;
        return rsp;
    }

    public double leuToUah() {
        double rsp = amount * 1.97;
        return rsp;
    }

    public double leuToRon() {
        double rsp = amount * 0.24;
        return rsp;
    }
}
