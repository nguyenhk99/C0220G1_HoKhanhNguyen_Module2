<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: TECHNOLOGY
  Date: 15/05/2020
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator">
    <input type="text" name="num1"  placeholder="Enter num1: ">
    <input type="text" name="num2"  placeholder="Enter num2: "><br>
    <input type="submit" name="button" value="Addition(+)">
    <input type="submit" name="button" value="Subtraction(-)">
    <input type="submit" name="button" value="Multiplication(*)">
    <input type="submit" name="button" value="Division(/)">
</form>
<c:if test="${result!=null}">
<h1><c:out value="Result Division: ${result}"></c:out></h1>
</c:if>
</body>
</html>
