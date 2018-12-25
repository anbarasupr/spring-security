package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/entry" }, method = RequestMethod.GET)
	public String start() {
		return "entry";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String services() {		
		return "services";
	}
	@RequestMapping(value = "/appointments", method = RequestMethod.GET)
	public String appointments() {		
		return "appointments";
	}
	@RequestMapping(value = "/create-appointment", method = RequestMethod.GET)
	public String createAppointment() {		
		return "create-appointment";
	}
	@RequestMapping(value = "/schedule-appointment", method = RequestMethod.GET)
	public String schedule() {		
		return "schedule-appointment";
	}
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signin() {		
		return "signin";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {		
		return "signup";
	}
}
