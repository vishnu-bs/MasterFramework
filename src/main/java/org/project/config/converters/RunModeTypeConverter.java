package org.project.config.converters;

import org.aeonbits.owner.Converter;
import org.project.config.enums.RunModes;

import java.lang.reflect.Method;

public class RunModeTypeConverter implements Converter<RunModes> {

    @Override
    public RunModes convert(Method method, String runMode) {
        return RunModes.valueOf(runMode.toUpperCase());
    }
}
