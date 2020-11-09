package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class userludao {

            PreparedStatement ps =null;
            JDBCutil util=null;

            public userludao(){

                util = new JDBCutil();

            }

    public Map select(String username, String password)  {
        Map<String,String> map = new HashMap<String, String>();
        String  sql  =" SELECT * FROM `user` WHERE  user=? AND password=?";

        ps = util.CrateStatement(sql);


        try {
            ps.setString(2,password);
            ps.setString(1,username);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        ResultSet rs = null;
        try {
            rs = ps.executeQuery();

            while (rs.next())

            {


              map.put("username","username");
              map.put("money",rs.getNString("money"));




            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }











        return map;
    }





public void koukuan (String money,String user)
{

    String sql = "UPDATE `user` SET money=money-? WHERE user=?;";
    ps=util.CrateStatement(sql);
    try {
        ps.setString(1,money);
        ps.setString(2,user);
        ps.execute();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }


}

}
