package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink";
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection.equals("drink")) {
            System.out.println("Drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea item is selected");
            } else {
                System.out.println("Coke is selected");
            }
        }

    }
}
