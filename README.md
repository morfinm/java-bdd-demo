# Practice Software Testing - Java BDD Demo

## Overview

This repository contains a baseline test automation framework for the Practice Software Testing Toolshop website's user registration feature.  
It uses Java, Selenium, Cucumber, and Maven, following BDD and Page Object Model best practices.

## Structure

- `src/main/java/com/practicesoftwaretesting/pages/` - Page Objects
- `src/main/java/com/practicesoftwaretesting/utils/` - Utilities (DriverFactory, TestUtils)
- `src/main/java/com/practicesoftwaretesting/facade/` - Facade for test actions
- `src/test/java/com/practicesoftwaretesting/stepdefs/` - Cucumber Step Definitions
- `src/test/resources/features/` - Cucumber Feature Files

## How to Run

1. Install Java 11+, Maven, and Chrome browser.
2. Clone the repository.
3. Run tests with:
   ```
   mvn test
   ```

## Best Practices

- Page Object Model for maintainability
- Singleton pattern for WebDriver
- Factory for browser management
- Facade for business actions
- Clean code (SOLID, DRY, meaningful names)
- BDD for readable scenarios

## Scenarios Covered

- Registration form display and field validation
- Password requirements and strength indicator
- Password visibility toggle
- Required field, date of birth, and email format validation
- Duplicate email prevention
- Country dropdown selection
- Navigation to login

## Notes

- All locators are based on Chrome DevTools inspection.
- Framework is ready for extension to other features.
- See `registration.feature` for full scenario coverage.

---

## License

MIT
