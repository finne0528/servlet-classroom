package com.it_finne.servlet_classroom.pac1

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import kotlin.random.Random

@WebServlet("/practice2_4/HitNumberServlet")
class HitNumberServlet(
    private var counter: Int = 1,
    private var answer: Int = Random.Default.nextInt(10)
): HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        val number: Int = request.getParameter("number").toInt()

        response.writer.println("""
            <!DOCTYPE html>
            <html lang="ja">
            <head>
              <meta charset="UTF-8" />
              <title>数当てゲーム結果</title>
            </head>
            <body>
            <h1>数当てゲーム結果</h1>
            <p>${this.counter}回目 あなたが選んだ数: ${number}</p>
            <p>${this.counter}回目 コンピュータが選んだ数: ${this.answer}</p>
            <p>結果は、${if (number == this.answer) "当たり" else "はずれ〜！"}</p>
            <a href="/Gradle___com_it_finne___servlet_classroom_1_0_SNAPSHOT_war/practice2_4/hitnumber.html">もう一度やる</a>
            </body>
            </html>
        """.trimIndent().also { this.counter++ })
    }
}