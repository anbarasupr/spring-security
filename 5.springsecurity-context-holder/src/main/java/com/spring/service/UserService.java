package com.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.spring.entity.Appointment;
import com.spring.entity.AutoUser;
import com.spring.model.Course;
import com.spring.model.Student;
import com.spring.repository.AppointmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Component
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DataSource datasource;
	
	@Autowired
	private SimpleJdbcInsert simpleJdbcInsert;
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public List<Map<String, Object>> getUserList(String username) {
		System.out.println("getUserList username::" + username);
		return jdbcTemplate.queryForList("select * from autouser where username='"+username+"'");
	}
	
	public AutoUser getUser(String username) {
		System.out.println("getUser username::" + username);
		return jdbcTemplate.queryForObject("select * from autouser where username=?",new Object[] {username}, new BeanPropertyRowMapper<AutoUser>(AutoUser.class));
	}	
	
	public int saveAppointment(Map<String, Object> parameters) {
		System.out.println("saveAppointment Auth::" + SecurityContextHolder.getContext().getAuthentication());
	    parameters.put("userId", getUser(SecurityContextHolder.getContext().getAuthentication().getName()).getAutoUserId());
		System.out.println("saveAppointment parameters::" + parameters);
	    return simpleJdbcInsert.withTableName("appointment").execute(parameters);
	}
	
	public long saveAppointmentAndReturnKey(Map<String, Object> parameters) {
		System.out.println("saveAppointmentAndReturnKey Auth::" + SecurityContextHolder.getContext().getAuthentication());
	    parameters.put("userId", getUser(SecurityContextHolder.getContext().getAuthentication().getName()).getAutoUserId());
		System.out.println("saveAppointmentAndReturnKey parameters::" + parameters);
		Number id = new SimpleJdbcInsert(datasource).usingGeneratedKeyColumns("appointmentId").withTableName("appointment").executeAndReturnKey(parameters);
		System.out.println("Generated id - " + id.longValue());
	    return id.longValue();
	}
	
	
}
