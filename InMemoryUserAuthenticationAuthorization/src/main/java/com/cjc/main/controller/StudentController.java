package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.fasterxml.jackson.annotation.JsonAnyGetter;

@RestController
public class StudentController {
	
	private List<Student> students=new ArrayList<>();

	@GetMapping("/expose_students")
	public List<Student> allStudents()
	{
		return this.students;
	}
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/add_student")
	public Student addStudent(@RequestBody Student student)
	{
		students.add(student);
		return student;
	}
}
