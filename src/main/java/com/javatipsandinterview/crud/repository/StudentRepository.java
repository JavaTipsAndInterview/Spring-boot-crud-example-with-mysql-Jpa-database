package com.javatipsandinterview.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatipsandinterview.crud.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

}
