package com.yasas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.repository.Query;
import com.yasas.model.Student;
import com.yasas.services.*;
import com.yasas.*;
import com.yasas.dto.StuDeptDto;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.repository.Query;
//import com.yasas.model.Student;
import com.yasas.services.*;
//import com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.DeptEmpDto;
//import com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.DeptEmpDto;
import com.yasas.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.yasas.dto.StuDeptDto;
import com.yasas.model.Student;
@Repository
public interface DepartmentRepository extends JpaRepository<Student, Integer> {

	  @Query("SELECT new com.yasas.dto.StuDeptDto(s.id, s.firstname, s.lastname,s.rollno, d.description) "
				+ "FROM Student s INNER JOIN s.departments d")
	List<StuDeptDto> fetchEmpDeptDataInnerJoin();
	

	 
}