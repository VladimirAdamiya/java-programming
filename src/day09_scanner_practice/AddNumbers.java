package day09_scanner_practice;
import java.util.Scanner;  // import scanner class

public class AddNumbers {
    public static void main(String[] args) {
        //Create scanner object
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1 + num2;
        System.out.println(result);


    }
}
