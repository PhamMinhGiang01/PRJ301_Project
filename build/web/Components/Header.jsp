<%-- 
    Document   : Header
    Created on : Mar 8, 2022, 12:20:19 AM
    Author     : Pham Minh Giang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <!-- TOP HEADER -->
    <div id="top-header">
        <div class="container">
            <ul class="header-links pull-left">
                <li><a href="#"><i class="fa fa-phone"></i> +84 964 156 248</a></li>
                <li><a href="https://mail.google.com/mail"><i class="fa fa-envelope-o"></i> giangpmhe150049@fpt.edu.vn</a></li>
                <li><a href="https://shorturl.at/gyOP0"><i class="fa fa-map-marker"></i> HungYenCity</a></li>
            </ul>
            <ul class="header-links pull-right">
                <li><a href="#"><i class="fa fa-dollar"></i> USD</a></li>
                <li>
                    <c:if test="${sessionScope.account != null}">
                        <a href="#"><i class="fa fa-user-o"></i>${sessionScope.account.username} |</a>
                        <a href="logout"> Logout</a>
                    </c:if>
                    <c:if test="${sessionScope.account == null}">
                        <a href="login"><i class="fa fa-user-o"></i>Login | </a>
                        <a href="regist">Registration</a>
                    </c:if>
                </li>
            </ul>
        </div>
    </div>
    <!-- /TOP HEADER -->

    <!-- MAIN HEADER -->
    <div id="header">
        <!-- container -->
        <div class="container">
            <!-- row -->
            <div class="row">
                <!-- LOGO -->
                <div class="col-md-3">
                    <div class="header-logo">
                        <a href="home" class="logo">
                            <h1>MGiang</h1><h2>Store</h2>
                        </a>
                    </div>
                </div>
                <!-- /LOGO -->

                <!-- SEARCH BAR -->
                <div class="col-md-6">
                    <div class="header-search">
                        <form action="search">
                            <select class="input-select" name="cate">
                                <option value="0">All Categories</option>
                                <option value="1">Gaming</option>
                                <option value="2">Design</option>
                                <option value="3">Program</option>
                            </select>
                            <input class="input" name="key" placeholder="Search here">
                            <button class="search-btn">Search</button>
                        </form>
                    </div>
                </div>
                <!-- /SEARCH BAR -->

                <!-- ACCOUNT -->
                <div class="col-md-3 clearfix">
                    <div class="header-ctn">
                        <!-- Wishlist -->
                        <div>
                            <a href="#">
                                <i class="fa fa-heart-o"></i>
                                <span>Your Wishlist</span>
                                <!--<div class="qty">2</div>-->
                            </a>
                        </div>
                        <!-- /Wishlist -->

                        <!-- Cart -->
                        <c:set var="o" value="${sessionScope.cart}"/>


                        <div class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
                                <i class="fa fa-shopping-cart"></i>
                                <span>Your Cart</span>
                                <c:if test="${sessionScope.size > 0}">
                                    <div class="qty">${sessionScope.size}</div>
                                </c:if>

                            </a>
                            <div class="cart-dropdown">
                                <div class="cart-list">

                                    <c:forEach items="${o.items}" var="i">

                                        <div class="product-widget">
                                            <div class="input-number price-max">
                                                <div class="product-img">
                                                    <img src="./img/${i.product.getImage()}" alt="">
                                                </div>

                                                <div class="product-body">
                                                    <h3 class="product-name"><a href="#">${i.product.getDes()} ${i.product.getName()}</a></h3>
                                                    <h4 class="product-price"><span class="qty">x${i.quantity}</span>${i.product.getPrice()}</h4>
                                                </div>

                                                <span class="qty-up"><a href="process?num=1&id=${i.product.getId()}">+</a></span>
                                                <span class="qty-down"><a href="process?num=-1&id=${i.product.getId()}">-</a></span>

                                                <form action="process" method="post">
                                                    <input type="hidden" name="id" value="${i.product.getId()}"/>
                                                    <input class="delete" type="submit" value="x"/>
                                                </form>

                                                <hr/>
                                            </div>

                                        </div>
                                    </c:forEach>

                                </div>
                                <div class="cart-summary">
                                    <small>${sessionScope.size} Item(s) selected</small>
                                    <h5>SUBTOTAL: ${sessionScope.total}</h5>
                                </div>
                                <form action="checkout" method="get">    
                                    <div class="cart-btns">
                                        <a href="#">View Cart</a>
                                        <!--<a href="#">checkout <i class="fa fa-arrow-circle-right"></i></a>-->
                                        <a>
                                            <input type="submit" value=">"/>
                                            Checkout<i class="fa fa-arrow-circle-right"></i>
                                        </a> 
                                    </div>
                                </form>
                            </div>
                        </div>
                        <!-- /Cart -->

                        <!-- Menu Toogle -->
                        <div class="menu-toggle">
                            <a href="#">
                                <i class="fa fa-bars"></i>
                                <span>Menu</span>
                            </a>
                        </div>
                        <!-- /Menu Toogle -->
                    </div>
                </div>
                <!-- /ACCOUNT -->
            </div>
            <!-- row -->
        </div>
        <!-- container -->
    </div>
    <!-- /MAIN HEADER -->
</header>
