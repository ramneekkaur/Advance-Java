<%-- 
    Document   : newjsp3
    Created on : 16 Feb, 2019, 12:11:11 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        int s=Integer.parseInt(request.getParameter("number"));
        int i,p=1;
        for(i=1;i<=s;i++)
        {
            p=p*i;
        }%>
        <input type="text" value="<%="Factorial="+p%>"> 
        
        
        
                
        
       
    </body>
</html>
