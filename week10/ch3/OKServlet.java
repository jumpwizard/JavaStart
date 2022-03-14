package com.hspedu.servlet; /**
 * @author 赵好运
 * @version 1.0
 **/

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class OKServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ok doGet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ok doPost");
    }
}
