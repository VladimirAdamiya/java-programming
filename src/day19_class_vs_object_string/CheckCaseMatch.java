package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";
            if (countryCode.equals(countryCode.toUpperCase() )) {
                System.out.println("Country Code is correct");
            } else {
                System.out.println("Incorrect state code");
            }

        }
    }
