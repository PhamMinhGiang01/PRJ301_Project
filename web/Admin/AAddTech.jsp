<%-- 
    Document   : AAddTech
    Created on : Mar 14, 2022, 2:55:07 AM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MinhGiangStore</title>
    </head>
    <body>
        <h1>Add new Technology</h1>

        <h3 style="color: red"> ${requestScope.error}</h3>

        <form action="addtech" method="post">
            Technology ID <input type="text" name="id"/> <br/><br/>
            Technology Name <input type="text" name="name"/> <br/><br/>
            Description <input type="text" name="des"/> <br/><br/>
            <input type="submit" value="ADD" />
        </form>
    </body>
</html>
