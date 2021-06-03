package com.yasas.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.roytuts.spring.data.jpa.left.right.inner.cross.join.repository.DepartmentRepository;
//import com.roytuts.spring.data.jpa.left.right.inner.cross.join.repository.EmployeeRepository;
import com.yasas.model.Student;
import com.yasas.repository.StudentRepository;
import com.yasas.repository.DepartmentRepository;
//import com.yasas.dto.DeptEmpDto;
import com.yasas.dto.StuDeptDto;

@Service
@Transactional
public class StudentServiceImplementation implements StudentService {

	/*
	 * @Autowired StudentRepository studentRepository;
	 */
	@Resource
	public DepartmentRepository departmentRepository;

	@Resource
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}
	public List<StuDeptDto> getDeptEmployeesInnerJoin() {
		List<StuDeptDto> list = departmentRepository.fetchEmpDeptDataInnerJoin();
		list.forEach(l -> System.out.println(l));
		return list;
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

}
