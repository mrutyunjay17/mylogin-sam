package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.RegisterUserDao;
@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		System.out.println("in register");
		

		String uname=req.getParameter("uname");
		String pass=req.getParameter("passwd");
		String fname=req.getParameter("fullname");
		String mobno=req.getParameter("mobno");
		if(uname.isEmpty()||pass.isEmpty()||fname.isEmpty()||mobno.isEmpty()){
			RequestDispatcher rd=req.getRequestDispatcher("Registerpage.jsp");
			out.println("<font color=red>*Please fill all the fields</font>");
			rd.include(req, resp);
		}
		else{
			RegisterUserDao ruser=new RegisterUserDao();
			try {
				ruser.registerDetails(uname, pass, fname, mobno);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			req.setAttribute("message", "User registered successfully!!");
			RequestDispatcher rd=req.getRequestDispatcher("Loginpage.jsp");
			rd.forward(req, resp);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
