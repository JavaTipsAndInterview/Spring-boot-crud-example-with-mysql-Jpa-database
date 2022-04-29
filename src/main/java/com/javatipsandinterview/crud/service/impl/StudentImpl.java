package com.javatipsandinterview.crud.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatipsandinterview.crud.model.StudentModel;
import com.javatipsandinterview.crud.repository.StudentRepository;
import com.javatipsandinterview.crud.service.StudentService;

@Service
public class StudentImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public StudentModel findById(Long id) {
		// TODO Auto-generated method stub
		Optional<StudentModel> student = studentRepo.findById(id);
		if (student.isPresent()) {
			return student.get();
		}

		return null;

	}

	@Override
	public List<StudentModel> list() {

		return studentRepo.findAll();
	}

	@Override
	public boolean deleteStudent(Long id) {
		Optional<StudentModel> student = studentRepo.findById(id);
		if (student.isPresent()) {
			studentRepo.delete(student.get());
			return true;
		}
		return false;
	}

	@Override
	public StudentModel update(StudentModel student) {
		Optional<StudentModel> studentTemp = studentRepo.findById(student.getId());
		if (studentTemp.isPresent()) {
			StudentModel s = studentTemp.get();
			s.setAge(student.getAge());
			s.setFirstName(student.getFirstName());
			s.setLastName(student.getLastName());
			s.setRollNumber(student.getRollNumber());
			s.setUserName(student.getUserName());

			studentRepo.save(s);
			return s;
		}
		return null;
	}

	@Override
	public StudentModel save(StudentModel student) {
		return studentRepo.save(student);
	}

}
