package com.javatipsandinterview.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatipsandinterview.crud.model.StudentModel;
import com.javatipsandinterview.crud.service.StudentService;

@RestController
public class AppController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String app() {
		return "hello world !";
	}

	@GetMapping("/id/{id}")
	public StudentModel findById(@PathVariable Long id) {
		return studentService.findById(id);
	}

	@GetMapping("/list")
	public List<StudentModel> studentList() {
		return studentService.list();
	}

	@PostMapping("/save")
	public StudentModel saveStudent(@RequestBody StudentModel studentModel) {
		return studentService.save(studentModel);
	}

	@PutMapping("/update")
	public StudentModel updateStudent(@RequestBody StudentModel studentModel) {
		return studentService.update(studentModel);
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteStudent(@PathVariable Long id) {
		return studentService.deleteStudent(id);
	}

}
