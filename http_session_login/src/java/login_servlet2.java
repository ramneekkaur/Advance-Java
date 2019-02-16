/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dell
 */
public class login_servlet2 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{             
        response.setContentType("text/html");
                     PrintWriter out=response.getWriter();
                               request.getRequestDispatcher("link_html.html").include(request, response);
          
                     HttpSession session=request.getSession(false);

                                   String n=(String)session.getAttribute("uname");
                                    out.printf("Hello "+n); 



        

    }

    catch(Exception e)
        {
            System.out.println(e);}
        }
    }

    

