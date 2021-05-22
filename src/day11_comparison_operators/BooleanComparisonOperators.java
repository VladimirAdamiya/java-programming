package day11_comparison_operators;

import java.sql.SQLOutput;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(1000 > 100);
        System.out.println(985.44 < 98547.8);
        System.out.println(10 <= 9); // less than equal / false
        System.out.println(10 <= 11); // less than equal / true
        System.out.println(-100 != 44); // not equal / true

        System.out.println("-------------------");
        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println("-------------------");
        
        boolean result = 5 == 5;
        System.out.println("result = " + result);
        result = 33 > 44;
        System.out.println("result = " + result);
        result = 88 < 99;
        System.out.println("result = " + result);
        result = 10 >= 10;
        System.out.println("result = " + result);
        result = 123 <= 124;
        System.out.println("result = " + result);
        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city == "Fairfax");
        System.out.println("--------------------");
        String name = "Vladimir";
        boolean checkName = name == "Vladimir";
        System.out.println("checkName = " + checkName);
        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);
    }
}
