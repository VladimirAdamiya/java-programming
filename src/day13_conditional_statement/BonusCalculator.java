package day13_conditional_statement;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 2000.35;

        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualify for partial bonus");
            bonus = 50;
        } else {
            System.out.println("Good job, you qualify for full bonus");
            bonus = 100;
            System.out.println("Your full bonus is " + "$" + bonus);
        }
    }
}
