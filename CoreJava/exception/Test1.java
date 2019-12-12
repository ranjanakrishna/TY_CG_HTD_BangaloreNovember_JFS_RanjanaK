
public class Test1 {
	void write()
	{
		String s1=null;
		//System.out.println("length of string is: " +s1.length());
		try
		{
			System.out.println("length of string is: " +s1.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("dont deal with null");
		}
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Test1 t1=new Test1();
		t1.write();
		System.out.println("main ended");
	}
	
}
