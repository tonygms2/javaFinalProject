package com.ulab.main;
import java.lang.System;


public class Student extends StudentTeacherCommonAttr {
	private String studentName = null;
	private String studentDepartment = null;

	public Student(String studentName,String StudentDepartment,gender Gender) {
		this.studentDepartment = studentDepartment;
		this.studentName = studentName;
		super.Gender = Gender;
	}
	public Student() {
		
	}
	gender ShowGender() {
		return super.Gender;
	}
	
	
}
