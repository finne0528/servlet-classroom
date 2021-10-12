package com.it_finne.servlet_classroom.chapter2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", value="/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter responseWriter = response.getWriter();

        responseWriter.println("""
        <!DOCTYPE html>
        <html>
        <head>
          <meta charset="UTF-8" />
          <title>Hello World!</title>
        </head>
        <body>
        <h1>Hello World!</h1>
        <p>日本語文字表示のテスト</p>
        <p>First Servlet</p>
        </body>
        </html>
        """);
    }
}
