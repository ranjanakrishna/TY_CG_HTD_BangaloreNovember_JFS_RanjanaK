package exceptionPropagation;

public class A {
	static void o() {
		
		
		try {
			B.n();
		}
		catch(ArithmeticException a1) {
			System.out.println("A class: "+a1.getMessage());
			throw a1;
		}
		
	}
}
