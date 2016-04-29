/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharmila.persistProject.controller;

import com.CMS.helper.Email;
import com.sharmila.persistProject.dao.ContactDao;
import com.sharmila.persistProject.dao.impl.ContactDaoImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sharmila
 */
@WebServlet(name = "defaultController", urlPatterns ={"/","/admin/*","/email"})
public class DefaultController extends Controller {

    private ContactDao ContactDao = new ContactDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Email email = new Email();
        email.setHost("smtp.ntc.com.np");
        email.setFrom(request.getParameter("email"));
        email.setSubject(request.getParameter("subject"));
        email.setBody(request.getParameter("message"));
        email.sendEmail();
        response.getWriter().println("<h1> Thank you! </h1>");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = "/WEB-INF/views/index.jsp";
        if (request.getRequestURI().contains("/admin")) {
            page = "/WEB-INF/views/admin.jsp";
        }
        if (request.getRequestURI().contains("/email")) {
            page = "/WEB-INF/views/sendEmail.jsp";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }

}
