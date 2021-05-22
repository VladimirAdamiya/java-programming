package day24_Loops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollar = scan.nextInt();
        while(dollar != 5) {
            System.out.println("Give me 5 dollars");
            dollar = scan.nextInt();
           }
        System.out.println("Thanks for 5 dollars");





    }
}
