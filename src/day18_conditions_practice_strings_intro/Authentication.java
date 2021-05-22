package day18_conditions_practice_strings_intro;

import javax.sound.midi.Soundbank;

public class Authentication {
    public static void main(String[] args) {
        int expLast4Ssn = 1234;
        int expPinCode = 4321;

        int last4Ssn = 1235;
        int pinCode = 4321;
        if (last4Ssn == expLast4Ssn && expPinCode == pinCode) {
            System.out.println("Authentication success");
        } else {
            System.out.println("Error authentication");
        }
    }
}
