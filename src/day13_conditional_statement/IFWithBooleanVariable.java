package day13_conditional_statement;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

        if (isHungry) {
            System.out.println("I am hungry. I will get something to eat");
            System.out.println("Then code java");
        } else {
            System.out.println("I am not, I will coding java!");
        }

        double price = 230.44;
        boolean isAffordable = price <= 200.0;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it, let's buy");
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isRemoteJob = false;
        if (!isRemoteJob) {
            System.out.println("Sorry, I am not interested");
        } else {
            System.out.println("Sure, I am interested, what is the interview process?");
        }
    }
}
