package com.ulab.main;

/**
 * @author tonyg
 *
 */
public class Faculty extends CommonAttributes {
	private String facultyName;
	private String facultDepartment;
	private int ID;
	private double salary;
	
	public Faculty(String facultyName,int ID,String facultyDepartment,Gender Gender) {
		this.facultyName = facultyName;
		this.facultDepartment = facultyDepartment;
		super.Gender = Gender;
		this.ID = ID;
	}
	
	public Faculty() {
		
	}
	
	void showFacultyInfo() {
		//used to show faculty info
		try {
			System.out.println("Faculty name is : "+facultyName+" of ID: "+ID+" from "+facultDepartment+" department who is "+ super.ShowGender());
			System.out.println("DOB: "+this.showDOB());
			if(getIeeInfo()==true) {
				System.out.println("Is a member of IEE Student Branch");
			}else{
				System.out.println("Is not a member of IEE Student Branch");
			}
			if(getComSocInfo()==true) {
				System.out.println("Is a member of Computer Society");
			}else{
				System.out.println("Is not a member of Computer Society");
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("**********Set the DOB first for Faculty*********");
			System.out.println(e.toString());
		}
		
	}

}
