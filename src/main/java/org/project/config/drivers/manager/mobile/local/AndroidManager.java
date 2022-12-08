package org.project.config.drivers.manager.mobile.local;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.project.config.configfactory.ConfigFactory;


public final class AndroidManager {

    private AndroidManager() {
    }
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir"+"/android-app.apk"));
        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), capabilities);
    }
}
