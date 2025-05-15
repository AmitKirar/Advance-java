package com.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Marksheetmodel {

	ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");

	String url = rb.getString("url");
	String username = rb.getString("username");
	String password = rb.getString("password");
	String driver = rb.getString("driver");

	public void add(Marksheetbeen been) throws ClassNotFoundException, SQLException {

		Class.forName(driver);

		Connection conn = DriverManager.getConnection(url, username, password);

		PreparedStatement pstmt = conn.prepareStatement("insert into marksheet1 values (?,?,?,?,?)");

		pstmt.setInt(1, been.getRollno());
		pstmt.setString(2, been.getName());
		pstmt.setInt(3, been.getPhysics());
		pstmt.setInt(4, been.getMaths());
		pstmt.setInt(5, been.getChemistry());

		int i = pstmt.executeUpdate();
		System.out.println("added :" + i);

	}

	public void Delete(Marksheetbeen been) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement pstmt = conn.prepareStatement("DELETE FROM marksheet1 WHERE rollno=?");

		pstmt.setInt(1, been.getRollno());

		int i = pstmt.executeUpdate();
		System.out.println("deleted :" + i);
	}

	public void update(Marksheetbeen been) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement pstmt = conn.prepareStatement(
				"update marksheet1 set studentname =?,physics =?,maths=?,chemistry=? where rollno =?");
		pstmt.setString(1, been.getName());
		pstmt.setInt(2, been.getPhysics());
		pstmt.setInt(3, been.getMaths());
		pstmt.setInt(4, been.getChemistry());
		pstmt.setInt(5, been.getRollno());

		int i = pstmt.executeUpdate();
		System.out.println("updated :" + i);
	}

}
