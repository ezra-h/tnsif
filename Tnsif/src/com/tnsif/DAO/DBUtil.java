package com.tnsif.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	private static Connection conn;
	private static final String Driver="com.mysql.cj.jdbc.Driver";
	private static final String User="root";
	private static final String Password="harsha";
	private static final String Url="jdbc:mysql://localhost:3306/practie_poject";
	
	public static Connection getConnection() {
		try {
			Class.forName(Driver);
			System.out.println("Driver loaded Successfully..");
			conn=DriverManager.getConnection(Url,User,Password);
			System.out.println("Connection Established");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}