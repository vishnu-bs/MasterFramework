package org.project.config.drivers.manager.web.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.project.config.converters.ConfigFactory;

public final class BrowserStackFirefoxManager {

    private BrowserStackFirefoxManager() {

    }

    public static WebDriver geDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName","edge");
        capabilities.setCapability("browser_version","latest");
        capabilities.setCapability("os","windows");
        capabilities.setCapability("os_version","10");
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidGridURL(), capabilities);
    }
}
