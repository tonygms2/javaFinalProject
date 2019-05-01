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
			try {
				if(fct.getSalary()>=50000) {
					double bonus = (fct.getSalary()/100)*30;
					double finalSalary = fct.getSalary() + bonus;
					fct.setSalary(finalSalary);
					System.out.println("Bonus with salary is "+finalSalary);
					
				}else if(fct.getSalary()>=100000) {
					double bonus = (fct.getSalary()/100)*40;
					double finalSalary = fct.getSalary() + bonus;
					fct.setSalary(finalSalary);
					System.out.println("Bonus with salary is "+finalSalary);
				}else if(fct.getSalary()>=110000) {
					double bonus = (fct.getSalary()/100)*50;
					double finalSalary = fct.getSalary() + bonus;
					fct.setSalary(finalSalary);
					System.out.println("Bonus with salary is "+finalSalary);
				}else {
					double bonus = (fct.getSalary()/100)*10;
					double finalSalary = fct.getSalary() + bonus;
					fct.setSalary(finalSalary);
					System.out.println("Bonus with salary is "+finalSalary);
				}
			} catch (Exception e) {
				e.getMessage();
				System.out.println("SET Faculty Salary FIRST!!!");
			}
		}

}
