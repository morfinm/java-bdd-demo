Feature: User Registration

        Scenario: Registration Form Display
            Given I am a new user visiting the website
             When I navigate to the registration page
             Then I should see a registration form with all required fields

        Scenario: Successful Registration
            Given I am on the registration page
             When I fill in all required fields with valid data
              And I click the "Register" button
             Then my account should be created successfully
              And I should be redirected to the login page or home page
              And I should see a success confirmation message

        Scenario: Password Requirements Validation
            Given I am entering a password in the registration form
             When I type a password that meets all requirements
             Then I should see the password strength indicator as "Strong" or above

        Scenario: Password Visibility Toggle
            Given I am entering my password
             When I click the eye icon next to the password field
             Then the password should toggle between visible and hidden text

        Scenario: Required Field Validation
            Given I am on the registration form
             When I attempt to submit the form with empty required fields
             Then I should see validation error messages indicating which fields are required

        Scenario: Date of Birth Format Validation
            Given I am entering my date of birth
             When I enter an invalid date format
             Then I should see an error message indicating the correct format

        Scenario: Email Format Validation
            Given I am entering my email address
             When I enter an invalid email format
             Then I should see an error message indicating the email format is invalid

        Scenario: Duplicate Email Prevention
            Given I am registering with an email that already exists
             When I attempt to submit the registration form
             Then I should see an error message indicating the email is already registered

        Scenario: Country Selection
            Given I am on the registration form
             When I click on the Country dropdown
             Then I should see a comprehensive list of all countries

        Scenario: Navigation to Login
            Given I am on the registration page
             When I click the "Not yet an account?" login link
             Then I should be navigated to the login page