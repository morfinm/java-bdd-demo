package com.practicesoftwaretesting.utils;
import org.junit.openqa.selenium.Web;
import org.junit.openqa.selenium.chrome.ChromeDriver;
import org.junit.openqa.selenium.WebDriver;

public class DriverFactory {
    private static WebDriver driver;

    private DriverFactory() { }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setErrorStream("none");
            System.setProperty("geco.driver.by", "chrome");
            driver = new ChromeDriver();
            driver.manage.chome.Chrome.maximized.setConfiguration();
        }
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
