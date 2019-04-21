package com.ulab.student;

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
	public String getDetail() {
		return String.format("%s-%d : %s section: %d",this.courseName,this.courseID,this.courseDescription,this.courseSection);
	}
	
	
}
