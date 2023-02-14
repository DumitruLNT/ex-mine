package src.Model;

import java.util.Scanner;

public class MoneyCurency {
    public Scanner scan = new Scanner(System.in);

    public void Afisare() {
        System.out.println("Hello, welcome to java money exchange");
        System.out.println("Choose your currency to exchange:");
        System.out.println("Valid choises: \n\t*Leu \n\t*Dollar \n\t*Euro \n\t*Rub \n\t*Uah \n\t*Ron");
        String choice = scan.nextLine();
        System.out.println("What currency do you want to change to?");
        String choice2 = scan.nextLine();
        System.out.println("How much?");
        double money = scan.nextDouble();
        //constants
        final String l = " lei, vei obtine: ";
        final String e = " euro, vei obtine: ";
        final String d = " dolari, vei obtine: ";
        final String r1 = " ruble, vei obtine: ";
        final String r2 = " roni, vei obtine: ";
        final String u = " grivne, vei obtine: ";
        //for Leu...
        if (choice.equalsIgnoreCase("leu") && choice2.equalsIgnoreCase("dollar")) {
            Leu leu = new Leu();
            leu.setAmount(money);
            System.out.println("Ai introdus " + money + l + leu.leuToDollar() + " Dolari...");
            return;
        }
        if (choice.equalsIgnoreCase("leu") && choice2.equalsIgnoreCase("euro")) {
            Leu leu = new Leu();
            leu.setAmount(money);
            System.out.println("Ai introdus " + money + l + leu.leuToEuro() + " Euro...");
            return;
        }
        if (choice.equalsIgnoreCase("leu") && choice2.equalsIgnoreCase("ron")) {
            Leu leu = new Leu();
            leu.setAmount(money);
            System.out.println("Ai introdus " + money + l + leu.leuToRon() + " Roni...");
            return;
        }
        if (choice.equalsIgnoreCase("leu") && choice2.equalsIgnoreCase("rub")) {
            Leu leu = new Leu();
            leu.setAmount(money);
            System.out.println("Ai introdus " + money + l + leu.leuToRub() + " Ruble...");
            return;
        }
        if (choice.equalsIgnoreCase("leu") && choice2.equalsIgnoreCase("uah")) {
            Leu leu = new Leu();
            leu.setAmount(money);
            System.out.println("Ai introdus " + money + l + leu.leuToUah() + " Grivne...");
            return;
        }
        //for Euro
        if (choice.equalsIgnoreCase("euro") && choice2.equalsIgnoreCase("leu")) {
            Euro euro = new Euro();
            euro.setAmount(money);
            System.out.println("Ai introdus " + money + e + euro.euroToLeu() + " Lei...");
            return;
        }
        if (choice.equalsIgnoreCase("euro") && choice2.equalsIgnoreCase("Dollar")) {
            Euro euro = new Euro();
            euro.setAmount(money);
            System.out.println("Ai introdus " + money + e + euro.euroToDollar() + " Dolari...");
            return;
        }
        if (choice.equalsIgnoreCase("euro") && choice2.equalsIgnoreCase("Ron")) {
            Euro euro = new Euro();
            euro.setAmount(money);
            System.out.println("Ai introdus " + money + e + euro.euroToRon() + " Roni...");
            return;
        }
        if (choice.equalsIgnoreCase("euro") && choice2.equalsIgnoreCase("Rub")) {
            Euro euro = new Euro();
            euro.setAmount(money);
            System.out.println("Ai introdus " + money + e + euro.euroToRub() + " Ruble...");
            return;
        }
        if (choice.equalsIgnoreCase("euro") && choice2.equalsIgnoreCase("uah")) {
            Euro euro = new Euro();
            euro.setAmount(money);
            System.out.println("Ai introdus " + money + e + euro.euroToUah() + " Grivne...");
            return;
        }
        //for Dollar
        if (choice.equalsIgnoreCase("Dollar") && choice2.equalsIgnoreCase("leu")) {
            Dollar dollar = new Dollar();
            dollar.setAmount(money);
            System.out.println("Ai introdus " + money + d + dollar.dollarToLeu() + " Lei...");
            return;
        }
        if (choice.equalsIgnoreCase("Dollar") && choice2.equalsIgnoreCase("euro")) {
            Dollar dollar = new Dollar();
            dollar.setAmount(money);
            System.out.println("Ai introdus " + money + d + dollar.dollarToEuro() + " Euro...");
            return;
        }
        if (choice.equalsIgnoreCase("Dollar") && choice2.equalsIgnoreCase("Ron")) {
            Dollar dollar = new Dollar();
            dollar.setAmount(money);
            System.out.println("Ai introdus " + money + d + dollar.dollarToRon() + " Roni...");
            return;
        }
        if (choice.equalsIgnoreCase("Dollar") && choice2.equalsIgnoreCase("Rub")) {
            Dollar dollar = new Dollar();
            dollar.setAmount(money);
            System.out.println("Ai introdus " + money + d + dollar.dollarToRub() + " Ruble...");
            return;
        }
        if (choice.equalsIgnoreCase("Dollar") && choice2.equalsIgnoreCase("Uah")) {
            Dollar dollar = new Dollar();
            dollar.setAmount(money);
            System.out.println("Ai introdus " + money + d + dollar.dollarToUah() + " Grivne...");
            return;
        }
        //for Ruble
        if (choice.equalsIgnoreCase("Ruble") && choice2.equalsIgnoreCase("leu")) {
            Rub rub = new Rub();
            rub.setAmount(money);
            System.out.println("Ai introdus " + money + r1 + rub.rubToLeu() + " Lei...");
            return;
        }
        if (choice.equalsIgnoreCase("Ruble") && choice2.equalsIgnoreCase("Euro")) {
            Rub rub = new Rub();
            rub.setAmount(money);
            System.out.println("Ai introdus " + money + r1 + rub.rubToEuro() + " Euro...");
            return;
        }
        if (choice.equalsIgnoreCase("Ruble") && choice2.equalsIgnoreCase("Dollar")) {
            Rub rub = new Rub();
            rub.setAmount(money);
            System.out.println("Ai introdus " + money + r1 + rub.rubToDollar() + " Dolari...");
            return;
        }
        if (choice.equalsIgnoreCase("Ruble") && choice2.equalsIgnoreCase("Ron")) {
            Rub rub = new Rub();
            rub.setAmount(money);
            System.out.println("Ai introdus " + money + r1 + rub.rubToRon() + " Roni...");
            return;
        }
        if (choice.equalsIgnoreCase("Ruble") && choice2.equalsIgnoreCase("Uah")) {
            Rub rub = new Rub();
            rub.setAmount(money);
            System.out.println("Ai introdus " + money + r1 + rub.rubToUah() + " Grivne...");
            return;
        }
        //for Ron
        if (choice.equalsIgnoreCase("Ron") && choice2.equalsIgnoreCase("leu")) {
            Ron ron = new Ron();
            ron.setAmount(money);
            System.out.println("Ai introdus " + money + r2 + ron.ronToLeu() + " Lei...");
            return;
        }
        if (choice.equalsIgnoreCase("Ron") && choice2.equalsIgnoreCase("Euro")) {
            Ron ron = new Ron();
            ron.setAmount(money);
            System.out.println("Ai introdus " + money + r2 + ron.ronToEuro() + " Euro...");
            return;
        }
        if (choice.equalsIgnoreCase("Ron") && choice2.equalsIgnoreCase("Dollar")) {
            Ron ron = new Ron();
            ron.setAmount(money);
            System.out.println("Ai introdus " + money + r2 + ron.ronToDollar() + " Dolari...");
            return;
        }
        if (choice.equalsIgnoreCase("Ron") && choice2.equalsIgnoreCase("Rub")) {
            Ron ron = new Ron();
            ron.setAmount(money);
            System.out.println("Ai introdus " + money + r2 + ron.ronToRub() + " Ruble...");
            return;
        }
        if (choice.equalsIgnoreCase("Ron") && choice2.equalsIgnoreCase("Uah")) {
            Ron ron = new Ron();
            ron.setAmount(money);
            System.out.println("Ai introdus " + money + r2 + ron.ronToUah() + " Grivne...");
            return;
        }
        //for Uah
        if (choice.equalsIgnoreCase("Uah") && choice2.equalsIgnoreCase("leu")) {
            Uah uah = new Uah();
            uah.setAmount(money);
            System.out.println("Ai introdus " + money + u + uah.uahToLeu() + " Lei...");
            return;
        }
        if (choice.equalsIgnoreCase("Uah") && choice2.equalsIgnoreCase("Euro")) {
            Uah uah = new Uah();
            uah.setAmount(money);
            System.out.println("Ai introdus " + money + u + uah.uahToEuro() + " Euro...");
            return;
        }
        if (choice.equalsIgnoreCase("Uah") && choice2.equalsIgnoreCase("Dollar")) {
            Uah uah = new Uah();
            uah.setAmount(money);
            System.out.println("Ai introdus " + money + u + uah.uahToDollar() + " Dolari...");
            return;
        }
        if (choice.equalsIgnoreCase("Uah") && choice2.equalsIgnoreCase("Ron")) {
            Uah uah = new Uah();
            uah.setAmount(money);
            System.out.println("Ai introdus " + money + u + uah.uahToRon() + " Roni...");
            return;
        }
        if (choice.equalsIgnoreCase("Uah") && choice2.equalsIgnoreCase("Rub")) {
            Uah uah = new Uah();
            uah.setAmount(money);
            System.out.println("Ai introdus " + money + u + uah.uahToRub() + " Ruble...");
            return;
        }
        throw new IllegalArgumentException("Something went wrong, try again...");
    }
}
