package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1200;
        System.out.println("balance = " + balance);
        System.out.println("balance = " + balance);
        
        double baklava = 22.50;
        System.out.println("baklava = " + baklava); //baklava 22.50
        balance = balance - baklava; // balance 1200 baklava - 22.50
        System.out.println("outstanding balance = " + balance);

        double kenafe = 44.45;
        System.out.println("outstanding balance = " + kenafe);
        // buy it decrease balance with kenafe prive
        balance = balance - kenafe;
        System.out.println("outstanding balance after one kenafe is " + balance);
        balance = balance - kenafe / 2;
        System.out.println("outstanding balance second kenafe, after 50% is " + balance);

        double plov = 7.99;
        balance = balance - plov;
        System.out.println("outstanding balance after plov = " + balance);
        //return baklava
        balance = balance + baklava;
        System.out.println("final balance after returning baklava is " + balance);
        balance = balance + plov + kenafe;
        System.out.println("final outstanding balance after returning plov, kenafe and baklava " + balance);
        balance = balance + kenafe / 2;
        System.out.println("final balance after returning kenafe with 50% off = " + balance);



    }
}
