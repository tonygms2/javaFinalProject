package com.ulab.main;

public class Faculty extends StudentTeacherCommonAttr {
	private String facultyName = null;
	private String facultDepartment = null;
	
	public Faculty(String facultyName,String facultyDepartment,gender Gender) {
		this.facultyName = facultyName;
		this.facultDepartment = facultyDepartment;
		super.Gender = Gender;
	}
	public Faculty() {
		
	}
}
