<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<%
		if (request.getParameter("logoff") != null) {
			session.invalidate();
			response.sendRedirect("/springsecurity-post-login/home");
			return;
		}
	%>
	<div class="container-fluid">
	<%@ include file="header.jsp"%>
	<h2>HOME PAGE LAUNCH</h2>
	<%@ include file="logoff.jsp"%>	
	</div>
</body>
</html>
