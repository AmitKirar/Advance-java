package com.rays.preparedstatement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserModel {

	public void add(UserBean bean) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("insert into user values(?,?,?,?,?,?)");

		pstmt.setInt(1, bean.getId());
		pstmt.setString(2, bean.getFirstName());
		pstmt.setString(3, bean.getLastName());
		pstmt.setString(4, bean.getLogin());
		pstmt.setString(5, bean.getPassword());
		pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()));

		int i = pstmt.executeUpdate();
		System.out.println("data inserted :" + i);
	}

	public void update(UserBean bean) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement pstmt = conn
				.prepareStatement("update user set firstName=?,lastName=?,loginId=?,password=?,dob=? where id=?");

		pstmt.setString(1, bean.getFirstName());
		pstmt.setString(2, bean.getLastName());
		pstmt.setString(3, bean.getLogin());
		pstmt.setString(4, bean.getPassword());
        pstmt.setDate(5, new java.sql.Date(bean.getDob().getTime()));
        pstmt.setInt(6, bean.getId());
        
        int i = pstmt.executeUpdate();
        System.out.println("updated :"+i);
	}
	public void Delete(UserBean bean) throws ClassNotFoundException, SQLException { 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		PreparedStatement pstmt= conn.prepareStatement("delete from user where id = ?");
		
		pstmt.setInt(1, bean.getId());
		int i = pstmt.executeUpdate();
		System.out.println("deleted :"+i);
		
	}
}
