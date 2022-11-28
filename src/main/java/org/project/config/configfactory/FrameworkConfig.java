package org.project.config.configfactory;

import org.aeonbits.owner.Config;
import org.project.config.converters.BrowserTypeConverter;
import org.project.config.converters.StringToURLConverter;
import org.project.config.enums.BrowserType;
import org.project.config.enums.RemoteTools;
import org.project.config.enums.RunModes;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/main/resources/config.properties"})

public interface FrameworkConfig extends Config {

    @DefaultValue("chrome")
    @ConverterClass(BrowserTypeConverter.class)
    BrowserType browser();
    @Key("runMode")
    RunModes runMode();
    @Key("remoteToolType")
    RemoteTools browserRemoteToolType();
    @Key("mobileRunMode")
    RunModes mobileRunMode();
    @Key("mobileRemoteMode")
    BrowserType mobileRemoteMode();
    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();
    @ConverterClass(StringToURLConverter.class)
    URL selenoidGridURL();
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();
    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4425/wd/hub")
    URL localAppiumServerURL();
}
