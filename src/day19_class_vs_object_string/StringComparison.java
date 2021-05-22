package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        // EQUALS() method - case sensitive comparison
        System.out.println(city.equals("Chicago")); //true, case sensitive comparison
        System.out.println(city.equals("chicago")); //false, case sensitive comparison

        // EQUALSIGNORECASE() method - case insensitive comparison
        //System.out.println(city.equalsIgnoreCase(anotherString:"Chicago"));
        //System.out.println(city.equalsIgnoreCase(anotherString: "Chicago"));

    }
}
