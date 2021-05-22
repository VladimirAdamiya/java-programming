package day25_Loops;

import java.util.*;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        while(isHungry) {
            bananas++;
            System.out.println("Keep eating \uD83C\uDF4C " + bananas);
            if (bananas == countToFull) {
                isHungry = false;
                System.out.println("I am done with bananas");
            }

        }
    }
}
