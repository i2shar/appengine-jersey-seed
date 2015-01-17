package com.i2shar.exchange;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Tushar on 1/16/15.
 */
public class App extends ResourceConfig {

    public App() {
        super();
        packages("com.i2shar.exchange");
    }
}
