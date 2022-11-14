package org.project.config.drivers.webdrivers.localdriver;

import org.openqa.selenium.WebDriver;
import org.project.config.enums.BrowserType;
import org.project.config.drivers.manager.web.local.ChromeManager;
import org.project.config.drivers.manager.web.local.EdgeManager;
import org.project.config.drivers.manager.web.local.FirefoxManager;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class LocalDriverFactory {
    private LocalDriverFactory() {

    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
    private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = FirefoxManager::getDriver;
    private static final Supplier<WebDriver> EDGE = EdgeManager::getDriver;
    static {
        MAP.put(BrowserType.CHROME,CHROME);
        MAP.put(BrowserType.FIREFOX,FIREFOX);
        MAP.put(BrowserType.EDGE,EDGE);
    }
    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }

}

