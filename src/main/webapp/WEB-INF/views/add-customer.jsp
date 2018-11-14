<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Customer</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-5cy8WdlNAGqQwyB33aLiqJoRQQxZsc3TDUkSTahHAx2gMK3o0te7Xqm+nNLe4Ou3"
	crossorigin="anonymous">
	
	<link rel="stylesheet" href="main.css">
</head>
<body>
<div class="container">
<h1>Add Customer</h1>
	<form action="/newcustomer" method="post">
		ID: <input type="text" name="customerId" value="customerId"><br> 
		Name: <input type="text" name="contactName"><br>
		Address: <input type="text" name="address"><br>
		City: <input type="text" name="city"><br>
		Phone: <input type="text" name="phone"><br>
		<input class="btn btn-primary" type="submit" value="Add">
	</form>
</div>
</body>
</html>