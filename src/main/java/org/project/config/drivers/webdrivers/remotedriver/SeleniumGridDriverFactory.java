package org.project.config.drivers.webdrivers.remotedriver;

import org.openqa.selenium.WebDriver;
import org.project.config.drivers.manager.web.local.EdgeManager;
import org.project.config.drivers.manager.web.remote.selenium.SeleniumGridChromeManager;
import org.project.config.drivers.manager.web.remote.selenium.SeleniumGridEdgeManager;
import org.project.config.drivers.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import org.project.config.enums.BrowserType;
import org.project.config.drivers.manager.web.local.ChromeManager;
import org.project.config.drivers.manager.web.local.FirefoxManager;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class SeleniumGridDriverFactory {

    private SeleniumGridDriverFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP=new EnumMap<BrowserType, Supplier<WebDriver>>(BrowserType.class);
    private static final Supplier<WebDriver> CHROME= SeleniumGridChromeManager::geDriver;
    private static final Supplier<WebDriver> FIREFOX= SeleniumGridFirefoxManager::geDriver;
    private static final Supplier<WebDriver> EDGE= SeleniumGridEdgeManager::geDriver;
    static {
        MAP.put(BrowserType.CHROME,CHROME);
        MAP.put(BrowserType.FIREFOX,FIREFOX);
        MAP.put(BrowserType.EDGE,EDGE);
    }
    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }
 }
