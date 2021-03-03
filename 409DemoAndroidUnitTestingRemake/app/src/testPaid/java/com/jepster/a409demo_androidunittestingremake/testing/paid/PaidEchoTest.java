package com.jepster.a409demo_androidunittestingremake.testing.paid;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Collection;

@RunWith(JUnit4.class)
public class PaidEchoTest {

    @Test
    public void verifyEchoResponse() {
        Collection<String> strings = PaidEcho.echo("hello", 10);
        Assert.assertEquals(strings.size(), 10);
        for (String string : strings) {
            Assert.assertEquals(string, "hello");
        }
    }
}
