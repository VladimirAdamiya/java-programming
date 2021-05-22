package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChangingStringMethods {
    public static void main(String[] arg) {
        String word = "woo den sp oon";

        System.out.println(word.toUpperCase().toLowerCase().length());

        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase(Locale.ROOT));

        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));

        String city2 = "ISTAMBUL";
        System.out.println(city2.substring(0,1).toUpperCase()+city2.substring(1).toLowerCase());
    }
}
