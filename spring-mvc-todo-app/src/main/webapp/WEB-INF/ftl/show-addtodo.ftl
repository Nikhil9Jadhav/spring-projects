<html>
<head><title>ViralPatel.net - FreeMarker Hello World</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
	</head>
<body>

<div class="container">
	<h1> Add a todo </h1>
	<hr/>

	<form action="addtodo" method="post">
		<fieldset class="form-group">
		    <div class="col-auto">
		   		<label> Descrition </label>
				<input type = "text" name = "desc" required="true"  class="form-group" required="required"/>
			
			</div>
			
	     		<input class="btn btn-success" type="submit" value="Add">
	    </fieldset>	
	</form>
	
</div>
	<!-- JS Resource-->
  	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  </body>
  </html>