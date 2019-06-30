<%-- 
    Document   : newjsp
    Created on : 10 Mar, 2019, 12:08:02 PM
    Author     : dell
--%>
<%@page import="java.io.*,java.util.*,java.sql.*" %>
<%@page import="javax.servlet.http.*,javax.servlet.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sql : query tag</title>
    </head>
    <body>
        
        
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost:3307/college"
                           user="root" password="root"/>
        
        <sql:query dataSource="${db}" var="rs">
            select * from student
        </sql:query>
            
            <table border="2" width="100%"
                   <tr>
                    <th>Name</th>
                    <th>Mobile</th>
                    <th>Gender</th>
                    <th>State</th>
                    <th>Date Of Birth</th>
                </tr>
                <c:forEach var="table" items="${rs.rows}">
                    <tr>
                        <td><c:out value="${table.name}"/></td>
                        <td><c:out value="${table.mob}"/></td>
                        <td><c:out value="${table.gender}"/></td>
                        <td><c:out value="${table.state}"/></td>
                        <td><c:out value="${table.dob}"/></td>


                    </tr>
                </c:forEach> 
            </table>
    </body>
</html>
