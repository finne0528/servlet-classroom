package com.it_finne.servlet_classroom.pac1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/practice2_1/Kuku")
public class KukuServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("""
        <!DOCTYPE html>
        <html lang="ja">
        <head>
          <meta charset="UTF-8" />
          <title>九九の表</title>
        </head>
        <body>
        <h3>九九の表</h3>
        <div>
          %s
        </div>
        </body>
        </html>
        """.formatted(createKukuTable()));
    }

    private String createKukuTable() {
        StringBuilder tableContent = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            tableContent.append(createTableRecord(i));
        }

        return """
        <table border="3">
          %s
          %s
        </table>
        """.formatted(createTableHeaderRecord(), tableContent.toString());
    }

    private String createTableHeaderRecord() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            builder.append("<th>%s</th>".formatted(i));
        }
        return """
        <tr>
          <th></th>
          %s
        </tr>
        """.formatted(builder.toString());
    }

    private String createTableRecord(int number) {
        StringBuilder builder = new StringBuilder("<tr><th>%s</th>".formatted(number));

        for (int i = 1; i < 10; i++) {
            builder.append("<td>%s</td>".formatted(number * i));
        }
        return builder.append("</tr>").toString();
    }
}
