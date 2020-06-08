<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" ; charset=UTF-8">
<title>File Upload</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<div class="container">

		<h1>Upload File Utility</h1>
		<hr />
	
		<form action="/spring-mvc/uploadFile" method="post" enctype="multipart/form-data">
			<table class = "table table-striped">
				<tr>
					<td>Description</td>
					<td> <input type="text" name="description" size="50"> </td>
				</tr>
				
				<tr>
					<td>Pick File #1</td>
					<td> <input type="file" name="fileUpload" size="50"> </td>
				</tr>
				
				<tr>
					<td>Pick File #2</td>
					<td> <input type="file" name="fileUpload" size="50"> </td>
				</tr>
			</table>
			<div>
				<input type="submit" value="Upload" class="btn btn-success" />
			</div>
		</form>
</div>

  <!-- JS Resource-->
  	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>