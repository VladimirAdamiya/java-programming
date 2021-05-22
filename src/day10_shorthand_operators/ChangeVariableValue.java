package day10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ChangeVariableValue {
    public static void main(String[] args) { // declare
        double fuelPrice = 3.75;  //container
        fuelPrice = fuelPrice - 1.0;
        System.out.println(fuelPrice);
        fuelPrice = fuelPrice + 2.5;
        System.out.println("Fuel price was increased to " + "$" + fuelPrice);
        
        int apples = 10;
        System.out.println("apples = " + apples);
        apples = apples + 3;
        System.out.println("Dad brought " + 3 + " more apples, now we have " + apples + " apples");
        apples = apples - 5;
        System.out.println("Max ate " + 5 + " apples, now we have " + apples + " apples");
        
        int players = 10;
        System.out.println("players = " + players);
        // double the players to start the game
        players = players * 2;
        System.out.println("Player to start game must be " + players);

        int cents = 568;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);

    }
}
