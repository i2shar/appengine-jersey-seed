package com.i2shar.exchange.controller;

import com.i2shar.exchange.service.MessageService;

import javax.inject.Inject;
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

    @Inject
    private MessageService messageService;


    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("/{message}")
    public String greeting(@PathParam("message") String message) {
        return messageService.getGreeting(message);
    }

}
