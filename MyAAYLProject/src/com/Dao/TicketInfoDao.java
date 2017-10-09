package com.Dao;
import java.sql.*;
import java.util.*;
public class TicketInfoDao {
	MyDBConnection mbd=new MyDBConnection();
	
	public List<TicketBean> getTicketInfo(String uname) throws SQLException{
		Connection conn=mbd.getConnection();
		String sql="select * from mybuscart_16192 where uname=?";
		List<TicketBean> myList=new ArrayList();
		PreparedStatement stmt=conn.prepareStatement(sql);
		stmt.setString(1, uname);
		ResultSet rs=stmt.executeQuery();
		while(rs.next()){
			TicketBean tb=new TicketBean();
			tb.bookingdate=rs.getString(2);
			tb.busno=rs.getString(3);
			tb.bustype=rs.getString(4);
			tb.dtime=rs.getString(5);
			tb.tno=rs.getInt(6);
			tb.totalPrice=rs.getFloat(7);
			myList.add(tb);
		}
		return myList;
		
	}
		
}
