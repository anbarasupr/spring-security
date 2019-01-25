package com.spring.controller;

import java.util.List;

import com.spring.model.Course;
import com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/students/{studentId}/courses", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
		System.out.println("studentId::" + studentId);
		return studentService.retrieveCourses(studentId);
	}

	@RequestMapping(value = "/test{test}", method = RequestMethod.GET)
	public String test(@PathVariable String test) {
		System.out.println("test::" + test);
		return "Test HI : " + test;
	}
}
