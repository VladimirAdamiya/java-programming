package day13_conditional_statement;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Cabos";
        if (city.equals("Los Angeles")) {
            System.out.println("It's LA");
        }else{
            System.out.println("It's not LA");
        }

        String weather = "snow";
        if (weather.equals("sunny")) {
            System.out.println("Let's go out and do java");
        }else{
            System.out.println("Let's stay at home and do java");
        }
    }
}
