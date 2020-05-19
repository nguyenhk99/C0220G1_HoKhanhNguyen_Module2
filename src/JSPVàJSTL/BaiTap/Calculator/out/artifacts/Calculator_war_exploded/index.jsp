<%--
  Created by IntelliJ IDEA.
  User: TECHNOLOGY
  Date: 11/05/2020
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/calculateServlet">
    <h1>Simple Calculator</h1>
    <h3>Calculator</h3>
    <table>
      <tr><span>First operand:</span>
        <input type="text" name="firstOperator" placeholder="0">
      </tr>
      <tr> <br>
        <span>Operator:</span>
        <select name="calculator">
          <option value="+">Cộng</option>
          <option value="-">Trừ</option>
          <option value="*">Nhân</option>
          <option value="/">Chia</option>
        </select>
      </tr>
     <tr>
       <br>
       <span>Second operand: </span>
       <input type="text" name="secondOperator" placeholder="0">
     </tr>
    </table>
    <input type="submit">
  </form>
  </body>
</html>
