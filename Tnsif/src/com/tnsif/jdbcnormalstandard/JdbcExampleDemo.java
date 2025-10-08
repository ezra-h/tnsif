package com.tnsif.jdbcnormalstandard;

import java.sql.*;

public class JdbcExampleDemo {

	public static void main(String[] args) {
		String  URL ="jdbc:mysql://localhost:3306/practice_project";
		String PASSWORD="Harsha";
		String USERNAME="root";
	try {
		Connection conn =null;
		Statement stmt =null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		System.out.println("Connection Established Successfully...");
		
		stmt=conn.createStatement();
		
		String query ="select * from employees";
		
		ResultSet rs = stmt.executeQuery(query);
		
		System.out.println("ID\tName\t\tCity\t\tDepartment");
		
		while(rs.next()) {
			int id =rs.getInt("id");
			String name=rs.getString("name");
			String city =rs.getString("city");
			String dept =rs.getString("dept");

			System.out.println(id + "\t" + name + "\t\t" + city +"\t"+ dept);
		}
		
		stmt.close();
		conn.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		       

	}

}
