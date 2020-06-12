<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Show All Locations</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>

<div class="container">

	<h1> Locations </h1>
	<hr/>

	<table class="datatable table table-striped">
	<caption> Locations are as follows </caption>
	 <thead> 
	    <tr>
	        <th>Id</th>
	        <th>Name</th>
	        <th>Code</th>
	        <th>Type</th>
	    </tr>
	 </thead>
	 <tbody>
	    <c:forEach items="${locationsList}" var="location">
	        <tr>
	            <td><c:out value="${location.id}"/></td>
	            <td><c:out value="${location.name}"/></td>
	            <td><c:out value="${location.code}"/></td>
	            <td><c:out value="${location.type}"/></td>
	            <td><a href="deleteLoc?id=${location.id}">Delete</a></td>
	            <td><a href="showUpdate?id=${location.id}">Edit</a></td>
	        </tr>
	    </c:forEach>
	 </tbody>
</table>

	<div>
		<a class="btn btn-success" href="showCreate">Add New Location</a>
	</div>

</div>
<!-- JS Resource-->
  	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>