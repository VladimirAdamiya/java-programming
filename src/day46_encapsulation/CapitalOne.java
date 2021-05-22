package day46_encapsulation;


import java.util.Scanner;

public class CapitalOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");
        String a = scan.next();

        if (a.length() > 1 && a.length()<=5) {
            System.out.println("Short Word");
        } else if (a.length()>=5 && a.length()<=10) {
            System.out.println("Medium Word");
        } else if (a.length()>=10 && a.length()<=15) {
            System.out.println("Super long Word");
        } else if (a.length()==1) {
            System.out.println("Char");
        }
    }
}
