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
public class TriangleServlet4 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        int a=Integer.parseInt(request.getParameter("val1"));
         int b=Integer.parseInt(request.getParameter("val2"));
        int c=Integer.parseInt(request.getParameter("val3"));
        if(((a+b>c)||(b+c>a)||(c+a>b))&&(a!=0)&&(b!=0)&&(c!=0))
        {
            out.println("Triangle is valid...\n");
            
            if((a==b)&&(b==c)&&(c==a))
            {
                out.println("Equilateral Triangle");
                
            }
            else if((a==b)||(b==c)||(c==a))
            {
                out.println("Isoscles Triangle");
            }
            else out.println("Skelen Triangle");
        }
        else out.println("Triangle is not valid");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
}
