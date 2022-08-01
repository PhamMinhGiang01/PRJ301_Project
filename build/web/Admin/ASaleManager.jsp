<%-- 
    Document   : ASaleManager
    Created on : Mar 15, 2022, 12:17:05 AM
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
            table2{
                width: 40px;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid">
            <h1><a href="ahome" style="color: red">HOME</a></h1>
            <h3>Top Selling</h3>
            <form action="salemanager" method="post">
                <input type="text" name="sell" />
                <input type="submit" value="View" />
            </form>
            <br/>

            <!--  private String id;
                  private String name;
                  private String image ;
                  private Brand brand;
                  private Technology tech;
                  private Category cate;
                  private int size;
                  private double price;
                  private String des;-->
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
                </tr>

                <c:forEach items="${sessionScope.listproduct}" var="p">
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
                    </tr>
                </c:forEach>
            </table>

            <h6></h6>
            <br/><br/>
            <h3>Top Shopping</h3>
            <form action="salemanager" method="post">
                <input type="text" name="shop" />
                <input type="submit" value="View" />
            </form>
            <br/>
            <div class="table2">
                <table border = "1px" width = "20%">
                    <tr>
                        <th> User Name</th>
                    </tr>
                    <c:forEach items="${sessionScope.listuser}" var="u">
                        <tr>
                            <td>${u}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <br/>

            <h6></h6>
            <br/><br/>
            <h3>Sales Chart (Year)</h3>
            <form action="salemanager" method="post">
                <input type="text" name="year" />
                <input type="submit" value="View" />
            </form>
            <br/>
            <%@include file="../Components/chart.jsp" %>
            <br/><br/>

            <script src="js/jquery.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/slick.min.js"></script>
            <script src="js/nouislider.min.js"></script>
            <script src="js/jquery.zoom.min.js"></script>
            <script src="js/main.js"></script>
        </div> 
    </body>
</html>
