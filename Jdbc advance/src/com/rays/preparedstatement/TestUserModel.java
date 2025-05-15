package com.rays.preparedstatement;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestUserModel {
	public static void main(String[] args) throws ClassNotFoundException, ParseException, SQLException {

//		testadd();
    testupdate();
		//testDelete();
	}

	public static void testadd() throws ParseException, ClassNotFoundException, SQLException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();

		bean.setId(1);
		bean.setFirstName("lucky");
		bean.setLastName("kirar");
		bean.setLogin("lucky@gmail.com");
		bean.setPassword("lucky123");
		bean.setDob(sdf.parse("2002-01-03"));

		UserModel model = new UserModel();
		model.add(bean);

	}
	
	public static void testupdate() throws ParseException, ClassNotFoundException, SQLException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		UserBean bean= new UserBean();
		bean.setId(11);
		bean.setFirstName("ashtik");
		bean.setLastName("sahu");
		bean.setLogin("ashtik@gmail.com");
		bean.setPassword("ashtik1234");
		bean.setDob(sdf.parse("2005-01-09"));
		
		UserModel model = new UserModel();
		model.update(bean);
	}
	public static void testDelete() throws ClassNotFoundException, SQLException { 
		
		UserBean bean = new UserBean();
		bean.setId(7);
		
		UserModel model= new UserModel();
		model.Delete(bean);
	}

}
