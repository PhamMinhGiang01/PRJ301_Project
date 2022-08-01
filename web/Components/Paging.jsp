<%-- 
    Document   : Paging
    Created on : Mar 8, 2022, 12:58:33 AM
    Author     : Pham Minh Giang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="store-pagination">
    <li>
        <a href="products?page=${page-1}"><i class="fa fa-angle-left"></i></a>
    </li>
    <c:forEach begin="1" end="${requestScope.numpage}" var="i">
        <li class=" ${i==page?"active":""}"><a href="products?page=${i}">${i}</a></li>
    </c:forEach>
    <li>
        <a href="products?page=${page+1}"><i class="fa fa-angle-right"></i></a>
    </li>
</ul>
