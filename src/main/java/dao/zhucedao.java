package dao;

import user.info;

import java.sql.*;

public class zhucedao {


public zhucedao(String zhanghao,String mima)  {

    String url="jdbc:mysql://localhost:3306/faka";
    String uesrname ="root";
    String password="a123123123";
    String sql = " INSERT INTO `user` VALUES(?,?,?)";;
    try {
        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection con = null;
    try {
        con = DriverManager.getConnection(url,uesrname,password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,zhanghao);
        ps.setString(2,mima);
        ps.setString(3,"0");
        ps.execute();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }








}



}
