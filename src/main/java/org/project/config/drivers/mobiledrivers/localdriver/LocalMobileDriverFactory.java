package org.project.config.drivers.mobiledrivers.localdriver;

import org.openqa.selenium.WebDriver;
import org.project.config.drivers.manager.mobile.local.AndroidManager;
import org.project.config.drivers.manager.mobile.local.iOSManager;
import org.project.config.enums.MobilePlatformType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class LocalMobileDriverFactory {
    private LocalMobileDriverFactory() {

    }

    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);
    private static final Supplier<WebDriver> ANDROID = AndroidManager::getDriver;
    private static final Supplier<WebDriver> IOS = iOSManager::getDriver;
    static {
        MAP.put(MobilePlatformType.ANDROID,ANDROID);
        MAP.put(MobilePlatformType.IOS,IOS);
    }
    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
    }

}

