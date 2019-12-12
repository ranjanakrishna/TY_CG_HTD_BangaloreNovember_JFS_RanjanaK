package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try 
		{
			//Load the Driver
//			Driver driver=new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded.....");
			
			//GEt DB connection via Driver
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6?";
			System.out.println("Enter DB username and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			con=DriverManager.getConnection(dburl, user , password);
			System.out.println("Connection established.....");
			
			//Class.forName(com.mysql.jdbc.Driver());
			
			//Issue SQL query via connection
			String query=" delete from user_info"
					+ " where userid=? and password=? ";
			pstmt=con.prepareStatement(query);
			
			System.out.println("Enter userid");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password");
			pstmt.setString(2,sc.nextLine());
			
			
			int res=pstmt.executeUpdate();
			if(res>0)
			{
				System.out.println("User deleted...........");
			}
			else
			{
				System.err.println("Something went wrong");
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Close all JDBC objects
		finally
		{
			try 
			{
				if(con!=null)
				{	
					con.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}	
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		
		
		
		//Process the results obtained by SQL query
		
		
	}
}
