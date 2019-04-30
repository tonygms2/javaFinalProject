package com.ulab.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Currency;

/**
 * @author tonyg
 * This class contains the common Attributes between the student and faculty class
 *
 */
public abstract class CommonAttributes {
	private LocalDate DOB;
	protected boolean isIEEMember = false;
	private boolean isComSocMember = false;
	protected gender Gender;
	private int day,year,month;
	
	public void setMemebership(boolean isIEEMember, boolean isComSocMember) {
		this.isIEEMember = isIEEMember;
		this.isComSocMember = isComSocMember;
	}
	
	public boolean getIeeInfo() {
		return this.isIEEMember;
	}
	
	public boolean getComSocInfo() {
		return this.isComSocMember;
	}
	
	public void setGender(gender Gender) {
		this.Gender = Gender;
	}
	
	public gender getGender() {
		return this.Gender;
	}
	
	public void setDOB(int day, int month, int year) {
		 DOB = LocalDate.of(year, month, day);
	}
	
	public String showDOB() {
		return DOB.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	gender ShowGender() {
		return this.Gender;
	}

}
