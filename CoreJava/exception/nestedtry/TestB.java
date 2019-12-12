package nestedtry;


public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");
		ExeptionB e1=new ExeptionB();
		
		e1.exception(0, "ramu");
		e1.exception(2,null);
		System.out.println("main ended");
	}
}
