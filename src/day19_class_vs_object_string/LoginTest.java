package day19_class_vs_object_string;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "CYBERTEK";
        String expPassword = "Abc123";

        String userName = "CYBERTEc";
        String password = "Abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("pass - user log in successfully");
        } else
            {
        if (!expUserName.equalsIgnoreCase(userName)) {
            System.out.println("Fail - User name is incorrect");
        }

        }
    }

    }
