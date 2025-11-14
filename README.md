#Java BDD Demo - User Registration Test Automation Framework

## Overview

This repository contains a baseline BDD test automation framework for the Practice Software Testing Toolshop website user registration feature.

## Tech Stack

- Java
- Selenium WebDriver
- Cucumber (BDD)
- Maven
- JUnit

## Structure

- `src/main/java/com/practicesoftwaretesting/pages/ `- Page Object Model classes
- `src/test/java/com/practicesoftwaretesting/stepdefinitions/` - Step Definitions for Cucumber
- `src/test/resources/features/` - Gherkin Feature Files
- `src/main/java/com/practicesoftwaretesting/utils/` - Utilities (DriverFactory, Config, etc.)

## How to Run

 1. Install Java, Maven, and ChromeDriver.
 2. Clone the repository.
 3. Update chromedriver path in `DriverFactory.java` 
 4. Run tests with:
   ` mvn clean test` 

## Scenarios Covered

- Registration form field presence
- Successful registration
- Password requirements and strength
- Password visibility toggle
- Required field validation
- Date of birth and email format validation
- Duplicate email prevention
- Country dropdown
- Navigation to login


## Best Practices

- Page Object Model
- Singleton Driver
- Clean code and SOLID principles
- Readable Gherkin scenarios


## Contribution
Feel free to fork and contribute!
