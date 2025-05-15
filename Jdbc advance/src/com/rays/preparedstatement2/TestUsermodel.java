package com.rays.preparedstatement2;

import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUsermodel {
	public static void main(String[] args) throws Exception {
testAdd();
//		testDelete();
//		testUpdate();
//		testSearch();
//		testFindByLogin();
//		TestFindByPk();
//		testauthenticate();
//		testNextPk();
	}

	public static void testAdd() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		UserBean bean = new UserBean();
//		bean.setId(5);
		bean.setFirstName("sangeeta");
		bean.setLastName("rajpoot");
		bean.setLoginId("sangeeta@gamil.com");
		bean.setPassword("123456");
		bean.setDob(sdf.parse("2005-01-23"));

		UserModel model = new UserModel();
		model.add(bean);
	}

	public static void testDelete() throws ClassNotFoundException, SQLException {
		UserBean bean = new UserBean();
		bean.setId(5);
		
		UserModel model = new UserModel();
		model.delete(bean);
	}

	public static void testUpdate() throws ClassNotFoundException, SQLException, Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean = new UserBean();

		bean.setFirstName("raj");
		bean.setId(5);
		bean.setLastName("jain");
		bean.setLoginId("komal@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("2024-01-01"));

		UserModel model = new UserModel();
		model.update(bean);
	}

	public static void testSearch() throws Exception {
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		List list = new ArrayList();
		list = model.Search(bean);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (UserBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			System.out.println("\t" + bean.getDob());
		}
	}
	
	public static void testFindByLogin() throws ClassNotFoundException, SQLException { 
		UserBean bean = new UserBean();
		UserModel model= new UserModel();
		bean =model.FindbyLogin("komal@gmail.com");
		if(bean!=null) { 
			System.out.println("user login successfully");
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
		}else { 
			System.out.println("invalid login id");
		}
			
		
	}
	public static void TestFindByPk() throws Exception { 
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		bean=model.FindByPk(2);
		if(bean!=null) { 
			System.out.println("valid user pk");
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getDob());
			
		}else { 
			System.out.println("invalid user pk");
		}
		
	}
	public static void testauthenticate() throws ClassNotFoundException, SQLException {
		UserBean bean = new UserBean();
		UserModel model= new UserModel();
		bean= model.authenticate("kiran@gamil.com", "123434");
		if(bean!=null) { 
			System.out.println("user login successfully");
			System.out.println( bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getLoginId());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
		}else { 
			System.out.println("user login unsuccessfully");
		}
	}
	
	public static void testNextPk() throws Exception {
		UserModel model = new UserModel();
		
		System.out.println(""+model.nextPk());
	}

}
