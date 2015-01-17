package com.i2shar.exchange.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Tushar on 1/16/15.
 */
@Path("/test")
public class TestController {

    @GET @Produces({MediaType.TEXT_PLAIN})
    @Path("/{message}")
    public String greeting(@PathParam("message") String message) {
        return "Hello " + message;
    }

}
