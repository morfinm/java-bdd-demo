package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[text()='Login']");
    private By googleSignInButton = By.xpath("//button[contains(text(), 'Sign in with Google')]");
    private By registerLink = By.xpath("//a[text()='Register your account']");
    private By forgotPasswordLink = By.xpath("//a[text()='Forgot your Password?']");
    private By errorMessage = By.id("error-message");
    private By passwordToggle = By.xpath("//button[@aria-label='Toggle password visibility']");
    private By accountIndicator = By.id("account-indicator");

    public LoginPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToLoginPage() {
        driver.get("https://practicesoftwaretesting.com/login");
    }

    public boolean isElementPresent(String element) {
        switch (element) {
            case "Email address field":
                return driver.findElement(emailField).isDisplayed();
            case "Password field":
                return driver.findElement(passwordField).isDisplayed();
            case "Login button":
                return driver.findElement(loginButton).isDisplayed();
            case "Sign in with Google button":
                return driver.findElement(googleSignInButton).isDisplayed();
            case "Register your account link":
                return driver.findElement(registerLink).isDisplayed();
            case "Forgot your Password link":
                return driver.findElement(forgotPasswordLink).isDisplayed();
            default:
                return false;
        }
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickButton(String buttonName) {
        if ("Login".equals(buttonName)) {
            driver.findElement(loginButton).click();
        } else if ("Sign in with Google".equals(buttonName)) {
            driver.findElement(googleSignInButton).click();
        }
    }

    public boolean isUserAuthenticated() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(accountIndicator)).isDisplayed();
    }

    public boolean isOnHomePage() {
        return driver.getCurrentUrl().contains("/home");
    }

    public boolean isAccountIndicatorVisible() {
        return driver.findElement(accountIndicator).isDisplayed();
    }

    public boolean isErrorMessageVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).isDisplayed();
    }

    public boolean isOnLoginPage() {
        return driver.getCurrentUrl().contains("/login");
    }

    public boolean isPasswordFieldCleared() {
        return driver.findElement(passwordField).getAttribute("value").isEmpty();
    }

    public void togglePasswordVisibility() {
        driver.findElement(passwordToggle).click();
    }

    public boolean isPasswordVisible() {
        return "text".equals(driver.findElement(passwordField).getAttribute("type"));
    }

    public boolean areValidationErrorMessagesVisible() {
        List<WebElement> errorMessages = driver.findElements(By.className("error-message"));
        return !errorMessages.isEmpty();
    }

    public boolean isFormSubmitted() {
        // This is a placeholder. You need to implement the actual logic to check if the form was submitted.
        return false;
    }

    public boolean isEmailFormatErrorVisible() {
        return driver.findElement(By.id("email-error")).isDisplayed();
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isOnGoogleAuthPage() {
        return driver.getCurrentUrl().contains("accounts.google.com");
    }

    public void completeGoogleAuth() {
        // This is a placeholder. Implement the Google authentication process here.
    }

    public boolean isUserLoggedIn() {
        return driver.findElement(accountIndicator).isDisplayed();
    }

    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public boolean isOnRegistrationPage() {
        return driver.getCurrentUrl().contains("/register");
    }

    public boolean isOnPasswordRecoveryPage() {
        return driver.getCurrentUrl().contains("/forgot-password");
    }

    public void loginWithValidCredentials() {
        enterEmail("valid@example.com");
        enterPassword("validPassword123");
        clickButton("Login");
    }

    public void navigateToRandomPages() {
        // This is a placeholder. Implement navigation to random pages here.
    }

    public boolean isUserStillLoggedIn() {
        return driver.findElement(accountIndicator).isDisplayed();
    }

    public void attemptToAccessProtectedPage() {
        driver.get("https://practicesoftwaretesting.com/account");
    }

    public boolean isOnOriginallyAccessedPage() {
        return driver.getCurrentUrl().contains("/account");
    }

    public boolean isPageLoadedWithinTime(int seconds) {
        long start = System.currentTimeMillis();
        navigateToLoginPage();
        long end = System.currentTimeMillis();
        return (end - start) / 1000 <= seconds;
    }

    public boolean isAuthenticationCompletedWithinTime(int seconds) {
        long start = System.currentTimeMillis();
        loginWithValidCredentials();
        long end = System.currentTimeMillis();
        return (end - start) / 1000 <= seconds;
    }

    public void attemptMultipleInvalidLogins(int attempts, int minutes) {
        for (int i = 0; i < attempts; i++) {
            enterEmail("invalid@example.com");
            enterPassword("wrongPassword");
            clickButton("Login");
        }
    }

    public boolean isLoginBlocked() {
        // This is a placeholder. Implement the actual check for login being blocked.
        return false;
    }

    public void navigateFormUsingKeyboard() {
        // This is a placeholder. Implement keyboard navigation here.
    }

    public boolean areAllElementsAccessibleByKeyboard() {
        // This is a placeholder. Implement the actual check for keyboard accessibility.
        return false;
    }

    public void simulateMobileDevice() {
        // This is a placeholder. Implement mobile device simulation here.
    }

    public boolean isLoginFormResponsive() {
        // This is a placeholder. Implement the actual check for responsiveness.
        return false;
    }
}