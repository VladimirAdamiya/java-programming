package day24_Loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int seconds = 5;
        System.out.println("Final countdown started");

        while (seconds >=0) {
            System.out.println(seconds);
            seconds--;

        }
        System.out.println("Your time is out. Booooom ");

    }
}
