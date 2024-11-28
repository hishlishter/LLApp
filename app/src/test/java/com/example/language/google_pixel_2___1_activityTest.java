package com.example.language;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class google_pixel_2___1_activityTest {
    @Test
    public void testLoginValidation_ValidCredentials() {
        String email = "JD921L";
        String password = "12345678";

        boolean isValid = google_pixel_2___1_activity.AuthUtil.loginValidation(email, password);

        // Assert that the validation returns true for valid credentials
        Assert.assertTrue(isValid);
    }

    @Test
    public void testLoginValidation_InvalidCredentials() {
        String email = "example@mail.com";
        String password = "wrongPassword";

        boolean isValid = google_pixel_2___1_activity.AuthUtil.loginValidation(email, password);

        // Assert that the validation returns false for invalid credentials
        Assert.assertFalse(isValid);
    }
}