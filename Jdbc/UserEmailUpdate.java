package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement pstmt=null;
		try 
		{
				//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded............");
			
			//Get DB Connection via Driver
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("Enter username and password");
			String username=sc.nextLine();
			String password=sc.nextLine();
			con=DriverManager.getConnection(dburl,username,password);
			System.out.println("Connection established.....");
			
			//Issue SQl query via Connection 
			String query=" update user_info set email=? "
					+ " where userid=? and password=? ";
			pstmt=con.prepareStatement(query);
			
			System.out.println("Enter UserId");
			pstmt.setInt(2,Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Password");
			pstmt.setString(3,sc.nextLine());
			System.out.println("Enter email to update...");
			pstmt.setString(1, sc.nextLine());
			
			int res=pstmt.executeUpdate();
			System.out.println("Query has been issued..........");
			
			//Process the results returned by SQL query
			if(res>0)
			{
				System.out.println("Query OK, "+res+ "Rows effected");
			}
			else
			{
				System.err.println("Something went wrong...");
			}
			sc.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(con!=null) {
				con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
