package OfficeHours.Practice_03_16_2021;

public class BMI {
    public static void main(String[] args) {

        double mass = 62.4;
        double height = 1.65;
        double BMI = mass / (height * height);

        if(BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal Weight");
        }
    }
}
