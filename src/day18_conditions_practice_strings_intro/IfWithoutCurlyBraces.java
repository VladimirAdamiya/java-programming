package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "java";

        if (todaysClass.equals("java"))  //after iff always put curly braces
            System.out.println("java is fun");
        }

    {
       int a = 1;
       if (a == 1) {
           System.out.println("a is 1");
           System.out.println("1 is a");
       }
    }

}
