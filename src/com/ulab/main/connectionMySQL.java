package com.ulab.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class connectionMySQL {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultset = null;
	Student tony = new Student("Nicholas Tony Gomes",1720140125, "CSE", gender.male);
	private Integer ID = tony.getStudentID();
	
	
	void setConnection() {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/finalproj", "root", "1234");
			System.out.println("*********Connected to DB*********");
			String query = "SELECT * FROM jtable";
			String query2 = "INSERT INTO jtable " + "VALUES("+ID.toString()+",'Rahul Roy','CSE','96-02-12',1,1,1)";
			statement = connect.createStatement();
			statement.executeUpdate(query2);
			System.out.println("Data inserted");
			resultset = statement.executeQuery(query);
			while (resultset.next()) {
				String id = resultset.getString("ID");
				String Name = resultset.getString("NAME");
				String Dept = resultset.getString("DEPT");
				boolean gender = resultset.getBoolean("GENDER");
				System.out.format("%s\n%s\n%s\n%s\n",id,Name,Dept,gender);
			}
			statement.close();		
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	
//	void getStatement() throws SQLException {
//		
//		
//	}
}
