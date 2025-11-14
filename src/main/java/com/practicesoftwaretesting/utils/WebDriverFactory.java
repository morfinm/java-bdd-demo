package com.practicesoftwaretesting.utils;
import org.openqa.ium.WebDriver;
import org.openqa.chrome.ChromeDriver;

public class WebDriverFactory {
    privatic static WebDriver driver;

    private WebDriverFactory() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window.maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
