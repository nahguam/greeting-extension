package org.acme.greeting.extension.runtime;

import jakarta.inject.Inject;

public class ConfigGroupInjection {
    @Inject MyRootConfig.MyNestedConfig myNestedConfig;

    public String name() {
        return myNestedConfig.foo;
    }

}
