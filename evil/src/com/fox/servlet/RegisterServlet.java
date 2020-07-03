package com.fox.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password1 = request.getParameter("password");
        String password2 = request.getParameter("confirm-password");
        String[] hobbies = request.getParameterValues("hobbies");
        String sex = request.getParameter("sex");
        String info = request.getParameter("info");
        if(password1.equals(password2)){
            HttpSession session = request.getSession();
            session.setAttribute("s_username",username);
            session.setAttribute("s_password1",password1);
            session.setAttribute("s_password2",password2);
            session.setAttribute("s_hobbies", Arrays.toString(hobbies));
            session.setAttribute("s_sex",sex);
            session.setAttribute("s_info",info);
            response.sendRedirect("Login.jsp");
        }
        else{
            HttpSession session = request.getSession();
            session.setAttribute("wrongPassword","yes");
            response.sendRedirect("Register.jsp");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
