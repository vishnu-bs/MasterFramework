package org.vish.config.converters;

import org.aeonbits.owner.ConfigCache;
import org.vish.config.FrameworkConfig;

public final class ConfigFactory {

    private ConfigFactory() {}

    // Is used to send the config value directly to the main test class instead of calling the full method.
    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
