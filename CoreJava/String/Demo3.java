
public class Demo3 {
	public static void main(String[] args) {
		String s1="sudhanshu";
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.length());
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 6));
		
		String s2="shreeshree";
		System.out.println(s2.indexOf('h'));
		System.out.println(s2.indexOf("re"));
		System.out.println(s2.indexOf('h', 4));
		System.out.println(s2.indexOf("re", 2));
		
		String s3="        John Mikel           ";
		System.out.println(s3.trim());
	}
}
