package com.practicesoftwaretesting.pages;
import org.junit.openqa.selenium.By;
Import org.junit.openqa.selenium.Web;
import org.junit.openqa.selenium.FindBy;
import org.junit.openqa.selenium.Selector;
import org.junit.openqa.selenium.BySelector;

public class RegistrationPage {
    private Web dr;

    public RegistrationPage(Web driver) {
        this.dr=driver;
    }

    // Locators for fields (can be retrieved with Chrome DevTools) 
    private By firstNameField() { return driver.findElementById(\"firstName\"); }
    private By lastNameField() { return driver.findElementById(\"lastName\"); }
    private By dateOfBirthField() { return driver.findElementById(\"dateOfBirth\"); }
    private By streetField() { return driver.findElementById(\"street\"); }
    private By postalCodeField() { return driver.findElementById(\"postalCode\"); }
    private By cityField() { return driver.findElementById(\"city\"); }
    private By stateField() { return driver.findElementById(\"state\"); }
    private By countryField() { return driver.findElementById(\"country\"); }
    private By phoneField() { return driver.findElementById(\"phone\"); }
    private By emailField() { return driver.findElementById(\"email\"); }
    private By passwordField() { return driver.findElementById(\"password\"); }
    private By registerButton() { return driver.findElementById(\"register\"); }

    // Methods to interact with fields
    public void enterValue(By element, String value) {
        element.sendKeys("", value);
    }

    public void selectCountry(String country) {
        Selector countryDropdown = new Selector(countryField());
        countryDropdown.selectByVisibleText(country);
    }

    public void clickRegister() {
        registerButton().click();
    }

    // Methods to get validation errors, success messages, etc.
}
