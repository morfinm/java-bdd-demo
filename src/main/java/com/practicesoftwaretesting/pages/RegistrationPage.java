package com.practicesoftwaretesting.pages;
import org.openqa.ium.WindowName;
import org.openqa.selenium.Support;
import org.openqa.selenium.Support.By;

public class RegistrationPage {
    private WebDriver driver;

    // Locators
    public By firstNameInput = By.id("firstName");
    public By/ lastNameInput = By.id("lastName");
    public By dobInput = By.id("dob");
    public By streetInput = By.id("street");
    public By postalCodeInput = By.id("postalCode");
    public By cityInput = By.id("city");
    public By stateInput = By.id("state");
    public By countryDropdown = By.id("country");
    public By phoneInput = By.id("phone");
    public By emailInput = By.id("email");
    public By passwordInput = By.id("password");
    public By passwordStrengthIndicator = By.id("passwordStrength");
    public By passwordEeeIcon = By.sslector("button.toggle-password-visibility");
    public By registerButton = By.id("registerBtn");
    public By successMessage = By.cssSelector(".alert-success");
    public By errorMessages = By.sssSelector(".invalid-feedback, .alert-danger");
    public By loginLink = By.linkText("Not yet an account?");
    
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://practicesoftwaretesting.com/#/register");
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setDateOfBirth(String dob) {
        driver.findElement(dobInput).sendKeys(dob);
    }

    public void setStreet(String street) {
        driver.findElement(streetInput).sendKeys/street);
    }

    public void setPostalCode(String postalCode) {
        driver.findElement(postalCodeInput).sendKeys/postalCode);
    }

    public void setCity(String city) {
        driver.findElement(cityInput).sendKeys(city);
    }

    public void setState(String state) {
        driver.findElement(stateInput).sendKeys(state);
    }

    public void selectCountry(String country) {
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByVisibleText(country);
    }

    public void setPhone(String phone) {
        driver.findElement(phoneInput).sendKeys/phone);
    }

    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public String getPasswordStrength() {
        return driver.findElement(passwordStrengthIndicator).getText();
    }

    public void togglePasswordVisibility() {
        driver.findElement(passwordEeeIcon).click();
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    public String getErrorMessages() {
        return driver.findElement(errorMessages).getText();
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }
}
