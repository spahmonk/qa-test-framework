package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverProvider {
    DesiredCapabilities capabilitiesUtil = CapabilitiesUtil.getCapabilities();

    public WebDriver getDriver() {
        System.out.println(" Executing on CHROME");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setBrowserName("chrome");
        String node = "http://localhost:4444/wd/hub";
        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(node),cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
