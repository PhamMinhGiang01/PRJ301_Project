<%-- 
    Document   : AUpdateCate
    Created on : Mar 14, 2022, 3:17:20 AM
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
        <h1>Update Category</h1>

        <h3 style="color: red"> ${requestScope.error}</h3>

        <c:if test="${requestScope.cate != null}">
            <form action="updatecate" method="post">
                BrandID <input type="text" readonly name="id" value="${requestScope.cate.getId()}"/><br/><br/>
                BrandName <input type="text" name="name" value="${requestScope.cate.getName()}"/><br/><br/>
                Description <input type="text" name="des" value="${requestScope.cate.getDes()}"/><br/><br/>
                <input type="submit" value="UPDATE" />
            </form>
        </c:if>
    </body>
</html>
