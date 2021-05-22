package Test;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();

        if (version < 1.5) {
            System.out.println("Sorry, I don't know this version!");
            if (version == 1.6) {
                System.out.println("Cupcake");
            }
            if (version == 1.6) {
                System.out.println("Donut");
            }
            if (version == 2.1) {
                System.out.println("Eclair");
            }
            if (version == 2.2) {
                System.out.println("Froyo");
            }
            if (version == 2.3) {
                System.out.println("Gingerbread");
            }
            if (version == 3.1) {
                System.out.println("Honeycomb");
            }
            if (version == 4.0) {
                System.out.println("Ice Cream Sandwich");
            }
            if (version == 4.1) {
                System.out.println("Jelly Bean");
            }
            if (version == 4.4) {
                System.out.println("KitKat");
            }
            if (version == 5.0) {
                System.out.println("Lollipop");
            }
            if (version == 8.0) {
                System.out.println("Oreo");
            }
            if (version == 9.0) {
                System.out.println("Pie");
            }
            if (version > 9.0) {
                System.out.println("Sorry, I don't know this version!");
            }
        }
    }
}

