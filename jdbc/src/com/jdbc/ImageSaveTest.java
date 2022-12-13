package com.jdbc;

import java.sql.*;

import java.io.*;
public class ImageSaveTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/photo?useSSL=false", "root","root");
  String q="insert into images(pic)values(?)";
  PreparedStatement ps=con.prepareStatement(q);
  FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop");
  ps.setBinaryStream(1,fis,fis.available());
  ps.executeUpdate();
  System.out.println("done.........");
  con.close();
		} catch (Exception e) {
    System.out.println(e);
		}

	}

}
