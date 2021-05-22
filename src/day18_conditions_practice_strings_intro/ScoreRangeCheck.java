package day18_conditions_practice_strings_intro;

public class ScoreRangeCheck {
    public static void main(String[] args) {
        int scoreRange = 100;
        if (scoreRange  >= 1 && scoreRange  <= 40) {
            System.out.println("Grade D");
        } else if (scoreRange >= 41 && scoreRange <= 60) {
            System.out.println("Grade C");
        } else if (scoreRange >= 61 && scoreRange <= 90) {
            System.out.println("Grade B");
        } else if (scoreRange >= 91 && scoreRange <= 100) {
            System.out.println("Grade A");
        } else {
            System.out.println("Invalid grade");
        }
    }

}
