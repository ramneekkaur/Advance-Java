/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
public class login_servlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       
       request.getRequestDispatcher("link_html.html").include(request, response);
       
       String name=request.getParameter("name");
       String password=request.getParameter("password");
       
       if(password.equals("123")){
           out.print("You are successfully logged in");
           out.print("Welcome"+name);
           
           HttpSession session=request.getSession();
              
              session.setAttribute("uname",name);
              
                         out.print("<a href='login_servlet2?uname="+name+"'>visit</a>");

       }
       else
       {
           out.print("Password is incorect");
           request.getRequestDispatcher("login_html.html").include(request, response);
       
       }
       
       out.close();
          
    }

    
}
