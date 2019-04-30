package com.ulab.main;

/**
 * @author tonyg
 *
 */
public class Payment {
	double finalAmount;
	double currentStudentBalance;
	double currentFacultyBalance;
	
	
	public void takeComSocMoney(Student stdnt) 		{
		currentStudentBalance = stdnt.getBalance();
			if(currentStudentBalance<100) {
				System.out.println("Not Enough Money, Your Balance is : "+currentStudentBalance);
			}else{
				currentStudentBalance = currentStudentBalance - 100;
				stdnt.setStudentMoney(currentStudentBalance);
				System.out.println(currentStudentBalance);
			}
	}
	
	public void takeIeeMoney(Student stdnt) {
		currentStudentBalance = stdnt.getBalance();
		if(currentStudentBalance<2500) {
			System.out.println("Not Enough Money, Your Balance is : "+currentStudentBalance);
		}else{
			currentStudentBalance = currentStudentBalance - 2500;
			stdnt.setStudentMoney(currentStudentBalance);
			System.out.println(currentStudentBalance);
		}
		
		}
	public void giveEidBonus(Faculty fct) {
//		 currentFacultyBalance = stdnt.getMoney();
//
//	      int bonus=(salary/100)*30;;
//	   
//	            stdnt.setMoney(salary+bonus);
	}
	
	
	
}
