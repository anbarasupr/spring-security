<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Web Security login Example (Authentication for Protected Pages)</h2>
	<br>
	<br>
	<h3>Session : <%=request.getSession().getId() %></h3>
	<form action="/springsecurity-user-details-service/login" method="POST">
		Enter username :<input type="text" name="custom_username"> <br><br>
		Enter password :<input type="password" name="custom_password"><br><br>
		<sec:csrfInput/>
		<input type="submit" value="Login">
	</form>
	<c:if test="${param.error !=null}">
		<h3>Authentication Error</h3>
		<h4>Pls supply correct username and password</h4>
	</c:if>
	<c:if test="${param.logout !=null}">
		<h3>You have been successfully logout</h3>
 	</c:if>
</body>
</html>