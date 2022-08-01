<%-- 
    Document   : ACate
    Created on : Mar 14, 2022, 12:47:52 AM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            tr th{
                text-align: center;
            }
            tr{
                text-align: center;
            }
        </style>
        <script type="text/javascript">
            function doDelete(id) {
                if (confirm("Are you sure to delete Brand with id = " + id + " ?")) {
                    window.location = "deletecate?id=" + id;
                }
            }
        </script>
    </head>
    <body>
        <div class="container-fluid">
            <h1><a href="ahome">HOME</a></h1>
            <h1>List of Category</h1>
            <h2><a href="addcate">Add new Category</a></h2>

            <table border = "2px" width = "40%">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Action</th>
                </tr>

                <c:forEach items="${requestScope.list}" var="c">
                    <tr>

                        <td>${c.getId()}</td>
                        <td>${c.getName()}</td>
                        <td>${c.getDes()}</td>
                        <td>
                            <a href="#" onclick="doDelete('${c.getId()}')" >Delete</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="updatecate?id=${c.getId()}">Update</a>
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
