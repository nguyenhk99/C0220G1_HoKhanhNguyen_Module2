<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/4/2020
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<c:if test="${viewProducts!= null}">
<table>
    <tr>
        <td>Name: </td>
        <td>${viewProducts.getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${viewProducts.getPrice()}</td>
    </tr>
</table>
</c:if>
<table>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>Name: </td>
            <td>${product.getName()}</td>
        </tr>
        <tr>
            <td>Price: </td>
            <td>${product.getPrice()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
