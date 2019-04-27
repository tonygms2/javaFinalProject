package com.ulab.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectionMySQL {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultset = null;
	
	void setConnection() {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1234");
			System.out.println("Connected");
		
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
