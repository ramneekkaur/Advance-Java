<%-- 
    Document   : newjsp1
    Created on : 10 Feb, 2019, 1:06:52 PM
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
        int i,p;
        for(i=1;i<=10;i++)
        {
            p=i*s;
        
        out.println(+s+"*"+i+"="+p);%><br><%
        
                
        }
       %> 
    </body>
</html>
