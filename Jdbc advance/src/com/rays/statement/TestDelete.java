package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	
	Statement stmt = conn.createStatement();
	
	int i = stmt.executeUpdate(" delete from user  where id =10");
	
	System.out.println("deleted "+i);
	
	
	
	
}
}
