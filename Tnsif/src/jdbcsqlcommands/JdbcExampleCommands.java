package jdbcsqlcommands;

import java.sql.*;

public class JdbcExampleCommands {
	static final String User="root";
	static final String Password="harsha";
	static final String Url="jdbc:mysql://localhost:3306/practice_project";
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
			
			conn=DriverManager.getConnection(Url,User,Password);
			System.out.println("Database Connected Successfully...");
			
			String updateQuery="update employees set city=? where id=?";
			pst=conn.prepareStatement(updateQuery);
			pst.setString(1,"Istanbul");
			pst.setInt(2, 1203);
			int updated=pst.executeUpdate();
			System.out.println(updated +"record's affected..");
			
			
			String deleteQuery="delete from employees where id=?";
			pst=conn.prepareStatement(deleteQuery);
			pst.setInt(1,1220);
			int deleted =pst.executeUpdate();
			System.out.println(deleted +"records affected");
			
			String selectQuery="select id, name,city,dept from employees";
			pst=conn.prepareStatement(selectQuery);
			rs=pst.executeQuery();
			
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String city =rs.getString("city");
				String dept =rs.getString("dept");
				System.out.println(id + "\t" +name +"\t" +city +"\t" +dept );
			}

			rs.close();
			pst.close();
			conn.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}