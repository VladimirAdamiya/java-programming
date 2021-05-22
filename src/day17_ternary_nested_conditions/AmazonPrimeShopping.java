package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        
        double itemPrice = 25;
        boolean isPrimeMember = true;
        
        if (isPrimeMember) {
            System.out.println("Eligible for free shipping");
        } else {
            if (itemPrice >=25) {
                System.out.println("Eligibal for free regular shipping");
            } else {
                System.out.println("Shipping charge will be apply");
            }
        }
    }
}
