package org.project.config.drivers.webdrivers.remotedriver;

import org.openqa.selenium.WebDriver;
import org.project.config.drivers.manager.web.remote.browserstack.BrowserStackChromeManager;
import org.project.config.enums.BrowserType;

public final class BrowserStackFactory {

    private BrowserStackFactory() {

    }
    public static WebDriver getDriver(BrowserType browserType){
        WebDriver driver = null;
        if (browserType.equals(BrowserType.CHROME)) {
            driver = BrowserStackChromeManager.geDriver();
        }
      /*  if (browserType.equals(BrowserType.FIREFOX)) {
            driver = SelenoidFirefoxManager.geDriver();
        }
        if (browserType.equals(BrowserType.EDGE)) {
            driver = SelenoidEdgeManager.geDriver();
        }*/

        return driver;
    }
}
