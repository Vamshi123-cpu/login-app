package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Dummy credentials for demo purposes
        if ("user".equals(username) && "password123".equals(password)) {
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("login.jsp?error=invalid");
        }
    }
}

