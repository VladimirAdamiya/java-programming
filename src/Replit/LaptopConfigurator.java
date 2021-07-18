package Replit;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            price += 200;
        } else if (screenSize == 15.0) {
            price += 300;
        } else if (screenSize == 17.3) {
            price += 400;
        } else
            System.out.println("Wrong size selected");

        System.out.println("Select CPU type:");
        String CPU = scan.next();
        if (CPU.equalsIgnoreCase("i3")) {
            price += 150;
        } else if (CPU.equalsIgnoreCase("i5")) {
            price += 250;
        } else if (CPU.equalsIgnoreCase("i7")) {
            price += 350;
        }
        System.out.println("Select RAM size:");
        int RAM = scan.nextInt();
        price += (RAM * 50) / 4;

        System.out.println("Select storage type:");
        String StorageType = scan.next();
        System.out.println("Enter storage size:");
        int StorageSize = scan.nextInt();
        if (StorageType.equalsIgnoreCase("HDD")) {
            price += (StorageSize * 50) / 500;

        } else if (StorageType.equalsIgnoreCase("SSD")) {
            price += (StorageSize * 100) / 500;

        }
        System.out.println("Enter screen resolution:");
        String screenResolution = scan.next();

        if (screenResolution.equalsIgnoreCase("FULLHD")) {
            price += 100;
        } else if (screenResolution.equalsIgnoreCase("4K")) {
            price += 200;

            System.out.println("Laptop price is: " + price);
        }
    }
}
