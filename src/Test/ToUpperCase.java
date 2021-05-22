package Test;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*        System.out.println("Enter char");

        String word = scan.next();

        if (word.equals(word.toUpperCase())) {
            System.out.println("Its Upper Case Char");
        }else if (word.equals(word.toLowerCase())){
            System.out.println("Its Lower Case Char");
        }else if(!word.equals(word.charAt(0))){
            System.out.println("Its Upper Case Char");
        }*/

        System.out.println("Enter a char");
        char c = scan.nextLine().charAt(0);


        if (c >= 'A' && c <= 'Z')
            System.out.println("It's Upper Case char ");

        else if (c >= 'a' && c <= 'z')
            System.out.println("It's Lower Case Char" );

        else
            System.out.println( "it’s not a char letter" );

    }
}
