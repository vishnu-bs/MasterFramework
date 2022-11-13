package org.project.config.converters;

import org.aeonbits.owner.Converter;
import org.project.config.enums.RemoteTools;
import org.project.config.enums.RunModes;

import java.lang.reflect.Method;

public class RemoteToolsTypeConverter implements Converter<RemoteTools> {

    @Override
    public RemoteTools convert(Method method, String runMode) {
        return RemoteTools.valueOf(runMode.toUpperCase());
    }
}
