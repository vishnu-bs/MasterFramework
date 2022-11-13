package org.project.config.drivers.webdrivers.remotedriver;

import org.openqa.selenium.WebDriver;
import org.project.config.drivers.manager.web.remote.selenoid.SelenoidChromeManager;
import org.project.config.drivers.manager.web.remote.selenoid.SelenoidEdgeManager;
import org.project.config.drivers.manager.web.remote.selenoid.SelenoidFirefoxManager;
import org.project.config.enums.BrowserType;

public final class SelenoidFactory {

    private SelenoidFactory() {

    }
    public static WebDriver getDriver(BrowserType browserType){
        WebDriver driver = null;
        if (browserType.equals(BrowserType.CHROME)) {
            driver = SelenoidChromeManager.geDriver();
        }
        if (browserType.equals(BrowserType.FIREFOX)) {
            driver = SelenoidFirefoxManager.geDriver();
        }
        if (browserType.equals(BrowserType.EDGE)) {
            driver = SelenoidEdgeManager.geDriver();
        }

        return driver;
    }
}
