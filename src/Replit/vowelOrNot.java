package Replit;

import java.util.Scanner;

public class vowelOrNot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a char");
        char a = scan.nextLine().charAt(0);



        switch (a) {
            case 'a':
                System.out.println(" It's Vowel letter");
                break;
            case 'e':
                System.out.println(" It's Vowel letter");
                break;
            case 'i':
                System.out.println(" It's Vowel letter");
                break;
            case 'o':
                System.out.println(" It's Vowel letter");
                break;
            case 'u':
                System.out.println(" It's Vowel letter");
                break;
            case 'y':
                System.out.println(" It's Vowel letter");
                break;
            default:
                System.out.println(a + "wrong input");

        }




    }
}
