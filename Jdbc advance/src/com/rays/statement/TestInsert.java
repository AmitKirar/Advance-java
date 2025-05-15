package com.rays.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate("insert into user values(10,'shubhum','rathore','shubhum@gamil.com','shubhum123','1988-10-10')");
			conn.commit();
			System.out.println("inserted" + i);

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		}

	}

}
