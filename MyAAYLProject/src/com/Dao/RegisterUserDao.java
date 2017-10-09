package com.Dao;

import java.sql.*;

public class RegisterUserDao {
		
	public void registerDetails(String uname,String pass,String fullname,String mobno) throws SQLException{
		String sql="insert into bususer_16192 values(?,?,?,?)";
		MyDBConnection lv=new MyDBConnection();
		Connection conn=lv.getConnection();
		PreparedStatement stmt=conn.prepareStatement(sql);
		stmt.setString(1,uname);
		stmt.setString(2,pass);
		stmt.setString(3,fullname);
		stmt.setString(4,mobno);
		int i=stmt.executeUpdate();
		if(i>0){
			System.out.println("added successfully");
		}
		else
			System.out.println("addition failed");

	}

}
