package com.bridgelab.demo;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION");
    }
    public static String validateFirstName(String fname) {
        String pattern1="^[A-Z]{1}[a-zA-Z]{3,}$";
        if (fname.matches(pattern1))
        {
            return "Valid";
        }
        return "Invalid";
    }
}
