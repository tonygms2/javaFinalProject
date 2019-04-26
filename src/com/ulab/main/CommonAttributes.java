package com.ulab.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Currency;

public abstract class CommonAttributes {
	private LocalDate DOB;
	private boolean isIEEMember;
	private boolean isComSocMember;
	protected gender Gender;
	private int day,year,month;
	
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
		return DOB.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
	}

	gender ShowGender() {
		return this.Gender;
	}

}
