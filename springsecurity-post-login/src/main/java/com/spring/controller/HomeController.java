package com.spring.controller;

import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = {"", "/", "/home" }, method = RequestMethod.GET)
	public String home() {
		return "appt/home";
	}
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String services() {		
		return "appt/services";
	}
	@RequestMapping(value = "/view-appointments", method = RequestMethod.GET)
	public String appointments() {		
		return "appt/view-appointments";
	}
	@RequestMapping(value = "/create-appointment", method = RequestMethod.GET)
	public String createAppointment() {		
		return "appt/create-appointment";
	}
	@RequestMapping(value = "/schedule/appointment", method = RequestMethod.GET)
	public String schedule() {		
		return "appt/schedule-appointment";
	}
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signin() {		
		return "signin";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {		
		return "login/login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {		
		return "register";
	}
}
