package com.caps.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class UserLogin {
	public static void main(String[] args) {
		Connection con=null;
		Scanner sc=new Scanner(System.in);
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			
			//Load the driver
			Driver driver=new  com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded");
			
			//establish DB connection via connection
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			
			System.out.println("Enter username and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			//con=DriverManager.getConnection(dburl,"root","root");
			con=DriverManager.getConnection(dburl,dbUser,dbPass);
			System.out.println("connection established....");
			
			
			//Issue SQl query via connection
			String query=" select * from user_info "
					+ " where userid=? AND password=? ";
			pstmt=con.prepareStatement(query);
			
			System.out.println("Enter userId.....");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password.....");
			pstmt.setString(2,sc.nextLine());
			
			rs=pstmt.executeQuery();
			
			System.out.println("query issued and executed...");
			System.out.println("--------------------------------");
			
			//Process the result returned
			if(rs.next())
			{
				System.out.println("userid :"+rs.getString(1));
				System.out.println("username :"+rs.getString(2));
				System.out.println("Email :"+rs.getString(3));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
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
		}
		
	}
}
