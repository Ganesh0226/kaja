package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a Jetty server on port 8080
        Server server = new Server(8080);
        
        // Set up a servlet handler to map the SimpleServlet
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        
        handler.addServletWithMapping(SimpleServlet.class, "/");

        // Start the server
        server.start();
        System.out.println("Server started on http://localhost:8080");
        server.join();
    }
}

