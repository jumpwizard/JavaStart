package com.hspedu.servlet;

/**
 * @author 赵好运
 * @version 1.0
 **/

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

/**
 * 开发一个servlet必须实现servlet接口
 * */
public class HelloServlet implements Servlet {
    /**
     * 初始化Servlet
     * 当创建HelloServlet实例时，会调用该方法
     * 该方法只会被调用一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init被调用");
    }

    /**
     * 返回ServletConfig，也就是返回Servlet配置
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 1.service处理浏览器的请求（包括get/post）
     * 2.每当浏览器请求servlet时，就会调用该方法
     * 3.当tomcat调用该方法时，会把http请求的数据封装成实现了ServletRequest接口的request对象
     * 4.通过ServletRequest对象，可以得到用户提交的数据
     * 5.ServletResponse对象可以用于返回数据给tomcat->浏览器
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service被调用");
        //思考：从servletRequest对象来获取请求方式
        //1.servletRequest没有得到提交方式的方法
        //2.servletRequest看看servletRequest子接口有没有相关方法
        //3.ctrl + alt + b 可看到接口的子接口和实现子类
        //4.把servletRequest转成HttpServletRequest引用
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if(method.equals("GET")){
            doGet();//用doGet处理get请求
        } else if(method.equals("POST")) {
            doPost();
        }
    }

    /**
     * 用于响应get请求
     */
    public void doGet() {
        System.out.println("doGet被调用");
    }

    /**
     * 用于响应post请求
     */
    public void doPost() {
        System.out.println("doPost被调用");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy被执行");
    }
}
