<%-- 
    Document   : index
    Created on : 10 Mar, 2019, 1:12:56 PM
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

    </body>
</html>
<%
        int s=Integer.parseInt(request.getParameter("number"));
        int p;
        p=s/10;
        
        switch(p)
        {
            case 1:
        }
%>
        <input type="text" value="<%="="+p%>"> 
        