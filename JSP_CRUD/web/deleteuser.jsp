<%-- 
    Document   : deleteuser
    Created on : 10 Mar, 2019, 9:44:47 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        <%@page import="com.userdao.UserDao"%>  
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  

    </head>
    <body>
        <%  
UserDao.delete(u);  
response.sendRedirect("viewusers.jsp");  
%>  
    </body>
</html>
