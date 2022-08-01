<%-- 
    Document   : AAddBrand
    Created on : Mar 14, 2022, 1:59:39 AM
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
        <h1>Add new Brand</h1>

        <h3 style="color: red"> ${requestScope.error}</h3>

        <form action="addbrand" method="post">
            BrandID <input type="text" name="id"/> <br/><br/>
            BrandName <input type="text" name="name"/> <br/><br/>
            Description <input type="text" name="des"/> <br/><br/>
            <input type="submit" value="ADD" />
        </form>
    </body>
</html>
