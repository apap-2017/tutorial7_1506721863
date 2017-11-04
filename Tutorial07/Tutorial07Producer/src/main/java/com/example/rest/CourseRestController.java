package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CourseModel;
import com.example.service.StudentService;

@RestController
@RequestMapping("/rest")
public class CourseRestController
{
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/course/view/{id_course}")
	public CourseModel view (@PathVariable(value = "id_course") String id_course) {
		CourseModel course = studentService.selectCourse(id_course);
		return course;
	}
}
