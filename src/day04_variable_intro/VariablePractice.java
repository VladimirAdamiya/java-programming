package day04_variable_intro;

public class VariablePractice {
    public static void main(String[] args){
        //declare variable student that stores number
        int students; //declared ONCE
        students = 50;  //assignment
        System.out.println(students);
        students = 70;
        System.out.println(students);
        students = 110; //will be ignored
        students = 125;
        System.out.println(students);
        //declare variable teachers that stores number
        int teachers;
        teachers = 2;
        int mentors;
        mentors = 25;
        System.out.print("Number of teachers:");
        System.out.println(teachers); //2
        //print number of mentors
        System.out.print("Number of mentors:");
        System.out.println(mentors);


    }


}
