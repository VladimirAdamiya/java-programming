package Homework;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE HERE

        if (day == 1) {
            System.out.println("Monday");
      } if (day == 2) {
            System.out.println("Tuesday");
      } if (day == 3) {
            System.out.println("Wednesday");
      } if (day == 4) {
            System.out.println("Thursday");
      } if (day == 5) {
            System.out.println("Friday");
      }  if (day == 6) {
            System.out.println("Saturday");
      }  if (day == 7) {
            System.out.println("Sunday");
      } if (day >= 8){
            System.out.println("Not a valid day");
      } if (day <= 0) {
            System.out.println("Not a valid day");
      }
    }
}
