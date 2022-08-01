<%-- 
   Document   : Product
   Created on : Feb 28, 2022, 10:15:34 PM
   Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MinhGiangStore</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css"/>

        <style>
            table{
                border-collapse: collapse;
                font-size: 18px;
            }
            .image{
                width: 10px;
                height: 15px;
            }
            tr th{
                text-align: center;
            }
            tr{
                text-align: center;
            }
        </style>
        <script type="text/javascript">
            function doDelete(id) {
                if (confirm("Are you sure to delete Product with id = " + id + " ?")) {
                    window.location = "deleteproduct?id=" + id;
                }
            }
        </script>
    </head>
    <body>
        <div class="container-fluid">
            <h1><a href="ahome">HOME</a></h1>
            <h1>List of Product</h1>
            <!--  private String id;
                  private String name;
                  private String image ;
                  private Brand brand;
                  private Technology tech;
                  private Category cate;
                  private int size;
                  private double price;
                  private String des;-->

            <h2><a href="addproduct">Add new product</a></h2>

            <table border = "1px" width = "100%">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Image</th>
                    <th>Brand</th>
                    <th>Technology</th>
                    <th>Category</th>
                    <th>Size</th>
                    <th>Price</th>
                    <th>Description</th>
                    <th>Action</th>
                </tr>

                <c:forEach items="${requestScope.list}" var="p">
                    <tr>

                        <td>${p.getId()}</td>
                        <td>${p.getName()}</td>
                        <td class="image">
                            <img src="img/${p.getImage()}">
                        </td>
                        <td>${p.getBrand_id()}</td>
                        <td>${p.getTech_id()}</td>
                        <td>${p.getCate_id()}</td>
                        <td>${p.getSize()}</td>
                        <td>${p.getPrice()}</td>
                        <td>${p.getDes()}</td>
                        <td>
                            <a href="#" onclick="doDelete('${p.getId()}')" >Delete</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="updateproduct?id=${p.getId()}">Update</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>

            <script src="js/jquery.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/slick.min.js"></script>
            <script src="js/nouislider.min.js"></script>
            <script src="js/jquery.zoom.min.js"></script>
            <script src="js/main.js"></script>
        </div> 
    </body>
</html>


