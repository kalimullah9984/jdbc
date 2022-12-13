package com.jdbc;
import java.sql.*;
public class JDBCExample {
	public static void main(String[] args) {
	try {
	Class.forName("com.mysql.jdbc.Driver"); 
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage?useSSL=false","root","root"); 
   Statement stmt= con.createStatement();
   System.out.println("updated");
   String sql="update students set sname='salman' , sphone='apple' where sid=7";
		   stmt.executeUpdate(sql);
	/*
	 * System.out.println("deleted"); 
	 * String sql= "delete from students , where sid=8";
	 *  stmt.executeUpdate(sql);
	 */
          
           
	 // Insert data Into database ResultSet
		/*
		 * System.out.println("inserted"); 
		 * String sql= "insert into students values(9, 'mujeeb', 'samsung', 'lucknow')";
		 * stmt.executeUpdate(sql);
		 */
	 // fetch data Into the database
	 // Result=stmt.executeQuery("select* from students");
	  /*while (Result.next()){
	  System.out.println(Result.getInt(1)+" "+Result.getString(2)+" "+Result.
	  getString(3)+" "+Result.getString(4));}*/
	 
   
     con.close();
     }
	 catch(Exception e) {

	System.out.println(e);
	}
	}
}
