package Replit;

import java.util.*;

public class VehicleRecall {

        public static void main(String[] args) {
            //DO NOT CHANGE:
            Scanner input = new Scanner(System.in);
            System.out.println("Enter vehicle's year:");
            int vehicleYear = input.nextInt();

            //WRITE YOUR CODE HERE:

            if (vehicleYear <= 2007) {
                System.out.println("Your vehicle needs to be recalled!");
            } if (vehicleYear == 2008 || vehicleYear == 2019) {
                System.out.println("Your vehicle is fine, enjoy!");
            } if (vehicleYear > 2008 && vehicleYear <2019) {
                System.out.println("Your vehicle needs to be recalled!");

            }
        }
    }
