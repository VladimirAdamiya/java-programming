package Replit;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        String propertyType = scan.nextLine();
        if (propertyType.equalsIgnoreCase("condo") || propertyType.equalsIgnoreCase("townhouse") || propertyType.equalsIgnoreCase("single family home")) {
            if (propertyType.equalsIgnoreCase("condo")) {
                propertyPrice += 50000;
            } else if (propertyType.equalsIgnoreCase("townhouse")) {
                propertyPrice += 75000;
            } else {
                propertyPrice += 95000;
            }

            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms = scan.nextInt();
            if (numberOfBedrooms >= 1 && numberOfBedrooms <= 10) {
                propertyPrice += numberOfBedrooms * 30000;
            } else {
                System.out.println("Invalid input for number of bedrooms");
            }

            System.out.println("Do you have a backyard?");
            backyard = scan.nextBoolean();
            if (backyard && propertyType.equalsIgnoreCase("condo")) {
                System.out.println("Backyard is not available for condo!");
            } else if (backyard) {
                propertyPrice += 5000;
            } else {
                System.out.println("No backyard selected");
            }

            System.out.println("Do you have garage?");
            garage = scan.nextBoolean();
            if (garage) {
                System.out.println("How many spots?");
                garageSpots = scan.nextInt();
                if (garageSpots >= 1 && garageSpots <= 10) {
                    propertyPrice += garageSpots * 20000;
                } else {
                    System.out.println("Pardon, it's not a public parking!");
                }
            } else {
                System.out.println("No garage selected");
            }

            System.out.println("How close is metro station?");
            metroAccessibility = scan.nextFloat();
            if (metroAccessibility >= 0 && metroAccessibility <= 3) {
                if (metroAccessibility >= 0 && metroAccessibility <= 1) {
                    propertyPrice += 10000;
                } else {
                    propertyPrice += 5000;
                }
            } else {
                System.out.println("Metro station is far away, no price added to the property");
            }

            System.out.println("How close is highway?");
            highwayAccessibility = scan.nextFloat();
            if (highwayAccessibility >= 0 && highwayAccessibility <= 20) {
                if (highwayAccessibility >= 0 && highwayAccessibility <= 1) {
                    propertyPrice += 15000;
                } else if (highwayAccessibility > 1 && highwayAccessibility <= 5) {
                    propertyPrice += 8000;
                } else {
                    propertyPrice += 4000;
                }
            } else {
                System.out.println("Highway is far away, no price added to the property");
            }

            System.out.println("What's the rating of nearest school?");
            schoolScore = scan.nextFloat();
            if (schoolScore >= 0 && schoolScore <= 10) {
                if (schoolScore >= 8 && schoolScore <= 10) {
                    propertyPrice += 45000;
                } else if (schoolScore >= 4 && schoolScore < 8) {
                    propertyPrice += 20000;
                } else {
                    propertyPrice += 5000;
                }
            } else {
                System.out.println("Invalid input for school score");
            }

            System.out.println("Does any of your family members smoke?");
            smoking = scan.nextBoolean();
            if (smoking) {
                propertyPrice -= 5000;
            }

        } else {
            System.out.println("Please enter valid house type!");
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");
    }
}



