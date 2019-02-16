/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class loginservlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
                PrintWriter out=response.getWriter();
                
                        String n=(request.getParameter("name"));
                        String p=(request.getParameter("password"));
                         
                    if(login.validate(n,p))
                            {
                                RequestDispatcher rd=request.getRequestDispatcher("loginservlet1");
                                rd.forward(request,response);
                                
                                
                            }
else
                    {
                        out.print("Sorry Wrong UserName or Password");
                        RequestDispatcher rd=request.getRequestDispatcher("/index.html");
                        rd.include(request,response);
                        
                        
                    }


    }
   
    
}
