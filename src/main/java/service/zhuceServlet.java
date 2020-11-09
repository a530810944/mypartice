package service;

import dao.zhucedao;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class zhuceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String zhanghao = request.getParameter("zhanghao");
        String mima = request.getParameter("mima");

        zhucedao zhucedao = new zhucedao(zhanghao,mima);
    //    response.setContentType("text/html;charset=UTF-8");
      //  PrintWriter pw = response.getWriter();
        //pw.print("<center><h1>恭喜您注册成功！<h1><center>");
        response.sendRedirect("registersuccess.html");

    }
}
