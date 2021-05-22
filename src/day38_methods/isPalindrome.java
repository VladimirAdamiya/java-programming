package day38_methods;

public class isPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
