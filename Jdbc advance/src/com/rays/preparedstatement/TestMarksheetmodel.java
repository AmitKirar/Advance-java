package com.rays.preparedstatement;

import java.sql.SQLException;

public class TestMarksheetmodel {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		testadd();
    //	testdelete();
   //	testupdate();
	}

	public static void testadd() throws ClassNotFoundException, SQLException {

		Marksheetbeen been = new Marksheetbeen();
		been.setRollno(4);
		been.setName("kiran");
		been.setPhysics(82);
		been.setMaths(82);
		been.setChemistry(82);

		Marksheetmodel model = new Marksheetmodel();
		model.add(been);
	}

	public static void testdelete() throws ClassNotFoundException, SQLException {
		Marksheetbeen been = new Marksheetbeen();
		been.setRollno(1);
		Marksheetmodel model = new Marksheetmodel();
		model.Delete(been);
	}

	public static void testupdate() throws ClassNotFoundException, SQLException {
		Marksheetbeen been = new Marksheetbeen();
		been.setRollno(2);
		been.setName("divyanshu");
		been.setPhysics(11);
		been.setMaths(22);
		been.setChemistry(44);
		Marksheetmodel model = new Marksheetmodel();
		model.update(been);
	}

}
