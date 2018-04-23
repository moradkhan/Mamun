<%-- 
    Document   : insert
    Created on : Apr 11, 2018, 3:56:34 PM
    Author     : l2pc214e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="save.htm">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>

                </tr>
            </table>
        </form>
    </body>
</html>
