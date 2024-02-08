package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/member/*")
public class EncodingFilter implements Filter {
    public EncodingFilter() {
    }


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;

        /* 설명. 우린 tomcat10 버전인데 tomcat10 버전은 기본 인코딩 설정이 UTF-8이라 안 해줘도 된다. */
        /* 설명. 요청이 POST 요청일 때는 UTF-8로 인코딩 설정을 사전 처리 해 주고 이후 필터나 서블릿으로 넘어갈 수 있다. */
        if ("POST".equals(httpServletRequest.getMethod())) {
            request.setCharacterEncoding("UTF-8");
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
