package com.rays.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("UserRegistrationView.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String op  = request.getParameter("operation");
		
		UserBean bean = new UserBean();
		UserModel model = new UserModel();
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String loginId=request.getParameter("loginId");
		String password=request.getParameter("password");
		String dob=request.getParameter("dob");
		
		if(op.equals("SignUp")) { 
			
			try {
			bean.setId(58);
			bean.setFirstName(firstName);
			bean.setLastName(lastName);
			bean.setLoginId(loginId);
			bean.setPassword(password);
			bean.setDob(sdf.parse(dob));
			model.add(bean);
			request.setAttribute("msg", "user register successful");
			
			}catch(Exception e) { 
				request.setAttribute("msg", e.getMessage());
				e.printStackTrace();
			} 
			
		}else { 
			System.out.println("unsuccessfull registration");
		}
		RequestDispatcher rd=request.getRequestDispatcher("UserRegistrationView.jsp");
		rd.forward(request, response);

	}
}
