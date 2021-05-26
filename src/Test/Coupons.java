package Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Coupons {
    public static void main(String[] args) {
        //Write your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons: ");
        int couponCNT = scan.nextInt();

        if (couponCNT < 3) {
            System.out.println("Not enough coupons");
        } else {

            int candyCount = couponCNT/10;
            int remainingCoupons = couponCNT % 10;
            int gumbollsCount = remainingCoupons / 3;

            System.out.println("Number of Candies: " + candyCount);
            System.out.println("Number of Gumballs:" + gumbollsCount);
        }
    }
}

