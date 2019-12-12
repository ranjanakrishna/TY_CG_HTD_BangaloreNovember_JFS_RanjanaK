package finalize;

public class Person {
	String name;
	Person(String name)
	{
		this.name=name;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize() called");
	}
	
}
