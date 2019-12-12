package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try 
		{
			//Load the Driver
//			Driver driver=new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver loaded....");
			
			//Get DB connection via Driver
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6?user=root&password=root";
			con=DriverManager.getConnection(dburl);
			System.out.println("connection established....");
			
			//Issue SQl query via Connection
			String query="select * from user_info";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("Query issued....");
			System.out.println("---------------------------------------------");
		
			//Process the result returned by SQL query
			while(rs.next())
			{
				System.out.println("UserId : "+rs.getInt("userid"));
				System.out.println("UserName : "+rs.getString("username"));
				System.out.println("Email : "+rs.getString("email"));
				System.out.println("Password : "+rs.getString("password"));
				System.out.println("----------------------------------------");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		//close all JDBC objects
		finally
		{
			try 
			{
				if(con!=null)
				{
					con.close();
				} 
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			try
			{
				if(stmt!=null)
				{
					stmt.close();
				}	
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

