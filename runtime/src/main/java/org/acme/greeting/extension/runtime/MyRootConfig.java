package org.acme.greeting.extension.runtime;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(prefix = "a", name = "b", phase = ConfigPhase.RUN_TIME)
public class MyRootConfig {
    /**
     *
     */
    @ConfigItem(name = "c")
    MyNestedConfig myNestedConfig;

    @ConfigGroup
    public static class MyNestedConfig {
        /**
         *
         */
        @ConfigItem(name = "d", defaultValue = "e")
        String foo;
    }
}
