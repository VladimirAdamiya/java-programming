package day08_casting_scanner;

public class SoppingBalanceCalculator {
    public static void main(String[] args) {

        double initialBalance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double remainingBalance = initialBalance - price1 - price2 - price3;
        System.out.println("Your initial balance " + "$" + initialBalance);
        System.out.println("Your Remaining Balance " + "$" + remainingBalance);

        int balanceWithNoCents = (int)remainingBalance;
        System.out.println("Balance without cents " + "$" + balanceWithNoCents);
        }

    }
