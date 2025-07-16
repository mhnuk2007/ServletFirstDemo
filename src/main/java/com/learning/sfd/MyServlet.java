package com.learning.sfd;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the content type
        response.setContentType("text/html");

        // Send response to browser
        PrintWriter out = response.getWriter();
        out.println("<h1>In doGet() method for browser</h1>");
        out.close();

        // Log to console
        System.out.println("In doGet() method");
    }
}
