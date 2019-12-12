package com.tyss.typecasting.pkg1;

public class Primitive {
	
	//implicit casting
	byte b=2;
	short s=b;
	int i=s;
	float f=i;
	double d=f;
	
	void values()
	{
		System.out.println("byte value is : "+b);
		System.out.println("short value is : "+s);
		System.out.println("int value is : "+i);
		System.out.println("float value is : "+f);
		System.out.println("double value is : "+d);
	}
	
	//explicit casting
	int a=(int)d;
	void details() {
		System.out.println("int value is:" +a);
		System.out.println("double value is:" +d);
	}
}
