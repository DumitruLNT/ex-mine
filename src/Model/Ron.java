package src.Model;

public class Ron extends MoneyCurency {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double ronToLeu() {
        double rsp = amount * 4.09;
        return rsp;
    }

    public double ronToEuro() {
        double rsp = amount * 0.204;
        return rsp;
    }

    public double ronToDollar() {
        double rsp = amount * 0.22;
        return rsp;
    }

    public double ronToUah() {
        double rsp = amount * 8.04;
        return rsp;
    }

    public double ronToRub() {
        double rsp = amount * 15.99;
        return rsp;
    }


}
