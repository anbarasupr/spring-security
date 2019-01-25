<%@ page session="false" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CREATE APPOINTMENTS</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h2>CREATE APPOINTMENTS PAGE</h2>
	<div class="continer" style="width: 60%">
		<form action="auto/save">
			<div class="form-group">
				<label for="pwd">Make:</label> <input type="make"
					class="form-control" name="make">
			</div>
			<div class="form-group">
				<label for="pwd">Model:</label> <input type="model"
					class="form-control" name="model">
			</div>
			<div class="form-group">
				<label for="pwd">Year:</label> <input type="year"
					class="form-control" name="year">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<%@ include file="logoff.jsp"%>
</body>
</html>