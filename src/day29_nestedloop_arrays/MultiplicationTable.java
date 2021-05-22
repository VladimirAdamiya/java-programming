package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(outer + " x " + inner + " = " + outer * inner + "\t");
            }
            System.out.println();
        }
        for (int row = 1; row <=4; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.println(row + " | " + col);
            }
        }
        String word = "java";
        for(int i = 0; i < word.length(); i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        /**
         * java
         * ava
         * va
         * a
         */
        for(int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }

}
