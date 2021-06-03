package com.yasas.dto;

public class StuDeptDto {

	private int id;
	private String firstname;
	private String lastname;
	private int rollno;
	private String description;
	public StuDeptDto(int id, String firstname, String lastname, int rollno, String description) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.rollno = rollno;
		this.description = description;
	}
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}