package com.hybris.internship;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AdditionServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        if (request.getParameter("number1") != null && request.getParameter("number2") != null) {
            Long num1 = Long.parseLong(request.getParameter("number1"));
            Long num2 = Long.parseLong(request.getParameter("number2"));

            final PrintWriter out = response.getWriter();
            out.println("Tee Result Is " + (num1 + num2));
        }
    }
}
