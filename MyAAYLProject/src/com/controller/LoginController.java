package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.LoginValidatorDao;

@SuppressWarnings("serial")
@WebServlet("/lcontrol")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			String uname=req.getParameter("login");
			
			HttpSession session = req.getSession(); 
			session.setAttribute("uname", uname);
			String pass=req.getParameter("password");
			
			ServletContext sr=req.getServletContext();
			sr.setAttribute("unamee", uname);
			
			LoginValidatorDao lv=new LoginValidatorDao();
			try{
				String check=lv.validateLogin(uname, pass);	
				if(check!=null && !(check.equals("false"))){
				//	String c=(String) sr.getAttribute("unamee");
				//	String tuname=" "+c;
					//req.setAttribute("uname",tuname);
					session.setAttribute("fullname", check);
					RequestDispatcher rd=req.getRequestDispatcher("Homepage.jsp");
					rd.forward(req, resp);
				}
				else {
					req.setAttribute("message", "Wrong username or password!!");
					RequestDispatcher rd=req.getRequestDispatcher("Loginpage.jsp");
					rd.forward(req, resp);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doGet(req,resp);
	}

}
