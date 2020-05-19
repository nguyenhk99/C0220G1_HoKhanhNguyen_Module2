<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="DanhSach.DanhSachKhachHang" %><%--
  Created by IntelliJ IDEA.
  User: TECHNOLOGY
  Date: 11/05/2020
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      th{
        text-align-all: center;
      margin-bottom: auto;
      }
      h1{
        margin-top: 99px;
        margin-left: 38%;
      }
      table{
        margin-left: 37%;
        border-collapse: collapse;
      }

      table,tr,th,td{
        border: 2px solid black;
      }
      img{
        height: 85px;
        width: 100px;
      }
      tr{
        height: 50px;
        min-width: 200px;
      }
    </style>
  </head>
  <body>
  <%
    List<DanhSachKhachHang> danhSachKhachHang = new ArrayList<>();
      danhSachKhachHang.add(new DanhSachKhachHang("Mai Văn Hoàn","1983-08-20","Hà Nội","https://cafef.vcmedia.vn/Common/CEO/CEO_30676.1.png"));
    danhSachKhachHang.add(new DanhSachKhachHang("Nguyễn Văn Nam","1983-08-21","Bắc Giang","data:image/jpeg;base64,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"));
    danhSachKhachHang.add(new DanhSachKhachHang("Nguyễn Thái Hòa","1983-08-22","Nam Định","https://img.vietnamfinance.vn/webp-jpg/700x0/upload/news/hoangha/2018/11/1/vnf-nguyen-huu-thai-hoa-vnf.webp"));
    danhSachKhachHang.add(new DanhSachKhachHang("Trần Đăng Khoa","1983-08-17","Hà Tây","https://media.giaoducthoidai.vn/Uploaded/giangnth/2018-11-08/tran-dang-khoa-NEJT.jpg"));
    danhSachKhachHang.add(new DanhSachKhachHang("Nguyễn Đình Thi","1983-08-19","Hà Nội","https://www.thivien.net/attachment/MVnIg-RAK_2izWgt_Nsgkg.1124834195.jpg"));
    request.setAttribute("danhSach",danhSachKhachHang);
  %>

  <h1>Danh Sách Khách Hàng</h1>
  <table>
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa Chỉ</th>
      <th>Ảnh</th>
    </tr>
      <c:forEach var="danhSach" items="${danhSach}">
        <tr>
          <td><c:out value="${danhSach.ten}"></c:out></td>
          <td><c:out value="${danhSach.ngaySinh}"></c:out></td>
          <td><c:out value="${danhSach.diaChi}"></c:out></td>
          <td><img src="<c:out value="${danhSach.img}"></c:out>"></td>
        </tr>
      </c:forEach>
  </table>
  </body>
</html>
