package org.project.config.drivers.manager.web.remote.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.project.config.configfactory.ConfigFactory;

public final class SeleniumGridEdgeManager {

    private SeleniumGridEdgeManager() {

    }

    public static WebDriver geDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(String.valueOf(Browser.EDGE));
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), desiredCapabilities);
    }
}
