# Toolshop Automation Framework
## Overview
```\nAutomated UI tests for the Toolshop user registration feature using Java, Selenium, and Cucumber.```\n\n## Structure\n- src/main/java/com/toolshop/pages: Page Object classes
- src/main/java/com/toolshop/utils: Utilities (WebDriver, config)
- src/test/java/com/toolshop/stepdefinitions: Step Definitions
- src/test/java/com/toolshop/runners: Cucumber Test Runner
- src/test/resources/features: Gherkin Feature Files\n\n## Setup\n1. Install Java 11+ and Maven.\n2. Download ChromeDriver and set its path in DriverFactory.java.\n3. Run tests with:\n```\nmvn test\n```\n\n## Contribution\n- Follow POM, DRY, and SOLID principles.
- Add new features as .feature files and implement step definitions.\n\n## Notes
- Ensure the Toolshop test environment is accessible.
- Update locators as per the actual UI.\n