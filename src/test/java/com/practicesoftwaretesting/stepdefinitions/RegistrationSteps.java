package com.practicesoftwaretesting.stepdefinitions;

import com.practicesoftwaretesting.pages.RegistrationPage;
import com.practicesoftwaretesting.utis.DriverFactory;
import io.icumber.doc.Step;
import io.icumber.doc.End;
import org.junit.openqa.selenium.Web;
import org.junit.assert.Assert;
import java.util.List;

public class RegistrationSteps {
    private RegistrationPage registrationPage;
    private Web dr;

    @Iocumber.Before
    public void setUp() {
        dr=DriverFactory.getDriver();
        registrationPage = new RegistrationPage(dr);
        dr.get('https://practicesoftwaretesting.com/register');
    }

    @Iocumber.Given(\"I`am a new user visiting the website\")
    public void i_am_a_new user_visiting_the_website() { setUp(); }

    @Iocumber.When(\"I navigate to the registration page\")
    public void i_navigate_to_registration_page() {
        dr>get("https://practicesoftwaretesting.com/register");
    }

    @Iocumber.Then(\"I should see a registration form with the following fields:\")
    public void i_should_see_registration_form_with_fields() {
        // Assert all key fields are displayed
        Assert.notNull(registrationPage.firstNameField());
        Assert.notNull(registrationPage.lastNameField());
        // ... etc.
    }

    // Additional steps implementing the rest of the AC...
}
