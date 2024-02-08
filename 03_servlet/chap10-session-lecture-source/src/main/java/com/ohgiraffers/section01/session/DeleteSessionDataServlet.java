package com.ohgiraffers.section01.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        System.out.println("attribute 만료 전 firstName: " + session.getAttribute("firstName"));
        System.out.println("attribute 만료 전 lastName: " + session.getAttribute("lastName"));

        session.invalidate();               // HttpSession rorcpdml Attribute 값들을 무효화
        System.out.println("attribute 만료 후 firstName: " + session.getAttribute("firstName"));
        System.out.println("attribute 만료 후 firstName: " + session.getAttribute("firstName"));

        /* 설명. session이 무효화 되어 attribute를 가져 올 수 없게 되고 500에러 발생 */
    }
}
