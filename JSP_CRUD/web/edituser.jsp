<%-- 
    Document   : edituser
    Created on : 10 Mar, 2019, 9:42:35 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title
        
        <%@page import="com.userdao.UserDao"%>  
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  

        
    </head>
    <body>
     <%  
int i=UserDao.update(u);  
response.sendRedirect("viewusers.jsp");  
%>     
    </body>
</html>
