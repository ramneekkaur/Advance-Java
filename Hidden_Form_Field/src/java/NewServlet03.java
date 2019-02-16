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
public class NewServlet03 extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            response.setContentType("text/html");
                                   PrintWriter out=response.getWriter();

            String n=request.getParameter("UserName");
   out.print("Welcome"+n);
   out.printf("<form action='NewServlet04'>");
   out.print("<input type='hidden' name='uname' value='"+n+"'>");
   out.print("<input type='submit' value='Go'>");
   out.print("</form>");
   
         out.close(); 
        }
        catch(Exception e)
        {
            System.out.println(e);}
        }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
