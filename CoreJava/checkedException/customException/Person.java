package customException;

public class Person {
	public static void main(String[] args) {
		System.out.println("main started");
		
		Election e1=new Election();
		try {
			e1.vote(17);
		}
		catch (AgeLimitException e) {
			System.out.println(e.getmessage());
		}
				
		System.out.println("main ended");
	}
}