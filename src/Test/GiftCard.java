package Test;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        int balance = 100;


        if (item.equals("Smartphone") || item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");


        } else if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 60;
            System.out.println("Your current balance is: " + balance);

        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 25;
            System.out.println("Your current balance is: " + balance);

        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 25;
            System.out.println("Your current balance is: " + balance);

        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 30;
            System.out.println("Your current balance is: " + balance);

        } else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 50;
            System.out.println("Your current balance is: " + balance);

        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 40;
            System.out.println("Your current balance is: " + balance);

        } else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 5;
            System.out.println("Your current balance is: " + balance);


        } else if (item.equals("USB Cable")) {
            System.out.println("Thank you for your purchase!");
            balance = balance - 10;
            System.out.println("Your current balance is: " + balance);

        } else {
            System.out.println("Invalid item!");
        }
    }
}