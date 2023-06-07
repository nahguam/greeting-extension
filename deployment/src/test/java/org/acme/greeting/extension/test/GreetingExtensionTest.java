package org.acme.greeting.extension.test;

import org.acme.greeting.extension.runtime.ConfigGroupInjection;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.test.QuarkusUnitTest;
import jakarta.inject.Inject;

public class GreetingExtensionTest {
    // Start unit test with your extension loaded
    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class));

    @Inject
    ConfigGroupInjection bean;

    @Test
    public void writeYourOwnUnitTest() {
        Assertions.assertEquals("e", bean.name());
    }

}
