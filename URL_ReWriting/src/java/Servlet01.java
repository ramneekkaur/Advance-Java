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

/**
 *
 * @author dell
 */
public class Servlet01 extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            
        
          response.setContentType("text/html");
                                   PrintWriter out=response.getWriter();

            String n=request.getParameter("UserName");
   out.print("Welcome"+n);
              out.print("<a href='Servlet02?uname="+n+"'>visit</a>");
              out.close();
        }catch(Exception e)
        {
            System.out.println(e);}
        }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
}
