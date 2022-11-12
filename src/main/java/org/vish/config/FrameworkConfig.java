package org.vish.config;

import org.aeonbits.owner.Config;
import org.vish.config.converters.StringToBrowserTypeConverter;
import org.vish.config.enums.BrowserType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/main/resources/config.properties"})

public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
