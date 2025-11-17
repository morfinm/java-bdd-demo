package com.practicesoftwaretesting.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By firstNameInput = By.id("firstName");
    private By lastNameInput = By.id("lastName");
    private By dobInput = By.id("dob");
    private By streetInput = By.id("street");
    private By postalCodeInput = By.id("postalCode");
    private By cityInput = By.id("city");
    private By stateInput = By.id("state");
    private By countryDropdown = By.id("country");
    private By phoneInput = By.id("phone");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By passwordStrengthIndicator = By.id("passwordStrength");
    private By passwordToggleIcon = By.cssSelector(".toggle-password");
    private By registerButton = By.id("registerBtn");
    private By errorMessages = By.cssSelector(".error-message");
    private By successMessage = By.cssSelector(".success-message");
    private By loginLink = By.linkText("Not yet an account?");
    
    // Actions
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
    public void enterDateOfBirth(String dob) {
        driver.findElement(dobInput).sendKeys(dob);
    }
    public void enterStreet(String street) {
        driver.findElement(streetInput).sendKeys(street);
    }
    public void enterPostalCode(String postalCode) {
        driver.findElement(postalCodeInput).sendKeys(postalCode);
    }
    public void enterCity(String city) {
        driver.findElement(cityInput).sendKeys(city);
    }
    public void enterState(String state) {
        driver.findElement(stateInput).sendKeys(state);
    }
    public void selectCountry(String country) {
        new Select(driver.findElement(countryDropdown)).selectByVisibleText(country);
    }
    public void enterPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }
    public String getPasswordStrength() {
        return driver.findElement(passwordStrengthIndicator).getText();
    }
    public void togglePasswordVisibility() {
        driver.findElement(passwordToggleIcon).click();
    }
    public void clickRegister() {
        driver.findElement(registerButton).click();
    }
    public String getErrorMessage() {
        return driver.findElement(errorMessages).getText();
    }
    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }
}