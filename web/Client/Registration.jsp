<%-- 
    Document   : Registration
    Created on : Mar 11, 2022, 3:12:07 PM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registration Form</h1>
        <h3>
            <h3 style="color: red">${requestScope.error}</h3>
            <h3 style="color: red">${requestScope.error1}</h3>
            <form action="regist" method="post">
                Enter Username <input type="text" name="user" value="" /> <br/>
                Enter Password <input type="password" name="pass" value="" /> <br/>
                Conferm Password <input type="password" name="cfpass" value="" /> <br/>
                <input type="submit" value="Create" />
            </form>
        </h3>
    </body>
</html>
