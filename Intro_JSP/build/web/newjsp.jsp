<%-- 
    Document   : newjsp
    Created on : 10 Feb, 2019, 12:43:11 PM
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
        <h1>User</h1>
        <%
        String s=request.getParameter("uname");
        out.println("Welcome "+s);
        
       %> 
    </body>
</html>
