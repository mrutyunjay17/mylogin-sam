package com.controller;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.BusBean;
import com.Dao.BusDetailsDao;
@SuppressWarnings("serial")
@WebServlet("/booking")
public class BookingMainController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String destFrom=req.getParameter("fromcity");
		String destTo=req.getParameter("tocity");
		String sbdate=req.getParameter("busdate");
		BusDetailsDao bd=new BusDetailsDao();
		
		HttpSession session = req.getSession();
		session.setAttribute("sbdate",sbdate);
		
		try {
			List<String> busno=bd.getBusNo(destFrom, destTo, sbdate);
			List<BusBean> busDetails=bd.getBusDetails(busno);
			out.println(busDetails);
			req.setAttribute("busdetails", busDetails);
			RequestDispatcher rd=req.getRequestDispatcher("MyBusDetails.jsp");
			rd.forward(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
