<%-- 
    Document   : Loginjsp
    Created on : Feb 24, 2022, 4:47:37 PM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/nouislider.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/slick-theme.css" rel="stylesheet" type="text/css"/>
        <link href="css/slick.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>MinhGiangStore</title>

    </head>
    <body> 
        <h1>Login form</h1>
        <h3 style="color: red">${requestScope.error}</h3>
        <form action="login" method="post">
            Enter username: <input type="text" name="username" /><br>
            Enter password: <input type="password" name="password" /><br>
            <input type="submit" value="LOGIN"/>
        </form>
        <br>
        <h5>
            <a href="regist">Create Account</a>
        </h5>
        

    </body>   

</html>
