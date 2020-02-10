<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spf" %>
<%@ include file="AdminHeader.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Enter Product Details</h2>
  <spf:form action="carryproduct" method="post" modelAttribute="proList">
    <div class="form-group">
      <label for="id">Product Id:</label>
      <spf:input type="text" class="form-control" id="id" placeholder="Enter Product Id" path="proId"/>
    </div>
    <div class="form-group">
      <label for="name">Product Name:</label>
      <spf:input type="text" class="form-control" id="name" placeholder="Enter Product Name" path="proName"/>
    </div>
    <div class="form-group">
      <label for="des">Product Description:</label>
      <spf:input type="text" class="form-control" id="des" placeholder="Enter Product Description" path="proDescription"/>
    </div>
    <div class="form-group">
      <label for="pp">Product Price:</label>
      <spf:input type="text" class="form-control" id="pp" placeholder="Enter Product Price" path="proPrice"/>
    </div>
    
    
    
    <button type="submit" class="btn btn-primary">Submit</button>
  </spf:form>
</div>

</body>
</html>