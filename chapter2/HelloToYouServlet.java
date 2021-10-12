package com.it_finne.servlet_classroom.chapter2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloToYouServlet")
public class HelloToYouServlet extends HttpServlet  {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String yourName = request.getParameter("your");
        String myName = request.getParameter("my");

        PrintWriter responseWriter = response.getWriter();
        responseWriter.println("""
        <!DOCTYPE html>
        <html>
        <head>
          <title>Hello To You!</title>
        </head>
        <body>
        <h1>Hello To You!</h1>
        <div>
          <p>初めてのサーブレット</p>
          <p>こんにちは、%sさん</p>
          <p>私は、%sです</p>
        </div>
        </body>
        </html>
        """.formatted(yourName, myName));
    }
}
