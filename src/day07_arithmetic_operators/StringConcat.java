package day07_arithmetic_operators;

public class StringConcat {
    public static void main(String[] args){
        System.out.println("java " + (5 + 3));
        System.out.println("java " + 5 + 3);
        System.out.println(5 + 3 + " java");
        System.out.println(5 + (3 + " java"));
        System.out.println("hello " + (1 + 2 + 3));

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + " "+ str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);  //15, calculation
        System.out.println(num1 + " "+ num2);  //7 8, not calculation
        System.out.println(num1 + ""+ num2);

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + "" + char2); // result is ab, because not int



    }

}