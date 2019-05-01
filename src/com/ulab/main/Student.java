package com.ulab.main;
import java.lang.System;
/**
 * @author tonyg
 *
 */
public class Student extends CommonAttributes {
	private String studentName ;
	private String studentDepartment;
	private Integer ID;
	private double money;
	
	public double getBalance() {
		return this.money;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public String getStudentDept() {
		return this.studentDepartment;
	}
	public void setStudentMoney(double money) {
		this.money = money;
	}
	
	public Student(String studentName,int ID,String StudentDepartment,Gender Gender) {
		this.studentDepartment = StudentDepartment;
		this.studentName = studentName;
		super.Gender = Gender;
		this.ID = ID;
	}
	public int getStudentID() {
		return this.ID;
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
