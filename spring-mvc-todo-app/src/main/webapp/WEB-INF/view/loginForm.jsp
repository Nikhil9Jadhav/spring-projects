<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
<title>Login Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

<div class="container fluid">

		<h1>
			<center>Todo App Login Page</center>
		</h1>
		<hr />
    
	<form action="/spring-mvc/login" method="post">
			
		<div class="form-row">
			<div style="color: red">${errorMessage}</div>
			<div class="form-group col-md-6">
				<label for="formGroupExampleInput">User Name</label> <input
					type="text" name="name" class="form-control" placeholder="username">
			</div>
			<div class="form-group col-md-6">
				<label for="formGroupExampleInput">Password</label> 
				<input type="password" name="password" class="form-control" placeholder="password">
			</div>
		</div>
		
		<div class="form-row">
		<div class="form-group col-md-6">
			<button type="submit" class="btn btn-success">Submit</button>
		</div>
		</div>
	</form>
	
</div>
	<!-- JS Resource-->
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>