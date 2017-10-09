package com.Dao;

import java.sql.*;

public class MyDBConnection {
Connection conn;
	
	public Connection getConnection() throws SQLException{
		try{
			String url = "jdbc:oracle:thin:@10.232.71.29:1521:inatp02";
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			 conn = DriverManager.getConnection(url, "shobana", "shobana");
			 //System.out.println("Connected successfully!!");
			 
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
}
