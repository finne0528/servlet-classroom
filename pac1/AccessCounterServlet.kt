package com.it_finne.servlet_classroom.pac1

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet("/practice2_3/AccessCounterServlet")
class AccessCounterServlet(private var counter: Int = 1): HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        response.writer.println("""
            <!DOCTYPE html>
            <html lang="ja">
            <head>
              <meta charset="UTF-8">
              <title>アクセスカウンタ</title>
            </head>
            <body>
            <h1>アクセスカウンタ</h1>
            <p>あなたは、${this.counter++}人目の訪問者です</p>
            </body>
            </html>
        """.trimIndent())
    }
}