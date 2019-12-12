package multipleCatch;

public class ExceptionB {
	public static void main(String[] args) {
		
		System.out.println("main started");
		Student s1=new Student();
		
		try {
			Object o1=s1.clone();
			System.out.println("object is cloned");
			Class c1=Class.forName("multipleCatch.Student");
		}
		catch(CloneNotSupportedException c1)
		{
			System.out.println("clone not supported");
		}
		catch(ClassNotFoundException c2)
		{
			System.out.println("class not found");
		}
		System.out.println("main ended");
	}
}
