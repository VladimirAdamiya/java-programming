package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Toyota";
        String model = "C";
        double leasePrice = 0.0;

        if(make.equals ("Mercedes") && model.equals("E")) {
            leasePrice = 400;
        } else if (make.equals("Mercedes") && model.equals("A")) {
            leasePrice = 500;
        } else {
            System.out.println("Invalid model");
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("Lease Price = " + leasePrice);
    }
}
