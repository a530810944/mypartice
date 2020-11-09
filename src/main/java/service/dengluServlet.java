package service;

import dao.userludao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class dengluServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw= response.getWriter();
        String username= request.getParameter("username");
        String password = request.getParameter("password");
        userludao d = new userludao();
        Map map = d.select(username,password);
        String money;
        if (map!=null)
        {  money= (String) map.get("money");
         response.sendRedirect("buy.html?username="+username+"&money="+money);
        }
        else {

            pw.print("<center><h1>登录失败傻逼！</h1></center>");
        }

    }
}
