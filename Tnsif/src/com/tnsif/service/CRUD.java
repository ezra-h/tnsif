package com.tnsif.service;

import com.tnsif.DAO.*;
import javax.sql.*;
import java.sql.*;
public class CRUD {
	static final Connection conn;
	static PreparedStatement pst;
	static {
		conn=DBUtil.getConnection();
		if(conn!=null) {
			System.out.println("Connection is Success");
		}
	
	}
	public static void showEmployees() {
		try {
			String query ="select * from employees";
			pst=conn.prepareStatement(query);
			ResultSet rs =pst.executeQuery();
			
			System.out.println("ID\tName\t\tCity\t\tDepartment");
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String city=rs.getString("city");
				String dept=rs.getString("dept");
				System.out.println(id + "\t" + name + "\t\t" + city +"\t"+ dept);
				
			}
			pst.close();
			rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int addEmployee(int id , String name , String city, String dept) {
		int n=0;
		try {
			pst=conn.prepareStatement("Insert into employees values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, city);
			pst.setString(4, dept);
			n=pst.executeUpdate();
			System.out.println("Employee Added Successfully..");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
            try {
                if (pst != null) {
                		pst.close();  
                }
            } 
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }

		return n;
	}
	
	
}