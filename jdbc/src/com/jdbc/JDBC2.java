package com.jdbc;

import java.sql.*;




public class JDBC2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mujeeb?useSSL=false","root","root");
PreparedStatement ps=con.prepareStatement("insert into multi values(?,?)");
      ps.setInt(1, 105);
      ps.setString(2, "kaleem");
    ps.executeUpdate();
    System.out.println("arzoo");
    // System.out.println(i+"records inserted");
     con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
	
