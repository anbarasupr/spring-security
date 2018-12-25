<html>

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
	margin: 4px 2px;
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
</head>
<body>
	<%
		if (request.getParameter("logoff") != null) {
			session.invalidate();
			//response.sendRedirect("index.jsp");
			//return;
		}
	%>

	<h2>ENTRY PAGE LAUNCH</h2>
	<h3>
		Session :
		<%=request.getSession().getId()%></h3>

<div>
	<a href="home"><button class="button">Home</button></a>
	<a href="services"><button class="button">Services</button></a>
	<a href="appointments"><button class="button button2">Appointments</button></a>
	<a href="create-appointment"><button class="button button3">Create Appointment</button></a>
	<a href="schedule-appointment"><button class="button button4">Schedule Appointment</button></a>
	<a href="signin"><button class="button button5">Sign In</button></a>
	<a href="signup"><button class="button button3">Sign Up</button></a>
</div>
	
</html>
