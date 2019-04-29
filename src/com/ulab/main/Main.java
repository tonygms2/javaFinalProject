package com.ulab.main;

import java.sql.SQLException;
import java.util.Date;
import org.joda.time.*;

public class Main {

	public static void main(String[] args) throws SQLException {
		Faculty max = new Faculty("Shahed Iqbal KHan", 165125401, "CSE", gender.male);
		Student tony = new Student("Tony Gomes", 172014005, "CSE", gender.male);
		Payment studentInfo = new Payment();
		tony.setStudentMoney(5000);
		tony.setDOB(9, 3, 1997);
		tony.setMemebership(true, true);
		//studentInfo.takeComSocMoney(tony);
		studentInfo.takeIeeMoney(tony);
		studentInfo.takeComSocMoney(tony);
		studentInfo.takeIeeMoney(tony);
		tony.showStudentInfo();
		
		
	}

}



















//Student tony = new Student();
//tony.setMemebership(true, true);
//tony.setStudentMoney(35000);
//Payment getPayment =  new Payment();
//getPayment.takeMoneyAway(tony);
//getPayment.takeMoneyAway(tony);
//getPayment.takeMoneyAway(tony);
//Faculty mizan = new Faculty("Mizanur Rahman",2441139, "CSE",gender.male);
//mizan.setDOB(23, 11, 1977);
//mizan.setMemebership(true, true);
//mizan.showFacultyInfo();//sysouts all info
////System.out.println(mizan.showDOB());//returns DOB in strings
//tony.setDOB(9, 3, 1997);
//tony.setMemebership(true, false);
//tony.showStudentInfo();//sysouts all info
//obj.getStatement();
//System.out.println(tony.showDOB());//returns DOB in strings
