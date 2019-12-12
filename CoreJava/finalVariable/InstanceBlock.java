
public class InstanceBlock {
	final int Max;
	static final double PI;
	InstanceBlock() 
	{
		System.out.println("constructor is called");
	}
	InstanceBlock(int a)
	{
		System.out.println("constructor is overloaded");
	}
	
	
	{
		System.out.println("instance initialiser block");
		Max=3000;
	}
	
	static 
	{
		System.out.println("static initializer block");
		PI=3.14;
	}
}

