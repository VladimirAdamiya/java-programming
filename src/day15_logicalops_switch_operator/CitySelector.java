package day15_logicalops_switch_operator;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if (city.equals("Moscow") && city.equals("Tampa")) {
            System.out.println("Whiling to reallocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Nadir";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with " +teacher);
        } else {
            System.out.println("Soft skills class with " + teacher);
        }

    }

}
