package org.project.config.converters;

import org.aeonbits.owner.Converter;
import org.project.config.enums.BrowserType;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public final class StringToURLConverter implements Converter<URL> {

    private StringToURLConverter(){}

    @Override
    public URL convert(Method method, String StringURL) {
        try {
            return new URL(StringURL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
