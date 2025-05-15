package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		Statement stmt =conn.createStatement();
		
	int i =stmt.executeUpdate(" update user set dob= '2002-01-03' where id =3 ");
		  stmt.executeUpdate(" update user set dob= '2003-02-19' where id =4 ");
		   stmt.executeUpdate(" update user set dob= '2004-04-11' where id =5 ");
		     stmt.executeUpdate(" update user set dob= '2005-01-9' where id =6 ");
		    stmt.executeUpdate(" update user set dob= '2006-10-01' where id =7 ");
		
		System.out.println("Updated "+i+i+i+i+i);

	}

}
