<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x" %>
<%@ include file="AdminHeader.jsp" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<table border="5">
<tr>
<th>Product ID</th>
<th>Product Name</th>
<th>Product Description </th>
<th>Product Price</th>
</tr>

<x:forEach items="${proList}" var="pro">
<tr>
<td>${pro.proName}</td>
<td>${pro.proName}</td>
<td>${pro.proDescription}</td>
<td>${pro.proPrice}</td>
</tr>
</x:forEach>

</table>
</body> 
</html>