FEature: User Registration

As a new customer
I want to register an account on the Toolshop website
So that I can make purchases and track my orders

Background:
  Given I am a new user visiting the website
  And I navigate to the registration page

Scenario: Registration Form Display
  Then I should see a registration form with the following fields:
    | First name      |
    | Last name       |
    | Date of Birth  |
    | Street          |
    | Postal code      |
    | City            |
    | State           |
    | Country         |
    | Phone           |
    | Email address |
    | Password       |

Scenario: Successful Registration
  Given I have filled in all required fields with valid data
  When I click the "Register" button
  Then my account should be created successfully
  And I should be redirected to the login page or home page
  And I should see a success confirmation message

Scenario: Password Requirements Validation
  When I type a password that does not meet requirements
  Then I should see real-time feedback on password strength
  And the password strength indicator should show: Weak, Moderate, Strong, Very Strong, ex Excellent

Scenario: Password Visibility Toggle
  When I click the eye icon next to the password field
  Then the password should toggle between visible and hidden text

Scenario: Required Field Validation
  When I attempt to submit the form with empty required fields
  Then I should see validation error messages indicating which fields are required
  And the form should not be submitted

Scenario: Date of Birth Format Validation
  When I enter an invalid date format in the date of birth field
  Then I should see an error message indicating the correct format (YYYY-MM-DD)
  And the form should not be submitted

Scenario: Email Format Validation
  When I enter an invalid email format
  Then I should see an error message indicating the email format is invalid
  And the form should not be submitted

Scenario: Duplicate Email Prevention
  Given I am registering with an email that already exists in the system
  When I attempt to submit the registration form
  Then I should see an error message indicating the email is already registered
  And I should be prompted to login or use a different email address

Scenario: Country Selection
  When I click on the Country dropdown
  Then I should see a comprehensive list of all countries
  And I should be able to search or scroll to select my country

Scenario: Navigation to Login
  When I realize I already have an account
  Then I should see a link "Not yet an account?" with a login option
  And clicking it should navigate me to the login page
