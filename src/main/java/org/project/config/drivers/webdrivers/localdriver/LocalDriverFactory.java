package org.project.config.drivers.webdrivers.localdriver;

import org.openqa.selenium.WebDriver;
import org.project.config.enums.BrowserType;
import org.project.config.drivers.manager.web.local.ChromeManager;
import org.project.config.drivers.manager.web.local.EdgeManager;
import org.project.config.drivers.manager.web.local.FirefoxManager;

public class LocalDriverFactory {

    public static WebDriver getDriver(BrowserType browserType) {
        WebDriver driver = null;
        if (browserType.equals(BrowserType.CHROME)) {
            driver=ChromeManager.getDriver();
        }
        if (browserType.equals(BrowserType.FIREFOX)) {
            driver=FirefoxManager.getDriver();
        }
        if (browserType.equals(BrowserType.EDGE)) {
            driver=EdgeManager.getDriver();
        }
        return driver;
    }
}
