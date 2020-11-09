package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCutil {



    PreparedStatement ps = null;
    private static final String username = "root";
    private static final String url="jdbc:mysql://localhost:3306/faka";
    private static final String password= "a123123123";
    private static Connection con=null;

    static {


        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();



        }
        try {
            con= DriverManager.getConnection(url,username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }




    }











  public PreparedStatement CrateStatement (String sql){

      try {
          ps = con.prepareStatement(sql);
      } catch (SQLException throwables) {
          throwables.printStackTrace();
      }
            return  ps;
  }



  public void close (){


      try {
          ps.close();
      } catch (SQLException throwables) {
          throwables.printStackTrace();
      }
      try {
          con.close();
      } catch (SQLException throwables) {
          throwables.printStackTrace();
      }


  }


}
