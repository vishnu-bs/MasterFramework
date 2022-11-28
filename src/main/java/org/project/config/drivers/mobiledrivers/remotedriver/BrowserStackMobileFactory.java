package org.project.config.drivers.mobiledrivers.remotedriver;

import org.openqa.selenium.WebDriver;
import org.project.config.drivers.manager.web.remote.browserstack.BrowserStackChromeManager;
import org.project.config.drivers.manager.web.remote.browserstack.BrowserStackEdgeManager;
import org.project.config.drivers.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import org.project.config.enums.BrowserType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackMobileFactory {

    private BrowserStackMobileFactory() {

    }
    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
    private static final Supplier<WebDriver> CHROME =BrowserStackChromeManager::geDriver;
    private static final Supplier<WebDriver> FIREFOX = BrowserStackFirefoxManager::geDriver;
    private static final Supplier<WebDriver> EDGE = BrowserStackEdgeManager::geDriver;
    static {
        MAP.put(BrowserType.CHROME,CHROME);
        MAP.put(BrowserType.FIREFOX,FIREFOX);
        MAP.put(BrowserType.EDGE,EDGE);
    }
    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }

}
