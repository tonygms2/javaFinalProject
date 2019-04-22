package com.ulab.main;


public class Course {
	private int courseID;
	private String courseDescription;
	private String courseName;
	private int courseSection;
	
	
	public Course(int courseID,String courseName,String courseDescription,int courseSection) {
		this.courseID = courseID;
		this.courseDescription = courseDescription;
		this.courseName = courseName;
		this.courseSection = courseSection;
	}
	public Course() {
		
	}
	
}
