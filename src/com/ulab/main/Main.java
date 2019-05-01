package com.ulab.main;

import java.sql.SQLException;
import java.util.Date;
import org.joda.time.*;

/**
 * @author tonyg
 *
 */
public class Main {

	public static void main(String[] args) throws SQLException {
		Student max = new Student("Maxim Sylvester", 172014005, "English", Gender.male);
		Payment payment = new Payment();
		max.setDOB(9, 3, 1997);
		max.setMemebership(true, true);
		max.setStudentMoney(1400);
		//max.showStudentInfo();
		
		
	}

}

//Faculty max = new Faculty("Shahed Iqbal KHan", 165125401, "CSE", gender.male);
//Student tony = new Student("Tony Gomes", 172014005, "CSE", gender.male);
//Payment studentInfo = new Payment();
//tony.setStudentMoney(5000);
//tony.setDOB(9, 3, 1997);
////System.out.println(tony.showDOB());
//tony.setMemebership(true, true);
////studentInfo.takeComSocMoney(tony);
////studentInfo.takeIeeMoney(tony);
////studentInfo.takeComSocMoney(tony);
////studentInfo.takeIeeMoney(tony);
////tony.showStudentInfo();
//
//Student kowshik = new Student("Sheldon Cooper",1234567,"CSE",gender.male);
//kowshik.setDOB(25, 10, 1997);
//kowshik.setMemebership(false, false);
//
//Student jack = new Student("Jakie Chan", 1820140033, "MSJ", gender.male);
//jack.setDOB(23, 2, 2012);
//jack.setMemebership(false, true);
//
//Student jackline = new Student("Jacklin Gomes",182014033,"DEH",gender.female);
//jackline.setDOB(15, 9, 1997);
//
//connectionMySQL newConnection = new connectionMySQL();
////newConnection.pushToDB(kowshik);
////newConnection.pushToDB(tony);
////newConnection.pushToDB(jack);
////newConnection.pushToDB(jackline);
//newConnection.dropInfo(kowshik);


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
