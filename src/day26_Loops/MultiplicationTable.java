package day26_Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 2;
        /**
         * if number less than 1 or more than 10
         * print "ERROR: invalid input"
         * exit main method: return;
         */
        if (number < 1 || number > 10) {
            System.out.println("ERROR: invalid input");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + 1 + " = " + (number*i));
        }
    }
}

// System.out.println(num + " x " + 1 + " = " +(num*1));
// System.out.println(num + " x " + 2 + " = " +(num*2));
// System.out.println(num + " x " + 3 + " = " +(num*3));
// System.out.println(num + " x " + 4 + " = " +(num*4));
// System.out.println(num + " x " + 5 + " = " +(num*5));
// System.out.println(num + " x " + 6 + " = " +(num*6));
// System.out.println(num + " x " + 7 + " = " +(num*7));
// System.out.println(num + " x " + 8 + " = " +(num*8));
// System.out.println(num + " x " + 9 + " = " +(num*9));