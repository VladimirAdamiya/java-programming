package day13_conditional_statement;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("***** WELCOME TO THE BANK ATM *****");
        int secretPinCode = 2233;
        int inputPinCode = 2233;

        if (secretPinCode == inputPinCode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        }  else {
            System.out.println("Incorrect pincode" + inputPinCode);
            System.out.println("Please try again");

        }


    }

}
