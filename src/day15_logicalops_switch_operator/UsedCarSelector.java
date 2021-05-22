package day15_logicalops_switch_operator;

public class UsedCarSelector {
    public static void main(String[] args) {
        double badged = 5000;
        String model = "Tesla";
        double carPrice = 4999;

        if (carPrice <= badged && model.equals("Toyota") || model.equals("Honda") || model.equals("Subaru")) {
            System.out.println("Ready to purchase model = " + model + " for " + carPrice);
        } else{
            System.out.println("Not interesting in model = " + model);
        }
    }
}
