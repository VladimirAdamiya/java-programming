package day17_ternary_nested_conditions;

public class TerneryExamples {
    public static void main(String[] args) {
         // WITH TERNARY :
        int score = 88;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("result = " + result);

        String quality = "good";
        int rating = quality.equals("good")? 100 : 0;
        System.out.println(quality.equals("good") ? 100:0);

        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';

    }
}
