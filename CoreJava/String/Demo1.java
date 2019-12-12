
public class Demo1 {
	public static void main(String[] args) {
		String s1="john";
		System.out.println(s1.hashCode());
		
		String s2="mikel";
		s1="pinky";
		
		String s3="john";
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
	}
}
