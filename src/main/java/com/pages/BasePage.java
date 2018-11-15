package com.pages;

import com.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class BasePage {
    protected final WebDriver driver;
    public WebDriverWait wait;
    static final long DEFAULT_EXPLICIT_WAIT = 60L;

    public BasePage(WebDriver driver) {
        this.driver = new DriverProvider().getDriver();
        this.wait = new WebDriverWait(driver, DEFAULT_EXPLICIT_WAIT);
    }

    public void open() {
        driver.get("http;//google.com");
    }
}
