<%-- 
    Document   : Product
    Created on : Feb 23, 2022, 1:23:56 AM
    Author     : Pham Minh Giang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

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

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>
            .product .product-img{
                height: 250px;
            }
            .product .product-body{
                height: 250px;
            }
        </style>

        <script type="text/javascript">
            function addtocart(id) {
                document.f.action = "addtocart?id=" + id;
                document.f.submit();
            }
        </script>

    </head>
    <body>
        <!-- HEADER -->
        <%@include file="../Components/Header.jsp" %>
        <!-- /HEADER -->

        <!-- NAVIGATION -->
        <nav id="navigation">
            <!-- container -->
            <div class="container">
                <!-- responsive-nav -->
                <div id="responsive-nav">
                    <!-- NAV -->
                    <ul class="main-nav nav navbar-nav">
                        <li ><a href="home">Home</a></li>

                        <li class="active"><a href="products">All Product</a></li>

                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                Category
                            </a>
                            <div class="cart-dropdown" class="navtab">
                                <c:forEach items="${requestScope.listCategory}" var="category">
                                    <h5><a href="#">${category.getName()}</a></h5>
                                    </c:forEach>
                            </div>
                        </li>

                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                Technology
                            </a>
                            <div class="cart-dropdown" class="navtab">
                                <c:forEach items="${requestScope.listTechnology}" var="technology">
                                    <h5><a href="#">${technology.getName()}</a></h5>
                                    </c:forEach>
                            </div>
                        </li>

                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                Brand
                            </a>
                            <div class="cart-dropdown" class="navtab">
                                <c:forEach items="${requestScope.listBrand}" var="brand">
                                    <h5><a href="#">${brand.getName()}</a></h5>
                                    </c:forEach>
                            </div>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                Size
                            </a>
                            <div class="cart-dropdown" class="navtab">
                                <c:forEach items="${requestScope.listSize}" var="size">
                                    <h5><a href="#">${size}</a></h5>
                                    </c:forEach>
                            </div>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                Sale
                            </a>
                            <div class="cart-dropdown" class="navtab">
                                <h5><a href="#">10%-30%</a></h5>
                                <h5><a href="#">30%-50%</a></h5>
                                <h5><a href="#">50%-70%</a></h5>
                            </div>
                        </li>
                    </ul>
                    <!-- /NAV -->
                </div>
                <!-- /responsive-nav -->
            </div>
            <!-- /container -->
        </nav>
        <!-- /NAVIGATION -->

        <!-- BREADCRUMB -->
        <!--        <div id="breadcrumb" class="section">
                     container 
                    <div class="container">
                         row 
                        <div class="row">
                            <div class="col-md-12">
                                <ul class="breadcrumb-tree">
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">All Categories</a></li>
                                    <li><a href="#">Accessories</a></li>
                                    <li class="active">Headphones (227,490 Results)</li>
                                </ul>
                            </div>
                        </div>
                         /row 
                    </div>
                     /container 
                </div>-->
        <!-- /BREADCRUMB -->

        <!-- SECTION -->
        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <!-- ASIDE -->
                    <div id="aside" class="col-md-3">

                        <form action="filter">
                            <!-- aside Widget -->
                            <div class="aside">
                                <h3 class="aside-title">Categories</h3>
                                <div class="checkbox-filter">
                                    <c:forEach items="${requestScope.listCategory}" var="category">
                                        <div>
                                            <input type="radio" name="cate" value="${category.id}" /> ${category.getName()}
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                            <!-- /aside Widget -->

                            <!-- aside Widget -->
                            <div class="aside">
                                <h3 class="aside-title">Brand</h3>
                                <div class="checkbox-filter">
                                    <c:forEach items="${requestScope.listBrand}" var="brand">
                                        <div>
                                            <input type="radio" name="brand" value="${brand.id}" /> ${brand.getName()}
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                            <!-- /aside Widget -->

                            <!-- aside Widget -->
                            <div class="aside">
                                <h3 class="aside-title">Technology</h3>
                                <div class="checkbox-filter">
                                    <c:forEach items="${requestScope.listTechnology}" var="tech">
                                        <div>
                                            <input type="radio" name="tech" value="${tech.id}" /> ${tech.getName()}
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                            <!-- /aside Widget -->

                            <!-- aside Widget -->
                            <div class="aside">
                                <h3 class="aside-title">Size</h3>
                                <div class="checkbox-filter">
                                    <c:forEach items="${requestScope.listSize}" var="size">
                                        <div>
                                            <input type="radio" name="size" value="${size}" /> ${size}
                                        </div>
                                    </c:forEach>
                                </div>
                            </div>
                            <!-- /aside Widget -->

                            <!-- aside Widget -->
                            <div class="aside">
                                <h3 class="aside-title">Price</h3>
                                <div class="price-filter">
                                    <div id="price-slider"></div>
                                    <div class="input-number price-min">
                                        <input id="price-min" type="number">
                                        <span class="qty-up">+</span>
                                        <span class="qty-down">-</span>
                                    </div>
                                    <span>-</span>
                                    <div class="input-number price-max">
                                        <input id="price-max" type="number">
                                        <span class="qty-up">+</span>
                                        <span class="qty-down">-</span>
                                    </div>
                                </div>
                            </div>
                            <!-- /aside Widget -->
                            <br/><input type="submit" value="View"/>
                        </form>
                    </div>
                    <!-- /ASIDE -->

                    <!-- STORE -->
                    <div id="store" class="col-md-9">
                        <!-- store top filter -->
                        <div class="store-filter clearfix">
                            <div class="store-sort">
                                <!--                                <label>
                                                                    Sort By:
                                                                    <select class="input-select">
                                                                        <option value="0">Random</option>
                                                                        <option value="1">Ascending by Price</option>
                                                                        <option value="2">Descending by Price</option>
                                                                    </select>
                                                                </label>-->

                                <!-- <label>
                                        Show:
                                        <select class="input-select">
                                            <option value="0">10</option>
                                            <option value="1">20</option>
                                            <option value="2">50</option>
                                            <option value="3">All</option>
                                        </select>
                                    </label>-->
                            </div>
                            <!--paging-->
                            <%@include file="../Components/Paging.jsp" %>
                            <!--paging-->

                            <!-- <ul class="store-grid">
                                     <li class="active"><i class="fa fa-th"></i></li>
                                     <li><a href="#"><i class="fa fa-th-list"></i></a></li>
                                </ul>-->
                        </div>
                        <!-- /store top filter -->

                        <!-- store products -->
                        <form name="f" action="" method="post">
                            <div class="row">
                                <c:forEach items="${requestScope.product}" var="p">
                                    <!--product-->
                                    <div class="col-md-4 col-xs-6">
                                        <div class="product">
                                            <div class="product-img">
                                                <a href="productdetail?productID=${p.getId()}"><img src="img/${p.getImage()}" alt=""></a>
                                                <div class="product-label">
                                                    <!-- <span class="sale">-30%</span>
                                                         <span class="new">NEW</span> -->
                                                </div>
                                            </div>
                                            <div class="product-body">
                                                <p class="product-category">${p.getCate_id().toUpperCase()}</p>
                                                <h3 class="product-name"><a href="productdetail?productID=${p.getId()}">${p.getDes()}</a></h3>
                                                <h3 class="product-name"><a href="productdetail?productID=${p.getId()}">${p.getName()}</a></h3>
                                                <h4 class="product-price">${p.getPrice()}K <del class="product-old-price">$1000</del></h4>
                                                <div class="product-rating">
                                                    <i class="fa fa-star"></i>
                                                    <i class="fa fa-star"></i>
                                                    <i class="fa fa-star"></i>
                                                    <i class="fa fa-star"></i>
                                                    <i class="fa fa-star"></i>
                                                </div>
                                                <div class="product-btns">
                                                    <button class="add-to-wishlist"><i class="fa fa-heart-o"></i><span class="tooltipp">add to wishlist</span></button>
                                                    <button class="add-to-compare"><i class="fa fa-exchange"></i><span class="tooltipp">add to compare</span></button>
                                                    <button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">View Detail</span></button>
                                                </div>
                                            </div>
                                            <div class="add-to-cart">
                                                <input type="submit" class="add-to-cart-btn fa fa-shopping-cart"  onclick="addtocart('${p.getId()}')" value="Add to cart" />
                                                <!--<button class="add-to-cart-btn"><i class="fa fa-shopping-cart" onclick="addtocart()"></i> add to cart</button>-->
                                            </div>
                                        </div>
                                    </div>
                                    <!--product-->
                                </c:forEach>
                            </div>
                        </form>
                        <!-- /store products -->

                        <!-- store bottom filter -->
                        <div class="store-filter clearfix">
                            <!--paging-->
                            <%@include file="../Components/Paging.jsp" %>
                            <!--paging-->
                        </div>
                        <!-- /store bottom filter -->
                    </div>
                    <!-- /STORE -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->

        <!-- NEWSLETTER -->
        <div id="newsletter" class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="newsletter">
                            <p>Sign Up for the <strong>NEWSLETTER</strong></p>
                            <form>
                                <input class="input" type="email" placeholder="Enter Your Email">
                                <button class="newsletter-btn"><i class="fa fa-envelope"></i> Subscribe</button>
                            </form>
                            <ul class="newsletter-follow">
                                <li>
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-instagram"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-pinterest"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /NEWSLETTER -->

        <!-- FOOTER -->
        <%@include file="../Components/Footer.jsp" %>
        <!-- /FOOTER -->

        <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>
