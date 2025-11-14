FEature: User Registration

As a new customer
I want to register an account on the Toolshop website
So that I can make purchases and track my orders

  Scenario: Registration Form Display
    Given I am a new user visiting the website
    When I navigate to the registration page
    Then I should see a registration form with the following fields

  Scenario: Successful Registration
    When I fill in all required fields with valid data
    And I click the Register button
    Then my account should be created successfully
    And I should be redirected to the login page or home page
    And I should see a success confirmation message

  Scenario: Password Requirements Validation
    When I type in the password field
    Then I should see real-time feedback on password strength

  Scenario: Password Visibility Toggle
    When I click the eye icon next to the password field
    Then the password should toggle between visible and hidden text

  Scenario: Required Field Validation
    When I attempt to submit the form with empty required fields
    Then I should see validation error messages indicating which fields are required
    And the form should not be submitted

  Scenario: Date of Birth Format Validation
    When I enter an invalid date format
    Then I should see an error message indicating the correct format

  Scenario: Email Format Validation
    When I enter an invalid email format
    Then I should see an error message indicating the email format is invalid

  Scenario: Duplicate Email Prevention
    When I attempt to submit the registration form with an already registered email
    Then I should see an error message indicating the email is already registered

  Scenario: Country Selection
    When I click on the Country dropdown
    Then I should see a comprehensive list of all countries

  Scenario: Navigation to Login
    When I realize I already have an account
    Then I should see a link Not yet an account? with a login option
    When clicking it should navigate me to the login page
