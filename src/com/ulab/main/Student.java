package com.ulab.main;
import java.lang.System;


public class Student extends CommonAttributes {
	private String studentName ;
	private String studentDepartment;

	public Student(String studentName,String StudentDepartment,gender Gender) {
		this.studentDepartment = StudentDepartment;
		this.studentName = studentName;
		super.Gender = Gender;
	}
	
	public Student() {
	}
	
	
	void showStudentInfo() {
		System.out.println("Student name is : "+studentName+" from "+studentDepartment+" department who is "+ super.ShowGender());
		System.out.println("DOB: "+this.showDOB());
	}
	
	
	
}
