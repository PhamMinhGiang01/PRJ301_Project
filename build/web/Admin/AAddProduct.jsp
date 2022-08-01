<%-- 
    Document   : AAdd
    Created on : Mar 1, 2022, 2:29:54 AM
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
        <h1>Add new Product</h1>

        <h3 style="color: red"> ${requestScope.error}</h3>

        <form action="addproduct" method="post">
            ProductID <input type="text" name="id"/> <br/><br/>
            ProductName <input type="text" name="name"/> <br/><br/>
            ProductImageUrl <input type="text" name="image"/> <br/><br/>
            BrandID <input type="text" name="brand_id"/> <br/><br/>
            TechnologyID <input type="text" name="tech_id"/> <br/><br/>
            CategoryID <input type="text" name="cate_id"/> <br/><br/>
            Size <input type="number" name="size"/> <br/><br/>
            Price <input type="text" name="price"/> <br/><br/>
            Description <input type="text" name="des"/> <br/><br/>
            <input type="submit" value="ADD" />
        </form>

    </body>
</html>
