package com.controllers;

import com.dao.UserDao;
import com.models.UserModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();
        UserModel userModel = new UserModel(username, password);
        if (userDao.checkUser(userModel).equals("success")) {
            response.sendRedirect("welcome.jsp");
        }else {
            response.sendRedirect("login.jsp");
        }
    }
}
