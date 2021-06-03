package com.yasas.repository;

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
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	
	/*
	 * @Query(
	 * value="select student0_.id as ids, student0_.firstname as firstnam, student0_.lastname as lastnam, student0_.rollno as rollnumber from student student0_"
	 * ) //@OneToMany(fetch = FetchType.LAZY, mappedBy = "student") //public
	 * //List<Student> getAllStudents(); public ModelAndView list();
	 */
	  
	/*
	 * @Query("SELECT new com.yasas.dto.StuDeptDto(s.id, s.firstname, s.lastname,s.rollno, d.description) "
	 * + "FROM Student s INNER JOIN s.departments d") List<StuDeptDto>
	 * fetchEmpDeptDataInnerJoin();
	 */
	  //public ModelAndView list();		 
	  //List<Student> getAllStudents();
	  
}