package src.service;

import java.util.Scanner;

public class Menu {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("current currency: ");
        String currentCurrency = scanner.nextLine();
        System.out.print("target currency: ");
        String targetCurrency = scanner.nextLine();
        System.out.print("amount: ");
        double currentAmount = scanner.nextDouble();

        Converter converter = new Converter(currentCurrency, targetCurrency, currentAmount);

        System.out.println("You will receive: " + converter.convert() + " " + targetCurrency);

//        do not forget to close scanner
        scanner.close();
    }

}
