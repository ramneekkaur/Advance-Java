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
public class NewServlet01 extends HttpServlet {

    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{      
                    response.setContentType("text/html");

            String n=request.getParameter("UserName");
                                   PrintWriter out=response.getWriter();

              HttpSession session=request.getSession();
              
              session.setAttribute("uname",n);
              out.printf("Welcome"+n);
              out.print("<a href='NewServlet02' uname='+n'>visit</a>");
              
              

    }catch(Exception e)
        {
            System.out.println(e);}
        }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
