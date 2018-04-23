<%-- 
    Document   : success
    Created on : Apr 11, 2018, 4:00:03 PM
    Author     : l2pc214e
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! Success Page</h1>
        <c:forEach items="${ai}" var="a">
        <tr>

        <h1><td>${a.name}</td></h1> 

        </tr>

    </c:forEach>
</table>
</body>
</html>
