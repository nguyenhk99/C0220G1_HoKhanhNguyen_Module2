<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TECHNOLOGY
  Date: 09/05/2020
  Time: 11:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action = "/calculator.jsp" >
    <label>Product Description</label>
    <input type="text" name = "productDescription" placeholder="Product Description"><br>
    <label>List Price</label>
    <input type="text" name = "listPrice" placeholder="List Price"><br>
    <label>Discount Percent</label>
    <input type="text" name = "discountPercent" placeholder="Discount Percent"><br>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
