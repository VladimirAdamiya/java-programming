package Replit;
import java.util.Scanner;
public class HappyValleySchoolSystem2 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();


        //WRITE YOUR CODE HERE

        if (age < 2) {
            System.out.println("ineligible");
        } if (age == 2) {
            System.out.println("toddler");
        } if (age >= 3 && age <= 5) {
            System.out.println("early childhood");
        } if (age >= 6 && age <= 7) {
            System.out.println("young reader");
        } if (age >= 8 && age <= 10) {
            System.out.println("elementary");
        } if (age == 11 || age == 12) {
            System.out.println("middle");
        } if (age == 13) {
            System.out.println("impossible");
        } if (age >= 14 && age <= 16) {
            System.out.println("high school");
        } if (age == 17 || age == 18) {
            System.out.println("scholar");
        } if (age >18) {
            System.out.println("ineligible");
        }

    }
}
