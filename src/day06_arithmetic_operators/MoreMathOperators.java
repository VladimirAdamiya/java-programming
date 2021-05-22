package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int totalCarsOnParkingLot = 431 + 233 + 2 + 20 + 1 + 155;
        int toyota = 431;
        int honda = 233;
        int vw = 2;
        int tesla = 20;
        int bmw = 155;
        System.out.println(totalCarsOnParkingLot + "\t Total Cars on Parking Lot");
        System.out.println(toyota + "\t of Toyota's");
        System.out.println(honda + "\t of Honda's");
        System.out.println(vw + "\t of VW's");
        System.out.println(tesla + "\t of Tesla's");
        System.out.println(bmw + "\t of BMW's");

        String pizza = "Hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        // We Ordered Hawaiian Pizza with 8 slices, 4 people ate 2 slices each.

        System.out.println(slicesPerPerson + " slices per person");
        System.out.println("We ordered Hawaiian pizza with " + slices +" slices," + people + " people ate " + slicesPerPerson + " each");
    }
}
