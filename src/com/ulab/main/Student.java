package com.ulab.main;
import java.lang.System;


public class Student extends CommonAttributes {
	private String studentName ;
	private String studentDepartment;
	private int ID;

	public Student(String studentName,int ID,String StudentDepartment,gender Gender) {
		this.studentDepartment = StudentDepartment;
		this.studentName = studentName;
		super.Gender = Gender;
		this.ID = ID;
	}
	
	public Student() {
	}
	
	
	void showStudentInfo() {
		try {
			System.out.println("Student name is : "+studentName+" of ID: "+ID+" from "+studentDepartment+" department who is "+ super.ShowGender());
			System.out.println("DOB: "+this.showDOB());
				if(getIeeInfo()==true) {
					System.out.println("Is a member of IEE Student Branch");
				}else{
					System.out.println("Is not a member of IEE Student Branch");
				}
				if(getComSocInfo()==true) {
					System.out.println("Is a member of Computer Society");
				}else{
					System.out.println("Is not a member of Computer Society");
				}
				
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("**********Set the DOB first for Faculty*********");
			System.out.println(e.toString());
		}
	}
	
	
	
}
