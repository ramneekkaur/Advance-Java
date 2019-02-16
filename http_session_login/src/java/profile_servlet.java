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
public class profile_servlet extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       
       request.getRequestDispatcher("link_html.html").include(request, response);
       HttpSession session=request.getSession(false);

                                   String n=(String)session.getAttribute("uname");
                                  
                if(n!=null)
                {
               if(!n.equals("")||n!=null)
               {
                   out.print("<b>Welcome to profile</b>");
                   out.print("<br>Welcome:"+n);
                   
               }}
                    
                
                else{
                    out.print("Please login first");
                           request.getRequestDispatcher("login_html.html").include(request, response);

                
                }    
              out.close();

    }

    
    }
