package com.ulab.main;

import java.sql.SQLException;
import java.util.Date;
import org.joda.time.*;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Faculty mizan = new Faculty("Mizanur Rahman",2441139, "CSE",gender.male);
		mizan.setDOB(23, 11, 1977);
		mizan.setMemebership(true, true);
		mizan.showFacultyInfo();//sysouts all info
		//System.out.println(mizan.showDOB());//returns DOB in strings
		Student tony = new Student("Nicholas Tony Gomes",172014005, "CSE", gender.male);
		tony.setDOB(9, 3, 1997);
		tony.setMemebership(true, false);
		tony.showStudentInfo();//sysouts all info
		connectionMySQL obj = new connectionMySQL();
		obj.setConnection();
	//	System.out.println(tony.showDOB());//returns DOB in strings

	}

}
