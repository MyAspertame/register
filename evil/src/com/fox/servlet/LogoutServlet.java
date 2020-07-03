package com.fox.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        session.removeAttribute("s_username");
        session.removeAttribute("s_password1");
        session.removeAttribute("s_hobbies");
        session.removeAttribute("s_sex");
        session.removeAttribute("s_info");
        if(session.getAttribute("s_username")==null){
            response.sendRedirect("LoginHasFailed.jsp");
        }
    }
}
