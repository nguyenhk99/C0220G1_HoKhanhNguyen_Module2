<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: TECHNOLOGY
  Date: 11/05/2020
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<label>Product Description</label>
<span type="text" id = "productDescription"></span><br>
<label>List Price</label>
<span type="text" id = "listPrice"></span><br>
<label>Discount Percent</label>
<span type="text" id = "discountPercent" ></span><br>
<label>Discount Amount</label>
<span type="text" id = "discountAmount" ></span><br>
<label>Discount Price</label>
<span type="text" id = "discountPrice"></span><br>


<script>
    <%
String productDescription = request.getParameter("productDescription");
float price = Float.parseFloat(request.getParameter("listPrice"));
float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
double discountAmount = price*discountPercent*0.01;
double discountPrice = price-discountAmount;
%>
    document.getElementById("productDescription").innerText = "<%=productDescription%>"
    document.getElementById("listPrice").innerText = <%=price%>document.getElementById("discountPercent").innerText = "<%=discountPercent%>%"
                document.getElementById("discountAmount").innerText = <%=discountAmount%>
                    document.getElementById("discountPrice").innerText = <%=discountPrice%>
</script>
</body>
</html>
