package com.ulab.main;

public class Faculty extends CommonAttributes {
	private String facultyName;
	private String facultDepartment;
	
	public Faculty(String facultyName,String facultyDepartment,gender Gender) {
		this.facultyName = facultyName;
		this.facultDepartment = facultyDepartment;
		super.Gender = Gender;
	}
	public Faculty() {
		
	}
	
	void showFacultyInfo() {
		System.out.println("Faculty name is : "+facultyName+" from "+facultDepartment+" department who is "+ super.ShowGender());
		System.out.println("DOB: "+this.showDOB());
	}
}
