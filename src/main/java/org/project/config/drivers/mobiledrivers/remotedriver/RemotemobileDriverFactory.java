package org.project.config.drivers.mobiledrivers.remotedriver;

import org.openqa.selenium.WebDriver;
import org.project.config.drivers.webdrivers.remotedriver.BrowserStackFactory;
import org.project.config.drivers.webdrivers.remotedriver.SeleniumGridDriverFactory;
import org.project.config.drivers.webdrivers.remotedriver.SelenoidFactory;
import org.project.config.enums.BrowserType;
import org.project.config.enums.MobilePlatformType;
import org.project.config.enums.MobileRemoteRunMode;
import org.project.config.enums.RemoteTools;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemotemobileDriverFactory {

    private RemotemobileDriverFactory() {
    }
//
//    private static final Map<MobileRemoteRunMode,Function<MobilePlatformType,WebDriver>> MAP=new EnumMap<>(MobileRemoteRunMode.class);
//    private static final Function<MobilePlatformType,WebDriver> BROWSERSTACK= SeleniumGridDriverFactory::getDriver;
//    private static final Function<MobilePlatformType,WebDriver> SAUCELAB= SelenoidFactory::getDriver;
//    static {
//        MAP.put(MobileRemoteRunMode.BROWSER_STACK,BROWSERSTACK);
//        MAP.put(MobileRemoteRunMode.SAUCE_LAB,SAUCELAB);
//    }
//    public static WebDriver getDriver(MobileRemoteRunMode mobileRemoteRunMode, MobilePlatformType mobilePlatformType) {
//        return MAP.get(mobileRemoteRunMode).apply(mobilePlatformType);
//    }
}
