package Replit;

import java.util.Scanner;

public class BlackJackKeepHand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("player1, enter your number");
        int player1 = scan.nextInt();
        // System.out.println("player2, enter your number");
        int player2 = scan.nextInt();
        int num = 0;



        if (player2 > player1) {
            System.out.println("player win");
        } if (player2 == player1) {
            System.out.println("its a tie");
        } if (player2 < player1) {
            System.out.println("player loss");
        } if  (player2 > 21 || player1 <= 21) {
            System.out.println("player bust");
        // } else if  (player1 > 21) {
            //System.out.println("player bust");
        }
    }
}
