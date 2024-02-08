package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

/* 설명.
 *  WebFilter 어노테이션에 url 경로를 넣어 해당 요청 시 filter가 동작하게 한다.
 *  '/*'은 모든 요청 경로를 뜻한다.
* */
@WebFilter("/first/*")
public class FirstFilter implements Filter {

    public FirstFilter() {

        System.out.println("FirstFilter 인스턴스 생성!");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter init 호출!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FirstFilter doFilter 호출!");

        /* 설명. 다음 필터 또는 서블릿으로 가기 전에 전처리를 위한 코드를 여기에 작성 */

        /* 설명. FilterChain에서 제공하는 doFilter를 활용하여 다음 필터 또는 서블릿으로 진행시킬 수 있다. */
        chain.doFilter(request, response);

        /* 설명. 서블릿에서 클라이언트로 가기 전에 후처리를 위한 코드를 여기에 작성ㅔ */

        System.out.println("서블릿 다녀온 후");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter destroy 호출!");
    }
}