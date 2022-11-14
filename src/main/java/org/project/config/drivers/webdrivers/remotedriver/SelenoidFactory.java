package org.project.config.drivers.webdrivers.remotedriver;

import org.openqa.selenium.WebDriver;
import org.project.config.drivers.manager.web.remote.selenium.SeleniumGridChromeManager;
import org.project.config.drivers.manager.web.remote.selenium.SeleniumGridEdgeManager;
import org.project.config.drivers.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import org.project.config.drivers.manager.web.remote.selenoid.SelenoidChromeManager;
import org.project.config.drivers.manager.web.remote.selenoid.SelenoidEdgeManager;
import org.project.config.drivers.manager.web.remote.selenoid.SelenoidFirefoxManager;
import org.project.config.enums.BrowserType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SelenoidFactory {

    private SelenoidFactory() {

    }
    private static final Map<BrowserType, Supplier<WebDriver>> MAP=new EnumMap<BrowserType, Supplier<WebDriver>>(BrowserType.class);
    private static final Supplier<WebDriver> CHROME= SelenoidChromeManager::geDriver;
    private static final Supplier<WebDriver> FIREFOX= SelenoidFirefoxManager::geDriver;
    private static final Supplier<WebDriver> EDGE= SelenoidEdgeManager::geDriver;
    static {
        MAP.put(BrowserType.CHROME,CHROME);
        MAP.put(BrowserType.FIREFOX,FIREFOX);
        MAP.put(BrowserType.EDGE,EDGE);
    }
    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }
}
