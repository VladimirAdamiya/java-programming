package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 9;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("It's a Winter season");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("It's a Spring season");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("It's a Summer season");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("It's a Autumn season");
        }
    }

}
