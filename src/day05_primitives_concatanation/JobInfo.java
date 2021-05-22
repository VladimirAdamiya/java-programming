package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Optics Planet";
        String jobDescription = "Expirience in Java, Selenium, Tomato, JUnit";
        double salary = 85000l;
        byte yearsOffExp = 3;
        boolean hasBenefits = true;
        System.out.println("Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("Job Description: " + jobDescription);
        System.out.println("Salary: $" + salary);
        System.out.println("Years Off Exp: " + yearsOffExp);
        System.out.println("Has Benefits? " + hasBenefits);

    }
}
