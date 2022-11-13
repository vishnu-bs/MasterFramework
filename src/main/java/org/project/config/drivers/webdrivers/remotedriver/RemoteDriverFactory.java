package org.project.config.drivers.webdrivers.remotedriver;

import org.openqa.selenium.WebDriver;
import org.project.config.enums.BrowserType;
import org.project.config.enums.RemoteTools;

public class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }
    public static WebDriver getDriver(RemoteTools remoteToolType, BrowserType browserType){
        WebDriver driver = null;
        if(remoteToolType.equals(RemoteTools.SELENIUM)) {
            driver = SeleniumGridDriverFactory.getDriver(browserType);
        }
        else if (remoteToolType.equals(RemoteTools.SELENOID)) {
            driver = SelenoidFactory.getDriver(browserType);
        }
        else if (remoteToolType.equals(RemoteTools.BROWSER_STACK)) {
            driver = BrowserStackFactory.getDriver(browserType);
        }
        return driver;
    }

}
