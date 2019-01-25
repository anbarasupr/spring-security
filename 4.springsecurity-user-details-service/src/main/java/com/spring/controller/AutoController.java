package com.spring.controller;

import java.util.List;
import java.util.Map;

import com.spring.model.Course;
import com.spring.repository.AutoUserRepository;
import com.spring.service.CustomUserDetailsService;
import com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {

	@Autowired
	private CustomUserDetailsService service;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value = "/check/{username}", method = RequestMethod.GET)
	public UserDetails test(@PathVariable String username) {
		System.out.println("username::" + username);
		return service.loadUserByUsername(username);
	}
	
	@RequestMapping(value = "/jdbc/{username}", method = RequestMethod.GET)
	public List<Map<String, Object>> test1(@PathVariable String username) {
		System.out.println("username::" + username);
		return jdbcTemplate.queryForList("select * from autouser where username='"+username+"'");
	}
}
