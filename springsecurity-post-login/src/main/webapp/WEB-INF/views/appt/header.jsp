<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<script type="text/javascript">
function logout(){
	event.preventDefault();
	document.getElementById('logout-form').submit();
}
</script>
<style>
.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 2px 2px;
	cursor: pointer;
}

.button2 {
	background-color: #008CBA;
} /* Blue */
.button3 {
	background-color: #f44336;
} /* Red */
.button4 {
	background-color: #e7e7e7;
	color: black;
} /* Gray */
.button5 {
	background-color: #555555;
} /* Black */
</style>
<link href="/springsecurity-post-login/resources/static/css/bootstrap.css" rel="stylesheet" type="text/css">

</head>
<body>
	<h3>
		Session :
		<%=request.getSession().getId()%></h3>
	<div>
		<a href="/springsecurity-post-login/services"><button class="button">Services</button></a>
		<a href="/springsecurity-post-login/create-appointment"><button class="button button3">Create Appointment</button></a>
		<a href="/springsecurity-post-login/view-appointments"><button class="button button2">View Appointments</button></a>
		<a href="/springsecurity-post-login/schedule/appointment"><button class="button button4">Schedule Appointment</button></a>
		
		<!-- show signin based user authentication - conditionally -->
		<sec:authorize access="authenticated" var="authenticated"/>
		<c:choose>
			<c:when test="${authenticated}">
				<span class="text-uppercase font-weight-bold">Welcome <sec:authentication property="name"/> </span>
				<a href="#" id="logout" onclick="logout()"><button class="button button3">Logout</button></a>
				<form id="logout-form" action="/springsecurity-post-login/logout" method="POST">
					<sec:csrfInput/>
				</form>
			</c:when>
			<c:otherwise>
				<a href="/springsecurity-post-login/login"><button class="button button5">Sign in</button></a>
				<a href="/springsecurity-post-login/register"><button class="button button3">Register</button></a>
			</c:otherwise>
		</c:choose>
		
	</div>
</body>
</html>