<html>
<head>

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

</head>
<body>
	<h3>
		Session :
		<%=request.getSession().getId()%></h3>
	<div>
		<a href="/springsecurity-custom-form-login/services"><button class="button">Services</button></a>
		<a href="/springsecurity-custom-form-login/create-appointment"><button class="button button3">Create Appointment</button></a>
		<a href="/springsecurity-custom-form-login/view-appointments"><button class="button button2">View Appointments</button></a>
		<a href="/springsecurity-custom-form-login/schedule/appointment"><button class="button button4">Schedule Appointment</button></a>
		<a href="/springsecurity-custom-form-login/signin"><button class="button button5">Sign in</button></a>
		<a href="/springsecurity-custom-form-login/register"><button class="button button3">Register</button></a>
	</div>
</body>
</html>