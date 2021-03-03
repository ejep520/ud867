package com.jepster.a409demo_androidunittestingremake.testing;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.jepster.a409demo_androidunittestingremake.Echo;
import com.jepster.a409demo_androidunittestingremake.testing.paid.PaidEcho;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collection;

@RunWith(AndroidJUnit4.class)
public class PaidEchoAndroidTest {

    @Test
    public void testVerifyEchoResponse() {
        Assert.assertEquals("hello", Echo.echo("hello"));
    }

    @Test
    public void testVerifyLoggingEchoResponse() {
        Collection<String> strings = PaidEcho.echo("hello", 10, true);
        Assert.assertEquals(strings.size(), 10);
        for (String string : strings) {
            Assert.assertEquals(string, "hello");
        }
        Assert.assertEquals("hello", Echo.echo("hello", true));
    }
}
