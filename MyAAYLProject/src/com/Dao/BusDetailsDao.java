package com.Dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class BusDetailsDao {
	
	public List<String> getBusNo(String destFrom,String destTo,String sbdate) throws SQLException, ParseException{
		String sql="select * from checkbus_16192 where destination_from=? and destination_to=? and bus_date=?";
		MyDBConnection lv=new MyDBConnection();
		Connection conn=lv.getConnection();
		java.util.Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(sbdate);
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); 

		PreparedStatement stmt=conn.prepareStatement(sql);
		stmt.setString(1, destFrom);
		stmt.setString(2, destTo);
		stmt.setDate(3,sqlDate);
		ResultSet rs=stmt.executeQuery();
		List<String> busno=new ArrayList<String>();
		
		while(rs.next()){
			busno.add(rs.getString(4));
			
		}		
		
		return busno;
	}
	
	public List<BusBean> getBusDetails(List<String> busno) throws SQLException{
		List<BusBean> bdetails=new ArrayList<BusBean>();
		MyDBConnection lv=new MyDBConnection();
		Connection conn=lv.getConnection();
		
		for(String bno:busno){
			
			String sql="select * from busdetails_16192 where busno='"+bno+"'";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				BusBean bb =new BusBean();
				bb.setBusno(rs.getString(1));
				bb.setBustype(rs.getString(2));
				bb.setDepart_time(rs.getString(3));
				bb.setPrice(rs.getFloat(4));
				bb.setSeatstot(Integer.parseInt(rs.getString(5)));
				bb.setSeatsav(Integer.parseInt(rs.getString(6)));
				
				bdetails.add(bb);
			}
		}		
		return bdetails;
	}
}
