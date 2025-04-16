package com.example.servlet1;


import java.io.*;
import java.time.LocalDateTime;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message;
    @Override
    public void init() {
        message = "Hello Servlet!!!!!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        LocalDateTime now = LocalDateTime.now();

        // Hello
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"ko\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>타이틀</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>서블릿 문서</h1>");
        out.println("<h1>학번 : 20241490 , 이름 : 김기혁 </h1>");
        out.println("<p> 현재시간: " + now + "</p>");
        out.println("</body>");
        out.println("</html>");


    }

    public void destroy() {
    }
}