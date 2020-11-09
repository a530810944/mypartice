package dao;

import user.info;

import java.sql.*;

public class dengluyanzheng {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url="jdbc:mysql://localhost:3306/faka";
        String uesrname ="root";
        String password="a123123123";
        String sql = " SELECT * FROM`user` WHERE USER = ?";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uesrname,password);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,"a123");
        ResultSet rs= ps.executeQuery();
        info in = new info();
        while (rs.next()){

        in.setUser(rs.getNString("user"));
        in.setMoney(rs.getNString("money"));
            System.out.println("您的用户名是:"+in.getUser()+"金额为:"+in.getMoney());



        }






  }


}
