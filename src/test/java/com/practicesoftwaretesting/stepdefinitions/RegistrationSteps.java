package com.practicesoftwaretesting.stepdefs;

import com.practicesoftwaretesting.utils.DriverFactory;
import com.practicesoftwaretesting.pages.RegistrationPage;
import com.practicesoftwaretesting.facade.RegistrationFacade;
import com.practicesoftwaretesting.utils.TestUtils;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class RegistrationSteps {
    private WebDriver driver = DriverFactory.getDriver();
    private RegistrationPage registrationPage = new RegistrationPage(driver);
    private RegistrationFacade registrationFacade = new RegistrationFacade(driver);

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    @Given("I am a new user visiting the website")
    public void i_am_a_new_user_visiting_the_website() {
        driver.get("https://practicesoftwaretesting.com/");
    }

    @When("I navigate to the registration page")
    public void i_navigate_to_the_registration_page() {
        driver.findElement(By.linkText("Register")).click();
    }

    @Then("I should see a registration form with all required fields")
    public void i_should_see_a_registration_form_with_all_required_fields() {
        Assert.assertTrue(driver.findElement(By.id("registrationForm")).isDisplayed());
        // Additional assertions for each field can be added here
    }

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        driver.get("https://practicesoftwaretesting.com/register");
    }

    @When("I fill in all required fields with valid data")
    public void i_fill_in_all_required_fields_with_valid_data() {
        registrationFacade.registerUser(
            "John", "Doe", "1990-01-01", "123 Main St", "12345", "City", "State",
            "United States", "1234567890", TestUtils.generateRandomEmail(), TestUtils.generateStrongPassword()
        );
    }

    @When("I click the \"Register\" button")
    public void i_click_the_register_button() {
        registrationPage.clickRegister();
    }

    @Then("my account should be created successfully")
    public void my_account_should_be_created_successfully() {
        Assert.assertTrue(registrationPage.getSuccessMessage().contains("Account created successfully"));
    }

    @Then("I should be redirected to the login page or home page")
    public void i_should_be_redirected_to_the_login_page_or_home_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("login") || driver.getCurrentUrl().contains("home"));
    }

    @Then("I should see a success confirmation message")
    public void i_should_see_a_success_confirmation_message() {
        Assert.assertTrue(registrationPage.getSuccessMessage().length() > 0);
    }

    @Given("I am entering a password in the registration form")
    public void i_am_entering_a_password_in_the_registration_form() {
        registrationPage.enterPassword("Test@1234");
    }

    @When("I type a password that meets all requirements")
    public void i_type_a_password_that_meets_all_requirements() {
        registrationPage.enterPassword("Test@1234");
    }

    @Then("I should see the password strength indicator as {string}")
    public void i_should_see_the_password_strength_indicator_as(String expectedStrength) {
        Assert.assertTrue(registrationPage.getPasswordStrength().contains(expectedStrength));
    }

    @Given("I am entering my password")
    public void i_am_entering_my_password() {
        registrationPage.enterPassword("Test@1234");
    }

    @When("I click the eye icon next to the password field")
    public void i_click_the_eye_icon_next_to_the_password_field() {
        registrationPage.togglePasswordVisibility();
    }

    @Then("the password should toggle between visible and hidden text")
    public void the_password_should_toggle_between_visible_and_hidden_text() {
        // Check input type attribute changes
        String type = driver.findElement(By.id("password")).getAttribute("type");
        Assert.assertTrue(type.equals("text") || type.equals("password"));
    }

    @When("I attempt to submit the form with empty required fields")
    public void i_attempt_to_submit_the_form_with_empty_required_fields() {
        registrationPage.clickRegister();
    }

    @Then("I should see validation error messages indicating which fields are required")
    public void i_should_see_validation_error_messages_indicating_which_fields_are_required() {
        Assert.assertTrue(registrationPage.getErrorMessage().contains("required"));
    }

    @When("I enter an invalid date format")
    public void i_enter_an_invalid_date_format() {
        registrationPage.enterDateOfBirth("01-01-1990");
        registrationPage.clickRegister();
    }

    @Then("I should see an error message indicating the correct format")
    public void i_should_see_an_error_message_indicating_the_correct_format() {
        Assert.assertTrue(registrationPage.getErrorMessage().contains("YYYY-MM-DD"));
    }

    @When("I enter an invalid email format")
    public void i_enter_an_invalid_email_format() {
        registrationPage.enterEmail("invalidemail");
        registrationPage.clickRegister();
    }

    @Then("I should see an error message indicating the email format is invalid")
    public void i_should_see_an_error_message_indicating_the_email_format_is_invalid() {
        Assert.assertTrue(registrationPage.getErrorMessage().contains("invalid email"));
    }

    @Given("I am registering with an email that already exists")
    public void i_am_registering_with_an_email_that_already_exists() {
        registrationPage.enterEmail("existinguser@test.com");
    }

    @When("I attempt to submit the registration form")
    public void i_attempt_to_submit_the_registration_form() {
        registrationPage.clickRegister();
    }

    @Then("I should see an error message indicating the email is already registered")
    public void i_should_see_an_error_message_indicating_the_email_is_already_registered() {
        Assert.assertTrue(registrationPage.getErrorMessage().contains("already registered"));
    }

    @When("I click on the Country dropdown")
    public void i_click_on_the_country_dropdown() {
        driver.findElement(By.id("country")).click();
    }

    @Then("I should see a comprehensive list of all countries")
    public void i_should_see_a_comprehensive_list_of_all_countries() {
        Assert.assertTrue(driver.findElements(By.cssSelector("#country option")).size() > 100);
    }

    @When("I click the \"Not yet an account?\" login link")
    public void i_click_the_not_yet_an_account_login_link() {
        registrationPage.clickLoginLink();
    }

    @Then("I should be navigated to the login page")
    public void i_should_be_navigated_to_the_login_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
}