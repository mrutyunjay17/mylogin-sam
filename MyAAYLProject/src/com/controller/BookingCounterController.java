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

import com.Dao.AddBookingDao;
@SuppressWarnings("serial")
@WebServlet("/addbooking")
public class BookingCounterController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		HttpSession session = req.getSession(); 
		
		String uname=(String)session.getAttribute("uname");
		
		
		
		ServletContext sr=req.getServletContext();
		String st=(String)sr.getAttribute("unamee");
		
		String bookingDate=(String) session.getAttribute("sbdate");
		String busno=req.getParameter("busno");
		String bustype=req.getParameter("bustype");
		String dtime=req.getParameter("depart_time");
		float pricePerTicket=Float.parseFloat(req.getParameter("price"));
		int availableSeats=Integer.parseInt(req.getParameter("seatsav"));
		int tno=Integer.parseInt(req.getParameter("tno"));
		
		try{
		if(tno<=availableSeats){
			float totalPrice=pricePerTicket* tno;
			AddBookingDao abd=new AddBookingDao();
			abd.saveTicketToTable(uname,bookingDate,busno,bustype,dtime,tno,totalPrice);
			
			abd.updateBusDetailsTable(busno,tno,availableSeats);
			req.setAttribute("message1","Booking successfull!!");
			RequestDispatcher rd=req.getRequestDispatcher("Homepage.jsp");
			rd.forward(req, resp);
		}
		else{
			req.setAttribute("message1","Tickets Exceeding limit!!!");
			RequestDispatcher rd=req.getRequestDispatcher("Homepage.jsp");
			rd.forward(req, resp);
		}}catch(SQLException e){
			req.setAttribute("message",	"Error");
			RequestDispatcher rd=req.getRequestDispatcher("Homepage.jsp");
			rd.forward(req, resp);
		}
 }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
