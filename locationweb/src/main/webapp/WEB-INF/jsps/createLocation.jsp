<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<head>
    <title>Update Location JSP</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>

<div class="container>

		<div id="newLocationBox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">

			<div class="panel panel-info" >

				<div class="panel-heading">
                      <div class="panel-title">Add Location</div>
                </div>  

				<div style="padding-top:30px" class="panel-body" >
	
					<form id="addLocForm" class = "form-horizontal" action="saveLoc" method="post">

						<div style="margin-bottom: 25px" class="input-group">
							<input id="locId" type="text" class="form-control" name="id" placeholder="Enter Id" required/>
						</div>
						<div style="margin-bottom: 25px" class="input-group">
							<input id="locName" type="text" class="form-control" name="name" placeholder="Enter Location Name" required/>
						</div>
						<div style="margin-bottom: 25px" class="input-group">
							<input id="locCode" type="text" class="form-control" name="code" placeholder="Enter Location Code" required/>
						</div>
						<div class="input-group">
							<div class="radio">
 								<label><input type="radio" name="type" value = "URBAN" checked>URBAN</label>
							</div>
							<div class="radio">
 								<label><input type="radio" name="type" value = "RURAL" >RURAL</label>
							</div>
						</div>
						
						<div style="margin-top:10px" class="form-group">
                                    <!-- Button -->
                                    <div class="col-sm-12 controls">
                                      <input type="submit" class="btn btn-success" value="Submit" />
                                      <input type="reset" class="btn btn-primary" value="Reset" />
                                    </div>
                        </div>
                        
					</form>
		
					<div>
						${msg}
	    			</div>
	    			<!-- Redirects to display locations list -->
    				<a href="displayLoc">Show All Locations</a>
		
				</div> <!--  Panel body ends -->
	
			</div> <!-- Panel info ends-->
	
		</div> <!-- newLocation Box ends-->

</div> <!-- Container Div ends -->

<!-- JS Resource-->
  	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>