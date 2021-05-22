package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("Job title is missing, please resend");
        } else {
            System.out.println("Job title looks good");
            if (jobTitle.length() == 0) {
                System.out.println("jobTitle is empty");
            } else {
                System.out.println("Job title is not empty");
            }

            String veggie = "carrots";
            System.out.println();
        }
    }
}
