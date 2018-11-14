<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-5cy8WdlNAGqQwyB33aLiqJoRQQxZsc3TDUkSTahHAx2gMK3o0te7Xqm+nNLe4Ou3"
	crossorigin="anonymous">
	
	<link rel="stylesheet" href="main.css">
</head>
<body>
<div class="container">
<h1>Update Customer</h1>
	<form action="/update-customer" method="post">
		ID: ${id }<br> <input type="hidden" name="id" value="${id }"> 
		Name: <input type="text" name="contactName"><br>
		Address: <input type="text" name="address"><br>
		City: <input type="text" name="city"><br>
		Phone: <input type="text" name="phone"><br> 
		<input class="btn btn-primary" type="submit" value="Add">
	</form>
</div>

</body>
</html>