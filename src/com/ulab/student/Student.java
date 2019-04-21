package com.ulab.student;

import java.util.*;

public class Student {
	String studentName;
	int studentId;
	ArrayList<Course> courseList = new ArrayList<Course>();
	public Student() {
		
	}
	public Student(String studentName,int studentId) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	public ArrayList<Course> getCourseList(){
		return this.courseList;
	}
}
