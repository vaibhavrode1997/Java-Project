package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil
{
	static Connection con;
	
	public static Connection getConnection()
	{
		if(con == null)
		{
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/Sundb?useSSL=false";
				String username="root";
				String password="Vaibhav@1812";
				con=DriverManager.getConnection(url,username,password);			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}
		return con;
	}
}
