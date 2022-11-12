package org.vish.config.converters;

import org.aeonbits.owner.Converter;
import org.vish.config.enums.BrowserType;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {

    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String,BrowserType> browserTypeMap = Map.of("CHROME", BrowserType.CHROME, "FIREFOX", BrowserType.FIREFOX,
                "EDGE", BrowserType.EDGE, "OPERA", BrowserType.OPERA);
        return browserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserType.CHROME);
    }
}
