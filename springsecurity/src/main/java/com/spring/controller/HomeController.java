package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
		return "admin/admin";
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String student() {
		return "student/student";
	}
}
