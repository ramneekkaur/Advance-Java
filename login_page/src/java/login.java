

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class login {

    public static boolean validate(String n, String p) {
      boolean status=false;
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/login","root","root");
                 PreparedStatement ps=con.prepareStatement("select * from logininfo where name=? and password=?");
                 ps.setString(1,n);
                 ps.setString(2,p);
                 ResultSet rs=ps.executeQuery();
                 status=rs.next();
          }
          
         catch(Exception e)
                 {
                 System.out.println(e);
                 
                 }
         
return status;
                 
      } 
    
    }
    

