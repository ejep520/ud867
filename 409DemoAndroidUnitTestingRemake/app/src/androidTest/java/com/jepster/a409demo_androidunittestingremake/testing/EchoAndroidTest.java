package com.jepster.a409demo_androidunittestingremake.testing;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.jepster.a409demo_androidunittestingremake.Echo;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class EchoAndroidTest {

    @Test
    public void testVerifyEchoResponse() {
        assertEquals("hello", Echo.echo("hello"));
    }

    @Test
    public void testVerifyLoggingEchoResponse() {
        assertEquals("hello", Echo.echo("hello", true));
    }
}
