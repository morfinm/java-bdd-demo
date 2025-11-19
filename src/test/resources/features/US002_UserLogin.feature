Feature: US-002 User Login

  As a registered customer
  I want to log in to my account
  So that I can access my profile, view my orders, and make purchases

  Background:
    Given I am on the login page

  Scenario: AC-1 Login Form Display
    Then I should see the following elements on the login form:
      | Element                   |
      | Email address field       |
      | Password field            |
      | Login button              |
      | Sign in with Google button|
      | Register your account link|
      | Forgot your Password link |

  Scenario: AC-2 Successful Login with Email and Password
    When I enter valid email "valid@example.com" and password "validPassword123"
    And I click the "Login" button
    Then I should be authenticated successfully
    And I should be redirected to the home page
    And I should see my account indicator in the navigation menu

  Scenario: AC-3 Failed Login - Invalid Credentials
    When I enter invalid email "invalid@example.com" and password "wrongPassword"
    And I click the "Login" button
    Then I should see an error message indicating invalid credentials
    And I should remain on the login page
    And the password field should be cleared

  Scenario: AC-4 Password Visibility Toggle
    When I enter password "myPassword123"
    And I click the eye icon next to the password field
    Then the password should be visible
    When I click the eye icon again
    Then the password should be hidden

  Scenario: AC-5 Required Field Validation
    When I click the "Login" button without entering email and password
    Then I should see validation error messages for required fields
    And the form should not be submitted

  Scenario: AC-6 Email Format Validation
    When I enter an invalid email format "invalidemail"
    Then I should see an error message indicating the email format is invalid
    And the login button should remain enabled

  Scenario: AC-7 Google Social Login
    When I click the "Sign in with Google" button
    Then I should be redirected to Google's authentication page
    When I complete Google authentication successfully
    Then I should be logged in
    And I should be redirected to the home page

  Scenario: AC-8 Navigation to Registration
    When I click the "Register your account" link
    Then I should be redirected to the registration page

  Scenario: AC-9 Navigation to Password Recovery
    When I click the "Forgot your Password?" link
    Then I should be redirected to the password recovery page

  Scenario: AC-10 Session Persistence
    Given I have successfully logged in
    When I navigate to different pages on the website
    Then I should remain logged in

  Scenario: AC-11 Redirect After Login
    Given I attempted to access a protected page without being logged in
    When I successfully log in
    Then I should be redirected to the page I originally tried to access

  Scenario: NFR-Performance Login Page Load Time
    When I navigate to the login page
    Then the login page should load within 2 seconds

  Scenario: NFR-Performance Authentication Time
    When I enter valid email "valid@example.com" and password "validPassword123"
    And I click the "Login" button
    Then the authentication should complete within 2 seconds

  Scenario: NFR-Security Rate Limiting
    When I attempt to login with invalid credentials 6 times within 15 minutes
    Then I should be temporarily blocked from further login attempts

  Scenario: NFR-Accessibility Keyboard Navigation
    When I use keyboard navigation on the login form
    Then I should be able to access all form elements using the keyboard

  Scenario: NFR-Usability Mobile Responsiveness
    When I access the login page on a mobile device
    Then the login form should be responsive and easily usable on a small screen