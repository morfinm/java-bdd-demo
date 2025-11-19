package com.example.stepdefinitions;

import com.example.pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefinitions {

    private LoginPage loginPage;

    public LoginStepDefinitions() {
        loginPage = new LoginPage();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @Then("I should see the following elements on the login form:")
    public void iShouldSeeTheFollowingElementsOnTheLoginForm(List<String> elements) {
        elements.forEach(element -> Assert.assertTrue(loginPage.isElementPresent(element)));
    }

    @When("I enter valid email {string} and password {string}")
    public void iEnterValidEmailAndPassword(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @When("I click the {string} button")
    public void iClickTheButton(String buttonName) {
        loginPage.clickButton(buttonName);
    }

    @Then("I should be authenticated successfully")
    public void iShouldBeAuthenticatedSuccessfully() {
        Assert.assertTrue(loginPage.isUserAuthenticated());
    }

    @Then("I should be redirected to the home page")
    public void iShouldBeRedirectedToTheHomePage() {
        Assert.assertTrue(loginPage.isOnHomePage());
    }

    @Then("I should see my account indicator in the navigation menu")
    public void iShouldSeeMyAccountIndicatorInTheNavigationMenu() {
        Assert.assertTrue(loginPage.isAccountIndicatorVisible());
    }

    @When("I enter invalid email {string} and password {string}")
    public void iEnterInvalidEmailAndPassword(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @Then("I should see an error message indicating invalid credentials")
    public void iShouldSeeAnErrorMessageIndicatingInvalidCredentials() {
        Assert.assertTrue(loginPage.isErrorMessageVisible());
    }

    @Then("I should remain on the login page")
    public void iShouldRemainOnTheLoginPage() {
        Assert.assertTrue(loginPage.isOnLoginPage());
    }

    @Then("the password field should be cleared")
    public void thePasswordFieldShouldBeCleared() {
        Assert.assertTrue(loginPage.isPasswordFieldCleared());
    }

    @When("I enter password {string}")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click the eye icon next to the password field")
    public void iClickTheEyeIconNextToThePasswordField() {
        loginPage.togglePasswordVisibility();
    }

    @Then("the password should be visible")
    public void thePasswordShouldBeVisible() {
        Assert.assertTrue(loginPage.isPasswordVisible());
    }

    @Then("the password should be hidden")
    public void thePasswordShouldBeHidden() {
        Assert.assertFalse(loginPage.isPasswordVisible());
    }

    @When("I click the {string} button without entering email and password")
    public void iClickTheButtonWithoutEnteringEmailAndPassword(String buttonName) {
        loginPage.clickButton(buttonName);
    }

    @Then("I should see validation error messages for required fields")
    public void iShouldSeeValidationErrorMessagesForRequiredFields() {
        Assert.assertTrue(loginPage.areValidationErrorMessagesVisible());
    }

    @Then("the form should not be submitted")
    public void theFormShouldNotBeSubmitted() {
        Assert.assertFalse(loginPage.isFormSubmitted());
    }

    @When("I enter an invalid email format {string}")
    public void iEnterAnInvalidEmailFormat(String invalidEmail) {
        loginPage.enterEmail(invalidEmail);
    }

    @Then("I should see an error message indicating the email format is invalid")
    public void iShouldSeeAnErrorMessageIndicatingTheEmailFormatIsInvalid() {
        Assert.assertTrue(loginPage.isEmailFormatErrorVisible());
    }

    @Then("the login button should remain enabled")
    public void theLoginButtonShouldRemainEnabled() {
        Assert.assertTrue(loginPage.isLoginButtonEnabled());
    }

    @Then("I should be redirected to Google's authentication page")
    public void iShouldBeRedirectedToGoogleSAuthenticationPage() {
        Assert.assertTrue(loginPage.isOnGoogleAuthPage());
    }

    @When("I complete Google authentication successfully")
    public void iCompleteGoogleAuthenticationSuccessfully() {
        loginPage.completeGoogleAuth();
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
        Assert.assertTrue(loginPage.isUserLoggedIn());
    }

    @When("I click the {string} link")
    public void iClickTheLink(String linkText) {
        loginPage.clickLink(linkText);
    }

    @Then("I should be redirected to the registration page")
    public void iShouldBeRedirectedToTheRegistrationPage() {
        Assert.assertTrue(loginPage.isOnRegistrationPage());
    }

    @Then("I should be redirected to the password recovery page")
    public void iShouldBeRedirectedToThePasswordRecoveryPage() {
        Assert.assertTrue(loginPage.isOnPasswordRecoveryPage());
    }

    @Given("I have successfully logged in")
    public void iHaveSuccessfullyLoggedIn() {
        loginPage.loginWithValidCredentials();
    }

    @When("I navigate to different pages on the website")
    public void iNavigateToDifferentPagesOnTheWebsite() {
        loginPage.navigateToRandomPages();
    }

    @Then("I should remain logged in")
    public void iShouldRemainLoggedIn() {
        Assert.assertTrue(loginPage.isUserStillLoggedIn());
    }

    @Given("I attempted to access a protected page without being logged in")
    public void iAttemptedToAccessAProtectedPageWithoutBeingLoggedIn() {
        loginPage.attemptToAccessProtectedPage();
    }

    @Then("I should be redirected to the page I originally tried to access")
    public void iShouldBeRedirectedToThePageIOriginallyTriedToAccess() {
        Assert.assertTrue(loginPage.isOnOriginallyAccessedPage());
    }

    @Then("the login page should load within {int} seconds")
    public void theLoginPageShouldLoadWithinSeconds(int seconds) {
        Assert.assertTrue(loginPage.isPageLoadedWithinTime(seconds));
    }

    @Then("the authentication should complete within {int} seconds")
    public void theAuthenticationShouldCompleteWithinSeconds(int seconds) {
        Assert.assertTrue(loginPage.isAuthenticationCompletedWithinTime(seconds));
    }

    @When("I attempt to login with invalid credentials {int} times within {int} minutes")
    public void iAttemptToLoginWithInvalidCredentialsTimesWithinMinutes(int attempts, int minutes) {
        loginPage.attemptMultipleInvalidLogins(attempts, minutes);
    }

    @Then("I should be temporarily blocked from further login attempts")
    public void iShouldBeTemporarilyBlockedFromFurtherLoginAttempts() {
        Assert.assertTrue(loginPage.isLoginBlocked());
    }

    @When("I use keyboard navigation on the login form")
    public void iUseKeyboardNavigationOnTheLoginForm() {
        loginPage.navigateFormUsingKeyboard();
    }

    @Then("I should be able to access all form elements using the keyboard")
    public void iShouldBeAbleToAccessAllFormElementsUsingTheKeyboard() {
        Assert.assertTrue(loginPage.areAllElementsAccessibleByKeyboard());
    }

    @When("I access the login page on a mobile device")
    public void iAccessTheLoginPageOnAMobileDevice() {
        loginPage.simulateMobileDevice();
    }

    @Then("the login form should be responsive and easily usable on a small screen")
    public void theLoginFormShouldBeResponsiveAndEasilyUsableOnASmallScreen() {
        Assert.assertTrue(loginPage.isLoginFormResponsive());
    }
}