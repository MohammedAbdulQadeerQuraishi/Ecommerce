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
  <h2>Login Here</h2>
  <spf:form action="carryuserlog" method="post" modelAttribute="userd">
    <div class="form-group">
      <label for="un">User Name:</label>
      <spf:input type="text" class="form-control" id="un" placeholder="Enter UserName" path="UserName"/>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <spf:input type="password" class="form-control" id="pwd" placeholder="Enter password" path="password"/>
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
  </spf:form>
</div>

</body>
</html>
