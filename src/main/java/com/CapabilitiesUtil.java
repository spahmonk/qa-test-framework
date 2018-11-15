package com;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesUtil {

    public static DesiredCapabilities getCapabilities(){
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        return capabilities;
    }

}
