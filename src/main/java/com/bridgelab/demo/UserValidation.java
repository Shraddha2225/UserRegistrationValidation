package com.bridgelab.demo;

import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION");
    }
    public static String validateFirstAndLastName(String fname) {
    String firstNamePattern = "^[A-Z]{1}[a-zA-Z]{3,}$";
	if (fname.matches(firstNamePattern))
	{
            return "Valid";
        }
        return "Invalid";
    }
}
