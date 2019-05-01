package com.ulab.main;

import java.sql.SQLException;
import java.util.Date;
import org.joda.time.*;

/**
 * @author tonygms2@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) throws SQLException {
		Payment payment = new Payment();
		Student max = new Student("Maxim Sylvester", 172014005, "English", Gender.male);//create an instance of student class named max using custom constructor
		max.setDOB(9, 3, 1997);//setDOB method is used to set the date of birth of the max object
		max.setMemebership(true, true);//set membership of IEE and ComSoc, True 
		max.setStudentMoney(1400);//set money for the student instance
//		max.showStudentInfo();// showStudentInfo method prints out the Name, ID, Date of Birth, Departmnet, Gender of student instance and if is ComSoc or IEE member
//		
		Faculty sir = new Faculty("XYZ", 182101451, "CSE", Gender.male);
		sir.setDOB(12, 1, 1985);
		sir.setSalary(50000);
		payment.giveEidBonus(sir);
		
//		max.setStudentMoney(5000);
//		payment.takeComSocMoney(max);
//		payment.takeIeeMoney(max);
//		
		
	}

}


//Payment payment = new Payment(); //create an instance of payment class to use payment functionalities 
//Faculty teacher = new Faculty();//create an instance of Faculty class using the default constructor


//payment.takeComSocMoney(max);
//payment.takeIeeMoney(max);
//teacher.setSalary(12000);
//payment.giveEidBonus(teacher);
//System.out.println(teacher.getSalary());
