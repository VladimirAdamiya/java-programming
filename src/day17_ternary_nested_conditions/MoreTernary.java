package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 35;
        String reply = (hourlyRate > 45)? "accept" : "not accept";
        System.out.println("reply = " + reply);


        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Murodil/Saim" : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "yes, have Dl, can drive" : "No DL, can't wriving";
        System.out.println("driving = " + driving);

    }
}
