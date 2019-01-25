package com.spring.controller;

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
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class SpringRestController {

	@Autowired
	private CustomUserDetailsService service;
	
	@Autowired
	private UserService	userService;

	@RequestMapping(value = "/load/user/{username}", method = RequestMethod.GET)
	public UserDetails loadUserByUsername(@PathVariable String username) {
		return service.loadUserByUsername(username);
	}
	
	@RequestMapping(value = "/users/{username}", method = RequestMethod.GET)
	public List<Map<String, Object>> getUserList(@PathVariable String username) {
		System.out.println("Auth::" + SecurityContextHolder.getContext().getAuthentication());
		System.out.println("Auth::" + SecurityContextHolder.getContext().getAuthentication().getDetails());
		return userService.getUserList(username);
	}
	
	@RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
	public AutoUser getUser(@PathVariable String username) {
		return userService.getUser(username);
	}
}
