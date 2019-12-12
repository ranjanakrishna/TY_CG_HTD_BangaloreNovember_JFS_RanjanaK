package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.jdbc.Statement;

public class EvolvedJDBC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("Enter DB username and password");
		String username=sc.nextLine();
		String password=sc.nextLine();
		String query=" select * from user_info ";
		try (
			Connection con=DriverManager.getConnection(dburl,username,password);
			Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(query))
		{
			while(rs.next())
			{
				System.out.println("UserId : "+rs.getInt(1));
				System.out.println("UserName : "+rs.getString("username"));
				System.out.println("Email : "+rs.getString(3));
				System.out.println("------------------------");
			}
			sc.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
