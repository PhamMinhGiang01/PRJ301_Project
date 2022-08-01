<%-- 
    Document   : AAdd
    Created on : Mar 1, 2022, 2:29:54 AM
    Author     : Pham Minh Giang
--%>

<%@page import="Model.Product"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MinhGiangStore</title>
    </head>
    <body>
        <h1>Update Product</h1>

        <c:if test="${requestScope.product != null}">
            <form action="updateproduct" method="post">
                ProductID <input type="text" readonly name="id" value="${requestScope.product.getId()}"/><br/><br/>
                ProductName <input type="text" name="name" value="${requestScope.product.getName()}"/> <br/><br/>
                ProductImageUrl <input type="text" name="image" value="${requestScope.product.getImage()}"/> <br/><br/>
                BrandID <input type="text" name="brand_id" value="${requestScope.product.getBrand_id()}"/> <br/><br/>
                TechnologyID <input type="text" name="tech_id" value="${requestScope.product.getTech_id()}"/> <br/><br/>
                CategoryID <input type="text" name="cate_id" value="${requestScope.product.getCate_id()}"/> <br/><br/>
                Size <input type="number" name="size" value="${requestScope.product.getSize()}"/> <br/><br/>
                Price <input type="text" name="price" value="${requestScope.product.getPrice()}"/> <br/><br/>
                Description <input type="text" name="des" value="${requestScope.product.getDes()}"/> <br/><br/>
                <input type="submit" value="UPDATE" />
            </form>

        </c:if>


    </body>
</html>
