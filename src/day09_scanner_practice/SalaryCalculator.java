package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate");
        double hourlyRate = 54.5;
        double weeklyRate = hourlyRate * 40;
        double monthlyRate = weeklyRate *52 / 12; // WeeklyPay *4; might not be accurate
        double annualPay = monthlyRate * 12;
        System.out.println("weekly pay rate " + weeklyRate);

    }

}
