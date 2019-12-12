
public class StringDemo {
	public static void main(String[] args) {
		String s1=new String("john");
		s1=new String("mikel");
		System.out.println(s1.hashCode());
		s1=s1.concat("marsh");
		System.out.println(s1.hashCode());
	}
}
