package com.practicesoftwaretesting.facade;

import com.practicesoftwaretesting.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class RegistrationFacade {
    private RegistrationPage registrationPage;

    public RegistrationFacade(WebDriver driver) {
        this.registrationPage = new RegistrationPage(driver);
    }

    public void registerUser(String firstName, String lastName, String dob, String street, String postalCode,
                             String city, String state, String country, String phone, String email, String password) {
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
        registrationPage.enterDateOfBirth(dob);
        registrationPage.enterStreet(street);
        registrationPage.enterPostalCode(postalCode);
        registrationPage.enterCity(city);
        registrationPage.enterState(state);
        registrationPage.selectCountry(country);
        registrationPage.enterPhone(phone);
        registrationPage.enterEmail(email);
        registrationPage.enterPassword(password);
        registrationPage.clickRegister();
    }
}