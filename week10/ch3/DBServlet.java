package com.hspedu.servlet; /**
 * @author 赵好运
 * @version 1.0
 **/

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class DBServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        String username = servletConfig.getInitParameter("username");
        String pwd = servletConfig.getInitParameter("pwd");
        System.out.println(username);
        System.out.println(pwd);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
