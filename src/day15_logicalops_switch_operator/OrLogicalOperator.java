package day15_logicalops_switch_operator;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int orange = 7;

        if (apples > 3 || orange > 4) {
            System.out.println("No need to buy any fruits today");
        } else  {
            System.out.println("need to get more fruits");

            // true  or false  = true
            System.out.println(apples > 2 && orange > 10);
            System.out.println();
        }
    }
}
