package OfficeHours.Practice_03_02_2021;

/*
Printing, variables, datatypes, concatenation
================================================

Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information

    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star
 */
public class OfficeHours_Practice_03_02_2021 {
    public static void main(String[] args){

        //Variables

        String name;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasonsInYourArea;
        double birthDay;
        int year;
        String fullBirthdayDateWithYear;
        String favoriteQuote;

        //Assigment of data

        name = "Vladimir";
        age = 43;
        gender = 'M';
        student = true;
        numberOfSiblings = 1;
        favoriteNumber = 55L;
        numberOfSeasonsInYourArea = 4;
        birthDay = 1.5;
        year = 1978;
        fullBirthdayDateWithYear = "" + birthDay + "." + year;
        System.out.println("Name\t\t\t\t\t\t\t:" + name);
        System.out.println("Gender\t\t\t\t\t\t\t:" + gender);
        System.out.println("Student\t\t\t\t\t\t\t:" + true);
        System.out.println("Number of siblings\t\t\t\t:" + numberOfSiblings);
        System.out.println("Favorite Number\t\t\t\t\t:" + favoriteNumber);
        System.out.println("Number of seasons in your area\t:" + numberOfSeasonsInYourArea);
        System.out.println("Birthday\t\t\t\t\t\t:" + fullBirthdayDateWithYear);


    }

}
