package com.controllers;

import com.dao.AddDao;
import com.models.ShowUserModel;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("modals/addModal.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String sex = request.getParameter("sex");
        String birthday = request.getParameter("birthday");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        ShowUserModel showUserModel = new ShowUserModel(username, phone, address, sex, birthday, email, password);
        AddDao addDao = new AddDao();
        addDao.AddUser(showUserModel);
        response.sendRedirect("welcome");
    }
}
