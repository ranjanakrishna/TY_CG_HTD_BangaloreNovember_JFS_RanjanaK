package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		
		PreparedStatement pstmt=null;
		Connection con=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded.......");
			
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter DB username and password");
			String username=sc.nextLine();
			String password=sc.nextLine();
			con=DriverManager.getConnection(dburl,username,password);
			System.out.println("Connection is established.....");
			
			String query=" insert into user_info values(?,?,?,?) ";
			pstmt=con.prepareStatement(query);
			
			System.out.println("Enter userid");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter username");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter emailId");
			pstmt.setString(3,sc.nextLine());
			System.out.println("Enter password");
			pstmt.setString(4,sc.nextLine());
			
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				System.out.println("Record added....");
			}
			else
			{
				System.err.println("Something went wrong....");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(con!=null)
				{
					con.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
