package com.servlet;

import com.filter.userDao;
import com.filter.userDaolmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        userDao ud = new userDaolmpl();
        if (name.length()>0&&pwd.length()>0){
            if (ud.login(name,pwd)){
                request.setAttribute("welcome","欢迎用户"+name);
                request.getRequestDispatcher("/home.jsp").forward(request,response);
            }else {
                response.sendRedirect("index.jsp");
            }
        }
        else {
            request.setAttribute("strMsg","用户名和密码不能为空!"+name);
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);  //将信息使用doPost方法执行   对应jsp页面中的form表单中的method
    }
}
