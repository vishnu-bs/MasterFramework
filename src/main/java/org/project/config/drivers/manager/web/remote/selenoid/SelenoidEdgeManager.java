package org.project.config.drivers.manager.web.remote.selenoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.project.config.configfactory.ConfigFactory;

public final class SelenoidEdgeManager {

    private SelenoidEdgeManager() {

    }

    public static WebDriver geDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName","edge");
        capabilities.setCapability("browserVersion","latest");
        capabilities.setCapability("enableVNC",true);
        capabilities.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidGridURL(), capabilities);
    }
}
