package com.practicesoftwaretesting.utils;

import java.util.Random;

public class TestUtils {
    public static String generateRandomEmail() {
        return "user" + new Random().nextInt(10000) + "@test.com";
    }
    public static String generateStrongPassword() {
        return "Test@1234";
    }
}