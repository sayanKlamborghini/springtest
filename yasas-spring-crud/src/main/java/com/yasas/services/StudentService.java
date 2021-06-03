package com.yasas.services;

import java.util.List;

import com.yasas.dto.StuDeptDto;
import com.yasas.model.Student;

public interface StudentService {

	
	 public List<Student> getAllStudents();
	 public List<StuDeptDto> getDeptEmployeesInnerJoin();
	 
	 public Student getStudentById(int id);
	 
	 public void addStudent(Student student);
	 
	 public void deleteStudent(int id);
	

}