<%@ page session="false" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>APPOINTMENTS</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<h2>APPOINTMENTS PAGE</h2>
	<div class="container">
		<h2>Small Table</h2>
		<p>The .table-sm class makes the table smaller by cutting cell
			padding in half:</p>
		<table class="table table-bordered table-sm">
			<thead>
				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>John</td>
					<td>Doe</td>
					<td>john@example.com</td>
				</tr>
				<tr>
					<td>Mary</td>
					<td>Moe</td>
					<td>mary@example.com</td>
				</tr>
				<tr>
					<td>July</td>
					<td>Dooley</td>
					<td>july@example.com</td>
				</tr>
			</tbody>
		</table>
	</div>

	<%@ include file="logoff.jsp"%>
</body>
</html>