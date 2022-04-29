package com.javatipsandinterview.crud.service;

import java.util.List;

import com.javatipsandinterview.crud.model.StudentModel;

public interface StudentService {
	
	public StudentModel findById(Long id);
	public List<StudentModel> list();
	public boolean deleteStudent(Long id);
	public StudentModel update(StudentModel student);
	public StudentModel save(StudentModel student);
	

}
