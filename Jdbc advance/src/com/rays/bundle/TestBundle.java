package com.rays.bundle;

import java.util.ResourceBundle;

public class TestBundle {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");

		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");
		String driver = rb.getString("driver");
		String maxpoolsize = rb.getString("maxpoolsize");
		String minpoolsize =rb.getString("minpoolsize");
		String initialpoolsize=rb.getString("initialpoolsize");
		String acquireIncrement=rb.getString("acquireIncrement");
		System.out.println(url + "\n" + username + "\n" + password + "\n" + driver + "\n" + maxpoolsize+"\n"+minpoolsize+"\n"+initialpoolsize+"\n"+acquireIncrement);
	}
}
