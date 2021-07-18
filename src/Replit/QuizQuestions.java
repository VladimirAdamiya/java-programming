package Replit;

import java.util.Scanner;
public class QuizQuestions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String a = s.nextLine();

        //your code here

        if (a.equalsIgnoreCase("a")) {
            System.out.println(a  + " is wrong");
        } else if (a.equalsIgnoreCase("b")) {
            System.out.println(a  + " is correct");
        } else if (a.equalsIgnoreCase("c")) {
            System.out.println(a  + " is wrong");
        } else {
            System.out.println(a  + " is not a valid answer");
        }

    }
}

