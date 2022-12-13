package com.jdbc;

import java.sql.*;

public class ConnectionClass {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Public?useSSL=false", "root", "root");

			Statement stmt = con.createStatement();
			
			
			

			/*
			 * //insert data into databse System.out.println("inserted");
			 * 
			 * String sql = "INSERT INTO student VALUES (3,'Alam', 'Andheri', 'sumsung')";
			 * stmt.executeUpdate(sql);
			 */
					
			/*
			 * //fetch the data into database ResultSet
			 * result=stmt.executeQuery("select * from student");
			 * 
			 * 
			 * 
			 * while (result.next()) { System.out.println(result.getInt(1) + " " +
			 * result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
			 * 
			 * }
			 */
			
			//update into database
			
			 
			con.close();

		}

		catch (Exception e) {
		System.out.println(e);

		}
	}

}
