package Test;

import java.util.Scanner;

public class BlackJackKeepHand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("player1, enter your number");
        int player1 = scan.nextInt();
        // System.out.println("player2, enter your number");
        int player2 = scan.nextInt();
        int max = 22;
        int min = 0;


        if (player2 > player1) {
            System.out.println("player win");
        } else if (player2 == player1) {
            System.out.println("its a tie");
        } else if (player2 < player1) {
            System.out.println("player loss");
        } if else  (player2 <= max || player1 <= max) {
            System.out.println("player bust");
        }
    }
}
