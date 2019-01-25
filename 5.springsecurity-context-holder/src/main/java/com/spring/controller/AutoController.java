package com.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.entity.AutoUser;
import com.spring.model.Course;
import com.spring.repository.AutoUserRepository;
import com.spring.service.CustomUserDetailsService;
import com.spring.service.StudentService;
import com.spring.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/auto")
public class AutoController {

	@Autowired
	private CustomUserDetailsService service;
	
	@Autowired
	private UserService	userService;
	
	@ResponseBody
	@RequestMapping(value = "/users/{username}", method = RequestMethod.GET)
	public List<Map<String, Object>> getUserList(@PathVariable String username) {
		return userService.getUserList(username);
	}
	
	@ResponseBody
	@RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
	public AutoUser getUser(@PathVariable String username) {
		return userService.getUser(username);
	}
	
	@ResponseBody
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public int saveAppointment(@RequestParam String make,@RequestParam String model,@RequestParam String year) {
		Map<String, Object> parameters = new HashMap<String, Object>();
	    //parameters.put("appointmentId", emp.getId());
	    parameters.put("make", make);
	    parameters.put("model", model);
	    parameters.put("year", year);
	    parameters.put("appointmentDt", null);
	    parameters.put("status", "pending");
	    return userService.saveAppointment(parameters);
	}
	
	@ResponseBody
	@RequestMapping(value = "/saveReturn", method = RequestMethod.GET)
	public long saveAppointmentAndReturnKey(@RequestParam String make,@RequestParam String model,@RequestParam String year) {
		Map<String, Object> parameters = new HashMap<String, Object>();
	    //parameters.put("appointmentId", emp.getId());
	    parameters.put("make", make);
	    parameters.put("model", model);
	    parameters.put("year", year);
	    parameters.put("appointmentDt", null);
	    parameters.put("status", "initial");
	    return userService.saveAppointmentAndReturnKey(parameters);
	}
	
	
}
