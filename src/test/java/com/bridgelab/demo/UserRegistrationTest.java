package com.bridgelab.demo;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnValid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstName("Shraddha");
        Assert.assertEquals("Valid",result);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnInvalid() {
        UserValidation userValidation = new UserValidation();
        String result=userValidation.validateFirstName("shraddha");
        Assert.assertEquals("Invalid",result);
    }
}
