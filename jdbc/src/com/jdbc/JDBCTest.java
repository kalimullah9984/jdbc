package com.jdbc;

import java.sql.*;



public class JDBCTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project?useSSL=false", "root","root");
			      Statement stmt = con.createStatement();
			//prepared statement............................................................
			/*
			 * PreparedStatement ps = con.prepareStatement("insert into rak(id,name,city,salary)values(?,?,?,?)");
			 * System.out.println("prepared statements"); ps.setInt(1,75); ps.setString(2,
			 * "ndtv"); ps.setString(3, "indore"); ps.setFloat(4, 1765.89f);
			 * int i=ps.executeUpdate(); System.out.println(i);
			 */
			//deleted....................................................................................
			/*
			 * System.out.println("deleted");
			 *  String s="delete from rak where id=40";
			 * stmt.executeUpdate(s);
			 */
			
			
			//updated......................................................................
			/*
			 * System.out.println("updated"); String
			 * s="update rak set name='tufel' ,id=40 where city='hubli'";
			 * stmt.executeUpdate(s);
			 */
			//inserted...................................................................
			/*
			 * System.out.println("inserted"); String
			 * s="insert into rak values(40,'javed','hubli',106.56)"; stmt.executeUpdate(s);
			 */
			//fetching.........................................................................
			
			  
			  System.out.println("fetching");
			 ResultSet rs = stmt.executeQuery("select*from student");
			  while (rs.next()) {
			  System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
			  rs.getString(3) + " " + rs.getFloat(4)); }
			 	
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
