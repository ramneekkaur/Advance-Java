<%-- 
    Document   : adduser
    Created on : 9 Mar, 2019, 1:02:46 PM
    Author     : dell
--%>
<%@page import="com.userdao.UserDao" %>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>  
  
  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%  
int i=UserDao.save(u);  
if(i>0){  
response.sendRedirect("adduser_success.jsp");  
}else{  
response.sendRedirect("adduser_error.jsp");  
}  
%>  
   
    </body>
</html>
