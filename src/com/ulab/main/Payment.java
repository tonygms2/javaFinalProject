package com.ulab.main;

/**
 * @author tonyg
 *
 */
public class Payment {
	private double finalAmount;
	private double currentStudentBalance;
	private double currentFacultyBalance;
	
	
	public void takeComSocMoney(Student stdnt) 		{
		currentStudentBalance = stdnt.getBalance();
			if(currentStudentBalance<100) {
				System.out.println("Not Enough Money for your ComSoc membership, Your Balance is : "+currentStudentBalance);
			}else if(stdnt.getComSocInfo()!=true) {
				System.out.println("Not a member of ComSoc, Can't Deduct the money");
			}else{
				currentStudentBalance = currentStudentBalance - 100;
				stdnt.setStudentMoney(currentStudentBalance);
				System.out.println(currentStudentBalance);
			}
	}
	
	public void takeIeeMoney(Student stdnt) {
		currentStudentBalance = stdnt.getBalance();
		if(stdnt.getIeeInfo()!=true) {
			System.out.println("Not a member of IEEE, Can't Deduct the money");
		}
		else if(currentStudentBalance<2500) {
			System.out.println("Not Enough Money for your IEEE membership, Your Balance is : "+currentStudentBalance);
		}
		else{
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
