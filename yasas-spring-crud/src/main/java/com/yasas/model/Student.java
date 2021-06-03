package com.yasas.model;

import javax.persistence.*;

import com.yasas.model.*;

import java.util.List;
import java.util.Set;

@Entity
//@Table(name = "student")
@Table(name = "student")
public class Student {

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="id")
	 private int id;
	 
	 @Column(name="firstname")
	 private String firstname;
	 
	 @Column(name="lastname")
	 private String lastname;
	 
	 @Column(name="rollno")
	 private Integer rollno;
	 
	 //@OneToOne(targetEntity = Student.class,cascade = CascadeType.ALL)
	//getters and setters
		/*
		 * @OneToOne(fetch = FetchType.LAZY, mappedBy = "student") public Student
		 * student;
		 * 
		 * 
		 * public Student getStudent() { return student; }
		 * 
		 * public void setStudent(Student student) { this.student = student; }
		 */
		@OneToMany(targetEntity = Department.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
		private Set<Department> departments;
	
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	
	 
	}