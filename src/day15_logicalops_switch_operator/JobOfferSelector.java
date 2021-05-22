package day15_logicalops_switch_operator;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120000.0;
        boolean isRemote = true;
        boolean benefits = false;

        if (location.equals("Honolulu") && salary >= 120000.0 && isRemote && benefits) {
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Let's consider another offer or negotiate");
        }
    }
}
