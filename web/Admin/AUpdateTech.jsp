<%-- 
    Document   : AUpdateTech
    Created on : Mar 14, 2022, 3:06:34 AM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MinhGiangStore</title>
    </head>
    <body>
        <h1>Update Technology</h1>

        <h3 style="color: red"> ${requestScope.error}</h3>

        <c:if test="${requestScope.tech != null}">
            <form action="updatetech" method="post">
                BrandID <input type="text" readonly name="id" value="${requestScope.tech.getId()}"/><br/><br/>
                BrandName <input type="text" name="name" value="${requestScope.tech.getName()}"/><br/><br/>
                Description <input type="text" name="des" value="${requestScope.tech.getDes()}"/><br/><br/>
                <input type="submit" value="UPDATE" />
            </form>
        </c:if>
    </body>
</html>
