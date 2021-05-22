package day15_logicalops_switch_operator;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = false;
        String itemName = "Wooden spoon";

        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deal on -" +itemName);

        }
    }
}
