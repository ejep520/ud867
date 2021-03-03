package com.jepster.a409demo_androidunittestingremake.testing;

import com.jepster.a409demo_androidunittestingremake.Echo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class EchoTest {
    @Test
    public void verifyEchoResponse() {
        assert Echo.echo("hello").equals("hello");
    }
}
