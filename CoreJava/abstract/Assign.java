
abstract public class Assign {
	int a;
	static double d;
	
	Assign()
	{
		System.out.println("constructor of assign class");
	}
	static 
	{
		System.out.println("SIB");
		d=10.2;
	}
	
	{
		System.out.println("IIB");
		this.a=10;
	}
	
	void cMethod()
	{
		System.out.println("concrete method");
	}
	
	abstract void aMethod();
}
