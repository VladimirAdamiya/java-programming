package day10_shorthand_operators;

public class ShortHandOperator {
    public static void main(String[] args) {
        int cars = 5;
        System.out.println("cars in parking lot is  = " + cars);
        cars = cars + 2;
        System.out.println("cars in parking lot is = " + cars);
        cars += 5;
        System.out.println("cars in parking lot= " + cars);
        cars -= 2; // short way to decrease amount instead of cars = cars - 2;
        System.out.println("cars left in parking lot = " + cars);
        
        int electricCars = 13;
        cars += electricCars;
        System.out.println("Total cars in parking lot = " + cars);
        
        String word = "Java";
        System.out.println("word = " + word);
        
        word = word + " programming";
        System.out.println("word = " + word);
        // add "is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun";
        word += selenium;
        System.out.println(word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add 'J' to letter
        //letter += 'U';
        //System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking Fee = " + "$" + parkingFee);
        // early bird parking fee is 50% off
        parkingFee /= 2;
        System.out.println("earlier bird parking fee = " + "$" + parkingFee);
        //weekend parking is free
        parkingFee -= parkingFee;

        System.out.println("weekend parking fee = " + parkingFee);

        int monthlyPayment = 750;
        int numberOfStudent = 400;
        System.out.println("monthly earning  = " +monthlyPayment * numberOfStudent);



    }
}
