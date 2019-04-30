package com.ulab.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 * @author tonyg
 *
 */
public class connectionMySQL {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultset = null;
	//Student tony = new Student("Nicholas Tony Gomes",1720140125, "CSE", gender.male);
	private Integer ID;
	private String gen,isCom,isIee;
	
	void pushToDB(Student stdnt) {
		try {
			ID = stdnt.getStudentID();
			//connection instance used to create a connection with mysql db
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/finalproj", "root", "1234");
			
			System.out.println("*********Connected to DB*********");
			//
			String query = "SELECT * FROM jtable";
			
			if(stdnt.getGender()==gender.male) {
				gen = "1";
			}else {
				gen = "0";
			}
			if(stdnt.getComSocInfo()==true) {
				isCom = "1";
			}else {
				isCom = "0";
			}
			
			if(stdnt.getIeeInfo()==true) {
				isIee = "1";
			}else {
				isIee = "0";
			}
			
			
			
			
			String query2 = "INSERT INTO jtable " + "VALUES("+ID.toString()+",'"+stdnt.getStudentName()+"','"+stdnt.getStudentDept()+"','"+stdnt.showDOB()+"',"+gen+","+isCom+","+isIee+")";
			
			statement = connect.createStatement();
			statement.executeUpdate(query2);
			statement.execute(query);
			
			System.out.println("Data inserted");
			
			resultset = statement.executeQuery(query);
			
			while (resultset.next()) {
				String id = resultset.getString("ID");
				String Name = resultset.getString("NAME");
				String Dept = resultset.getString("DEPT");
				boolean gender = resultset.getBoolean("GENDER");
				System.out.format("%s\n%s\n%s\n%s",id,Name,Dept,gender);
			}
			statement.close();		
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("**********Set the DOB first*********");
			System.out.println(e.toString());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
//	void getStatement() throws SQLException {
//		
//		
//	}
}
