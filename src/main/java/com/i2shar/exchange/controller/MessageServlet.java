package com.i2shar.exchange.controller;

import com.i2shar.exchange.service.MessageService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Tushar on 1/17/15.
 */
//@WebServlet(name = "MessageServlet", urlPatterns = "/rest/test/world")
public class MessageServlet extends HttpServlet {

    @Inject
    private MessageService messageService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(messageService.getGreeting("jello"));
    }
}
