package com.jepster.a409demo_androidunittestingremake.testing.paid;

import android.util.Log;

import com.jepster.a409demo_androidunittestingremake.Echo;

import java.util.ArrayList;
import java.util.Collection;

public class PaidEcho extends Echo {
	
    public static <T> Collection<T> echo(T o, int count, boolean log) {
		
        if (log) Log.i(Echo.class.getName(), o.toString());
        
		Collection<T> collection = new ArrayList<>();
        for (int counter = 0; counter < count; counter++) {
            collection.add(o);
        }
        
		return collection;
    }

    public static <T> Collection<T> echo(T o, int count) {
        return echo(o, count, false);
    }
}
