package com.Dao;

import java.sql.*;

public class LoginValidatorDao {
		
	public String validateLogin(String uname,String pass) throws SQLException{
			String sql="select * from bususer_16192 where username=?";
			MyDBConnection lv=new MyDBConnection();
			Connection conn=lv.getConnection();
			PreparedStatement stmt=conn.prepareStatement(sql);
			stmt.setString(1,uname);
			ResultSet rs=stmt.executeQuery();
			String temp="";
			String tempname="";
			while(rs.next()){
				temp=rs.getString(2);
				tempname=rs.getString(3);
			}
			if(temp.equals(pass))return tempname;
			else return "false";
	}
			
	

}
