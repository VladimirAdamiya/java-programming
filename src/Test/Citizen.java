package Test;


import java.util.Scanner;

public class Citizen {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);
        String age = scan.nextLine();


        if (age < 65) {
            return;
        }
        System.out.println("Senior Citizen");


    }
}

