package com.hspedu.servlet.annotation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 赵好运
 * @version 1.0
 **/

/**
 * 解读：
 * 1.@WebServlet是一个注解
 * 2.urlPatterns：对应web.xml的url-pattern
 * 3.{"/ok1", "/ok2"} 可以给OkServlet配置多个url-pattern（即/ok1与/ok2都是其url）
 * 4.相当于这个注解就代替了web.xml
 * 5.注解方式和web.xml方式开发servlet的流程机制几乎是一样的（注解是扫描得到全路径，xml是提前写好）
 */
@WebServlet(urlPatterns = {"/ok1", "/ok2"},loadOnStartup = 1)
public class OkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ok doGet 注解");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ok doPost 注解");
    }
}
