package exceptionPropagation;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
		A.o();
		}
		catch(ArithmeticException a2)
		{
			System.out.println("main class: "+a2.getMessage());
		}
		System.out.println("main ended");
	}
}
