package com.ulab.main;

import java.util.Date;
import org.joda.time.*;

public class Main {

	public static void main(String[] args) {
		
		Faculty mizan = new Faculty("Mizanur Rahman", "CSE",gender.male);
		mizan.setDOB(12, 11, 1985);
		mizan.showFacultyInfo();//sysouts all info
		System.out.println(mizan.showDOB());//returns DOB in strings
		Student tony = new Student("Nicholas Tony Gomes", "CSE", gender.male);
		tony.setDOB(9, 3, 1997);
		tony.showStudentInfo();//sysouts all info
		System.out.println(tony.showDOB());//returns DOB in strings
		
//		tony.setGender(gender.male);
//		System.out.println(tony.getGender());
//		tony.setDOB(9, 3, 1997);
//		System.out.println(tony.showDOB());
//		
	}

}
