package com.toolshop.base;

import org.openqqa.WebDriver;
import org.openqqa.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
    }
}
