package com.javatipsandinterview.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "username", length = 30)
	private String userName;

	@Column(name = "firstname", length = 30)
	private String firstName;

	@Column(name = "lastname", length = 30)
	private String lastName;

	@Column(name = "rollnumber")
	private String rollNumber;

	@Column(name = "age")
	private String age;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentModel [Id=" + id + ", username=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", rollNumber=" + rollNumber + ", age=" + age + "]";
	}
}
