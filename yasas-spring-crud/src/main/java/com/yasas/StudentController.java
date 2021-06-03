package com.yasas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yasas.dto.StuDeptDto;
import com.yasas.model.Student;
import com.yasas.services.StudentService;

@RestController
@RequestMapping(value="/student", method = { RequestMethod.GET, RequestMethod.POST })
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	 @RequestMapping(value="/list", method = { RequestMethod.GET, RequestMethod.POST })
	 //@GetMapping("/student/list")
	public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("student_list");
	  List<StuDeptDto> studentList = studentService.getDeptEmployeesInnerJoin();
	  model.addObject("studentList", studentList);
	  for (StuDeptDto stuDeptDto : studentList) {
		System.out.println(stuDeptDto.getId());
		System.out.println(stuDeptDto.getFirstname());
		System.out.println(stuDeptDto.getLastname());
		System.out.println(stuDeptDto.getRollno());	
		System.out.println(stuDeptDto.getDescription());		
	}
	  System.out.println(model.toString());
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addStudent/",method = { RequestMethod.GET, RequestMethod.POST })
	 //@GetMapping("/student/addStudent/")
	 public ModelAndView addStudent() {
		 
	  ModelAndView model = new ModelAndView();
	  Student student = new Student();
	  model.addObject("studentForm", student);
	  model.setViewName("student_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editStudent/{id}", method = { RequestMethod.GET, RequestMethod.POST })
	 //@GetMapping("/student/editStudent/{id}")
	 public ModelAndView editStudent(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  Student student = studentService.getStudentById(id);
	  model.addObject("studentForm", student);
	  model.setViewName("student_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addStudent", method = { RequestMethod.GET, RequestMethod.POST })
	 //@PostMapping("/student/addStudent")
	 public ModelAndView add(@ModelAttribute("studentForm") Student student) {
		 
	  studentService.addStudent(student);
	  return new ModelAndView("redirect:/student/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteStudent/{id}", method = { RequestMethod.GET, RequestMethod.POST })
	 //@GetMapping("/student/deleteStudent/{id}")
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  studentService.deleteStudent(id);
	  return new ModelAndView("redirect:/student/list");
	  
	 }
}