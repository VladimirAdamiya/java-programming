package Replit;
import java.util.Scanner;

public class MidNumber {

    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
            System.out.print(num1+"is a middle number");
        }if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
            System.out.print(num2+"is a middle number");
        }if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
            System.out.print(num3+"is a middle number");
        }


    }
}
