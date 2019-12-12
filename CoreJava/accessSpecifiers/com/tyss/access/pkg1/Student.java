package com.tyss.access.pkg1;

public class Student {
	protected String name;
	
	protected Student(String sName)
	{
		this.name=sName;
	}
	
	protected void studDetails()
	{
		System.out.println("student name is: "+name);
	}
}
