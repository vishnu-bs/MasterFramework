package org.project.config.drivers.webdrivers.remotedriver;

import org.openqa.selenium.WebDriver;
import org.project.config.enums.BrowserType;
import org.project.config.enums.RemoteTools;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    private static final Map<RemoteTools,Function<BrowserType,WebDriver>> MAP=new EnumMap<RemoteTools, Function<BrowserType, WebDriver>>(RemoteTools.class);
    private static final Function<BrowserType,WebDriver> SELENIUM= SeleniumGridDriverFactory::getDriver;
    private static final Function<BrowserType,WebDriver> SELENOID= SelenoidFactory::getDriver;
    private static final Function<BrowserType,WebDriver> BROWSER_STACK= BrowserStackFactory::getDriver;
    static {
        MAP.put(RemoteTools.SELENIUM,SELENIUM);
        MAP.put(RemoteTools.SELENOID,SELENOID);
        MAP.put(RemoteTools.BROWSER_STACK,BROWSER_STACK);
    }
    public static WebDriver getDriver(RemoteTools remoteTools,BrowserType browserType) {
        return MAP.get(remoteTools).apply(browserType);
    }
}
