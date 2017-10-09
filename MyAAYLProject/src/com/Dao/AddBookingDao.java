package com.Dao;

import java.sql.*;

public class AddBookingDao {
	MyDBConnection lv=new MyDBConnection();
	
	
	public void saveTicketToTable(String uname,String bookingDate,String busno,String bustype,String dtime,int tno,float totalPrice) throws SQLException{
		Connection conn=lv.getConnection();
		String sql="insert into mybuscart_16192 values(?,?,?,?,?,?,?)";
		PreparedStatement stmt=conn.prepareStatement(sql);
		stmt.setString(1, uname);
		stmt.setString(2, bookingDate);
		stmt.setString(3, busno);
		stmt.setString(4, bustype);
		stmt.setString(5, dtime);
		stmt.setInt(6, tno);
		stmt.setFloat(7, totalPrice);
		int i=stmt.executeUpdate();
		System.out.println("updated rows in mybuscart:"+i);
		
	}
	public void updateBusDetailsTable(String busNo,int tno,int seatsAvailable) throws SQLException{
		Connection conn=lv.getConnection();
		String sql="update busdetails_16192 set seatsav=? where busno=?";
		int tempSeats=seatsAvailable-tno;
		PreparedStatement stmt=conn.prepareStatement(sql);
		stmt.setInt(1, tempSeats);
		stmt.setString(2, busNo);
		int i=stmt.executeUpdate();
		System.out.println("updated rows in busdetails:"+i);
	}
}
