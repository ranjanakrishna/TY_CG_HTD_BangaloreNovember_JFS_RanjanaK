
public class Test2 {
	public static void main(String[] args) {
		System.out.println("main started");
		
		int a[]=new int[2];
		a[0]=10;
		a[1]=3;
		try {
			a[2]=4;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("there is no space to store the data");
		}
		
		System.out.println("main ended");
		
	}
}
