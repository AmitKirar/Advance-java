package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

// step 1 load driver
		Class.forName("com.mysql.cj.jdbc.Driver");

// step 2 make connection to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

// step 3  create Statement
		Statement stmt = conn.createStatement();

//step 4 Execute query and get  ResultSet
		ResultSet rs = stmt.executeQuery("select * from employee");

		System.out.println("connection sucessfully");

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.println("\t" + rs.getInt(4));
		}

	}
}