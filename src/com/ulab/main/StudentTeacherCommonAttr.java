package com.ulab.main;

import java.time.LocalDate;

public abstract class StudentTeacherCommonAttr {
	private LocalDate DOB;
	private boolean isIEEMember;
	private boolean isComSocMember;
	protected gender Gender;
	private int day,year,month;
	void setDOB(int day, int month, int year) {
		 DOB = LocalDate.of(year, month, day);
	}
	
	public LocalDate show() {
		
		System.out.println(DOB);
		return DOB;
	}
	
}
