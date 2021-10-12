package com.it_finne.servlet_classroom.pac1

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet("/practice2_2/WeatherServlet")
class WeatherServlet: HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        val random: Double = Math.random()

        val weatherText: String = when {
            random < 0.5 -> "晴れです。"
            random < 0.8 -> "くもりですねぇ。"
            else -> "雨でしょう。"
        }

        response.writer.println("""
            <!DOCTYPE html>
            <html lang="ja">
            <head>
              <meta charset="UTF-8" />
              <title>お天気を予想します</title>
            </head>
            <body>
            <h1>お天気を予想します</h1>
            <p>天気は、${weatherText}</p>
            </body>
            </html>
        """.trimIndent())
    }
}