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
			response.sendRedirect("index.jsp");
			return;
		}
	%>

	<h2>INDEX PAGE LAUNCH</h2>
	<h3>
		Session :
		<%=request.getSession().getId()%></h3>

	<a href="home"><button class="button">Home</button></a>
	<a href="admin"><button class="button button2">Admin</button></a>
	<a href="student"><button class="button button5">Student</button></a>
</html>
