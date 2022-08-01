package org.apache.jsp.Client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Client/../Components/Header.jsp");
    _jspx_dependants.add("/Client/../Components/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("        <title>MinhGiangStore</title>\n");
      out.write("\n");
      out.write("        <!-- Google font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\n");
      out.write("        <!-- Slick -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\n");
      out.write("\n");
      out.write("        <!-- nouislider -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icon -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Custom stlylesheet -->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .product .product-img{\n");
      out.write("               height: 250px;\n");
      out.write("            }\n");
      out.write("            .product .product-body{\n");
      out.write("                height: 250px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- HEADER -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("    <!-- TOP HEADER -->\n");
      out.write("    <div id=\"top-header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <ul class=\"header-links pull-left\">\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-phone\"></i> +84 964 156 248</a></li>\n");
      out.write("                <li><a href=\"https://mail.google.com/mail\"><i class=\"fa fa-envelope-o\"></i> giangpmhe150049@fpt.edu.vn</a></li>\n");
      out.write("                <li><a href=\"https://shorturl.at/gyOP0\"><i class=\"fa fa-map-marker\"></i> HungYenCity</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"header-links pull-right\">\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-dollar\"></i> USD</a></li>\n");
      out.write("                <li>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /TOP HEADER -->\n");
      out.write("\n");
      out.write("    <!-- MAIN HEADER -->\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <!-- container -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- LOGO -->\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"header-logo\">\n");
      out.write("                        <a href=\"home\" class=\"logo\">\n");
      out.write("                            <h1>MGiang</h1><h2>Store</h2>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /LOGO -->\n");
      out.write("\n");
      out.write("                <!-- SEARCH BAR -->\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"header-search\">\n");
      out.write("                        <form action=\"search\">\n");
      out.write("                            <select class=\"input-select\" name=\"cate\">\n");
      out.write("                                <option value=\"0\">All Categories</option>\n");
      out.write("                                <option value=\"1\">Gaming</option>\n");
      out.write("                                <option value=\"2\">Design</option>\n");
      out.write("                                <option value=\"3\">Program</option>\n");
      out.write("                            </select>\n");
      out.write("                            <input class=\"input\" name=\"key\" placeholder=\"Search here\">\n");
      out.write("                            <button class=\"search-btn\">Search</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /SEARCH BAR -->\n");
      out.write("\n");
      out.write("                <!-- ACCOUNT -->\n");
      out.write("                <div class=\"col-md-3 clearfix\">\n");
      out.write("                    <div class=\"header-ctn\">\n");
      out.write("                        <!-- Wishlist -->\n");
      out.write("                        <div>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-heart-o\"></i>\n");
      out.write("                                <span>Your Wishlist</span>\n");
      out.write("                                <!--<div class=\"qty\">2</div>-->\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /Wishlist -->\n");
      out.write("\n");
      out.write("                        <!-- Cart -->\n");
      out.write("                        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                <i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                                <span>Your Cart</span>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"cart-dropdown\">\n");
      out.write("                                <div class=\"cart-list\">\n");
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"cart-summary\">\n");
      out.write("                                    <small>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Item(s) selected</small>\n");
      out.write("                                    <h5>SUBTOTAL: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                                </div>\n");
      out.write("                                <form action=\"checkout\" method=\"get\">    \n");
      out.write("                                    <div class=\"cart-btns\">\n");
      out.write("                                        <a href=\"#\">View Cart</a>\n");
      out.write("                                        <!--<a href=\"#\">checkout <i class=\"fa fa-arrow-circle-right\"></i></a>-->\n");
      out.write("                                        <a>\n");
      out.write("                                            <input type=\"submit\" value=\">\"/>\n");
      out.write("                                            Checkout<i class=\"fa fa-arrow-circle-right\"></i>\n");
      out.write("                                        </a> \n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /Cart -->\n");
      out.write("\n");
      out.write("                        <!-- Menu Toogle -->\n");
      out.write("                        <div class=\"menu-toggle\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\n");
      out.write("                                <span>Menu</span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /Menu Toogle -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /ACCOUNT -->\n");
      out.write("            </div>\n");
      out.write("            <!-- row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- container -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /MAIN HEADER -->\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("        <!-- /HEADER -->\n");
      out.write("\n");
      out.write("        <!-- NAVIGATION -->\n");
      out.write("        <nav id=\"navigation\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- responsive-nav -->\n");
      out.write("                <div id=\"responsive-nav\">\n");
      out.write("                    <!-- NAV -->\n");
      out.write("                    <ul class=\"main-nav nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"home\">Home</a></li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"products\">All Product</a></li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                Category\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"cart-dropdown\" class=\"navtab\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                Technology\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"cart-dropdown\" class=\"navtab\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                Brand\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"cart-dropdown\" class=\"navtab\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                Size\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"cart-dropdown\" class=\"navtab\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                Sale\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"cart-dropdown\" class=\"navtab\">\n");
      out.write("                                <h5><a href=\"#\">10%-30%</a></h5>\n");
      out.write("                                <h5><a href=\"#\">30%-50%</a></h5>\n");
      out.write("                                <h5><a href=\"#\">50%-70%</a></h5>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /NAV -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /responsive-nav -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </nav>\n");
      out.write("        <!-- /NAVIGATION -->\n");
      out.write("\n");
      out.write("        <!-- SECTION -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- shop -->\n");
      out.write("                    <div class=\"col-md-4 col-xs-6\">\n");
      out.write("                        <div class=\"shop\">\n");
      out.write("                            <div class=\"shop-img\">\n");
      out.write("                                <img src=\"img/p4.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shop-body\">\n");
      out.write("                                <h4>Gamer<br>Collection</h4>\n");
      out.write("                                <a href=\"search?cate=1&key=\" class=\"cta-btn\">Shop now <i class=\"fa fa-arrow-circle-right\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /shop -->\n");
      out.write("\n");
      out.write("                    <!-- shop -->\n");
      out.write("                    <div class=\"col-md-4 col-xs-6\">\n");
      out.write("                        <div class=\"shop\">\n");
      out.write("                            <div class=\"shop-img\">\n");
      out.write("                                <img src=\"img/p8.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shop-body\">\n");
      out.write("                                <h4>Designer<br>Collection</h4>\n");
      out.write("                                <a href=\"search?cate=2&key=\" class=\"cta-btn\">Shop now <i class=\"fa fa-arrow-circle-right\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /shop -->\n");
      out.write("\n");
      out.write("                    <!-- shop -->\n");
      out.write("                    <div class=\"col-md-4 col-xs-6\">\n");
      out.write("                        <div class=\"shop\">\n");
      out.write("                            <div class=\"shop-img\">\n");
      out.write("                                <img src=\"img/p10.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"shop-body\">\n");
      out.write("                                <h4>Programmer<br>Collection</h4>\n");
      out.write("                                <a href=\"search?cate=3&key=\" class=\"cta-btn\">Shop now <i class=\"fa fa-arrow-circle-right\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /shop -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /SECTION -->\n");
      out.write("\n");
      out.write("        <!-- SECTION -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!-- section title -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h3 class=\"title\">New Products</h3>\n");
      out.write("                            <div class=\"section-nav\">\n");
      out.write("                                <ul class=\"section-tab-nav tab-nav\">\n");
      out.write("                                    <li><a href=\"search?cate=1&key=\">Gaming</a></li>\n");
      out.write("                                    <li><a href=\"search?cate=2&key=\">Design</a></li>\n");
      out.write("                                    <li><a href=\"search?cate=3&key=\">Program</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /section title -->\n");
      out.write("\n");
      out.write("                    <!-- Products tab & slick -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"products-tabs\">\n");
      out.write("                                <!-- tab -->\n");
      out.write("                                <div id=\"tab1\" class=\"tab-pane active\">\n");
      out.write("                                    <div class=\"products-slick\" data-nav=\"#slick-nav-1\">\n");
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"slick-nav-1\" class=\"products-slick-nav\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /tab -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Products tab & slick -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /SECTION -->\n");
      out.write("\n");
      out.write("        <!-- HOT DEAL SECTION -->\n");
      out.write("        <div id=\"hot-deal\" class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"hot-deal\">\n");
      out.write("                            <ul class=\"hot-deal-countdown\">\n");
      out.write("                                <li>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h3>02</h3>\n");
      out.write("                                        <span>Days</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h3>10</h3>\n");
      out.write("                                        <span>Hours</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h3>34</h3>\n");
      out.write("                                        <span>Mins</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <div>\n");
      out.write("                                        <h3>60</h3>\n");
      out.write("                                        <span>Secs</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <h2 class=\"text-uppercase\">hot deal this week</h2>\n");
      out.write("                            <p>New Collection Up to 50% OFF</p>\n");
      out.write("                            <a class=\"primary-btn cta-btn\" href=\"products\">Shop now</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /HOT DEAL SECTION -->\n");
      out.write("\n");
      out.write("        <!-- SECTION -->\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <!-- section title -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h3 class=\"title\">Top selling</h3>\n");
      out.write("                            <div class=\"section-nav\">\n");
      out.write("                                <ul class=\"section-tab-nav tab-nav\">\n");
      out.write("                                    <li class=\"active\"><a data-toggle=\"tab\" href=\"#tab2\">Gaming</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab2\">Design</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab2\">Program</a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#tab2\">Orther</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /section title -->\n");
      out.write("\n");
      out.write("                    <!-- Products tab & slick -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"products-tabs\">\n");
      out.write("                                <!-- tab -->\n");
      out.write("                                <div id=\"tab2\" class=\"tab-pane fade in active\">\n");
      out.write("                                    <div class=\"products-slick\" data-nav=\"#slick-nav-2\">\n");
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"slick-nav-2\" class=\"products-slick-nav\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /tab -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /Products tab & slick -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /SECTION -->\n");
      out.write("\n");
      out.write("        <!-- NEWSLETTER -->\n");
      out.write("        <div id=\"newsletter\" class=\"section\">\n");
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"newsletter\">\n");
      out.write("                            <p>Sign Up for the <strong>NEWSLETTER</strong></p>\n");
      out.write("                            <form>\n");
      out.write("                                <input class=\"input\" type=\"email\" placeholder=\"Enter Your Email\">\n");
      out.write("                                <button class=\"newsletter-btn\"><i class=\"fa fa-envelope\"></i> Subscribe</button>\n");
      out.write("                            </form>\n");
      out.write("                            <ul class=\"newsletter-follow\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /container -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /NEWSLETTER -->\n");
      out.write("\n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer id=\"footer\">\n");
      out.write("    <!-- top footer -->\n");
      out.write("    <div class=\"section\">\n");
      out.write("        <!-- container -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        <h3 class=\"footer-title\">About Us</h3>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</p>\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li><a href=\"https://shorturl.at/gyOP0\"><i class=\"fa fa-map-marker\"></i>HungYenCity</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-phone\"></i>+84 964 156 248</a></li>\n");
      out.write("                            <li><a href=\"https://mail.google.com/mail\"><i class=\"fa fa-envelope-o\"></i>giangpmhe150049@fpt.edu.vn</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        <h3 class=\"footer-title\">Categories</h3>\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li><a href=\"#\">Gaming</a></li>\n");
      out.write("                            <li><a href=\"#\">Design</a></li>\n");
      out.write("                            <li><a href=\"#\">Program</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix visible-xs\"></div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        <h3 class=\"footer-title\">Information</h3>\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li><a href=\"#\">About Us</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                            <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                            <li><a href=\"#\">Orders and Returns</a></li>\n");
      out.write("                            <li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-xs-6\">\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        <h3 class=\"footer-title\">Service</h3>\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li><a href=\"#\">My Account</a></li>\n");
      out.write("                            <li><a href=\"#\">View Cart</a></li>\n");
      out.write("                            <li><a href=\"#\">Wishlist</a></li>\n");
      out.write("                            <li><a href=\"#\">Track My Order</a></li>\n");
      out.write("                            <li><a href=\"#\">Help</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /container -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /top footer -->\n");
      out.write("\n");
      out.write("    <!-- bottom footer -->\n");
      out.write("    <div id=\"bottom-footer\" class=\"section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                    \n");
      out.write("                    <span class=\"copyright\">\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                        Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This shop is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://www.facebook.com/ggiang312001\" target=\"_blank\">Phạm Minh Giang</a>\n");
      out.write("                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                    </span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /container -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /bottom footer -->\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- /FOOTER -->\n");
      out.write("\n");
      out.write("        <!-- jQuery Plugins -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/slick.min.js\"></script>\n");
      out.write("        <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <a href=\"#\"><i class=\"fa fa-user-o\"></i>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" |</a>\n");
        out.write("                        <a href=\"logout\"> Logout</a>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <a href=\"login\"><i class=\"fa fa-user-o\"></i>Login | </a>\n");
        out.write("                        <a href=\"regist\">Registration</a>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("o");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"qty\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                        <div class=\"product-widget\">\n");
          out.write("                                            <div class=\"input-number price-max\">\n");
          out.write("                                                <div class=\"product-img\">\n");
          out.write("                                                    <img src=\"./img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                                </div>\n");
          out.write("\n");
          out.write("                                                <div class=\"product-body\">\n");
          out.write("                                                    <h3 class=\"product-name\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.getDes()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                    <h4 class=\"product-price\"><span class=\"qty\">x");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                </div>\n");
          out.write("\n");
          out.write("                                                <span class=\"qty-up\"><a href=\"process?num=1&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">+</a></span>\n");
          out.write("                                                <span class=\"qty-down\"><a href=\"process?num=-1&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">-</a></span>\n");
          out.write("\n");
          out.write("                                                <form action=\"process\" method=\"post\">\n");
          out.write("                                                    <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                                    <input class=\"delete\" type=\"submit\" value=\"x\"/>\n");
          out.write("                                                </form>\n");
          out.write("\n");
          out.write("                                                <hr/>\n");
          out.write("                                            </div>\n");
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("category");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <h5><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listTechnology}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("technology");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <h5><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${technology.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listBrand}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("brand");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <h5><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brand.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listSize}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("size");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <h5><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("p");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <!-- product -->\n");
          out.write("                                            <div class=\"product\">\n");
          out.write("                                                <div class=\"product-img\">\n");
          out.write("                                                    <img src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                                    <div class=\"product-label\">\n");
          out.write("                                                        <!--<span class=\"sale\">-30%</span>-->\n");
          out.write("                                                        <span class=\"new\">NEW</span>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"product-body\">\n");
          out.write("                                                    <p class=\"product-category\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getCate_id().toUpperCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    <h3 class=\"product-name\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getDes()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                    <h3 class=\"product-name\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                    <h4 class=\"product-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("K <del class=\"product-old-price\">$1000</del></h4>\n");
          out.write("                                                    <div class=\"product-rating\">\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <div class=\"product-btns\">\n");
          out.write("                                                        <button class=\"add-to-wishlist\"><i class=\"fa fa-heart-o\"></i><span class=\"tooltipp\">add to wishlist</span></button>\n");
          out.write("                                                        <button class=\"add-to-compare\"><i class=\"fa fa-exchange\"></i><span class=\"tooltipp\">add to compare</span></button>\n");
          out.write("                                                        <button class=\"quick-view\"><i class=\"fa fa-eye\"></i><span class=\"tooltipp\">quick view</span></button>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"add-to-cart\">\n");
          out.write("                                                    <button class=\"add-to-cart-btn\"><i class=\"fa fa-shopping-cart\"></i> add to cart</button>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <!-- /product -->\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVar("p");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <!-- product -->\n");
          out.write("                                            <div class=\"product\" >\n");
          out.write("                                                <div class=\"product-img\">\n");
          out.write("                                                    <img src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                                    <div class=\"product-label\">\n");
          out.write("                                                        <!--<span class=\"sale\">-30%</span>-->\n");
          out.write("                                                        <span class=\"new\">HOT</span>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"product-body\">\n");
          out.write("                                                    <p class=\"product-category\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getCate_id().toUpperCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    <h3 class=\"product-name\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getDes()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                    <h3 class=\"product-name\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\n");
          out.write("                                                    <h4 class=\"product-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("K <del class=\"product-old-price\">$1000</del></h4>\n");
          out.write("                                                    <div class=\"product-rating\">\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                        <i class=\"fa fa-star\"></i>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <div class=\"product-btns\">\n");
          out.write("                                                        <button class=\"add-to-wishlist\"><i class=\"fa fa-heart-o\"></i><span class=\"tooltipp\">add to wishlist</span></button>\n");
          out.write("                                                        <button class=\"add-to-compare\"><i class=\"fa fa-exchange\"></i><span class=\"tooltipp\">add to compare</span></button>\n");
          out.write("                                                        <button class=\"quick-view\"><i class=\"fa fa-eye\"></i><span class=\"tooltipp\">quick view</span></button>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"add-to-cart\">\n");
          out.write("                                                    <button class=\"add-to-cart-btn\"><i class=\"fa fa-shopping-cart\"></i> add to cart</button>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <!-- /product -->\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }
}
