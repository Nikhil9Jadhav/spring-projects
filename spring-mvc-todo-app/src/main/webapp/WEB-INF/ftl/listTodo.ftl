<html>
<head>
<title>Todos for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>

<body>

<div class="container">

	<h1> Welcome ${name}. </h1>
	<hr/>

  <table class="datatable table table-striped">
  <caption> Your Todos are </caption>
  <thead> 
	  <tr>
	  	<th>Description</th> 
	  	<th>Target Date</th>
	  	<th>Is Completed?</th>
	  </tr>
  </thead>
  
  <tbody>
	  	<#list todos as todo>
			  <tr>
			  	<td>${todo.desc}</td> 
			  	<td>${todo.targetDate?date}</td>
			  	<td>${todo.done?c}</td>
			  	<td> <a href="show-update?id=${todo.id}" class="btn btn-success">UPDATE</a> </td>
			  	<td> <a href="delete?id=${todo.id}" class="btn btn-danger">DELETE</a> </td>
			  <tr>
	  	</#list>
  </tbody>
  
  	
  </table>

  <div>
  		<a class="btn btn-success" href="/spring-mvc/show-addtodo"> Add Todo </a>
  </div>
  
  </div>
  
  <!-- JS Resource-->
  	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  </body>
  </html>