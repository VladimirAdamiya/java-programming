package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HidePassword {
    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        List<String> hiddenPasswords = new ArrayList<>();
        for (String pass : passwords){
            String temp = "";
            for (int i = 0; i < pass.length(); i++) {
                temp += "*";
            }
            hiddenPasswords.add(temp);
        }
        System.out.println(hiddenPasswords.toString());
    }
    // helper method: method that does some action, and its called somewhere else

    public static String convertToStars(String str) {
        String stars = "";
        for(int i=0; i < str.length(); i++){
            stars += "*";
        }
        return stars;
    }
}