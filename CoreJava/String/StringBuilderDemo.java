
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("john");
		System.out.println(s1.hashCode());
		s1=s1.append("bogar");
		System.out.println(s1.hashCode());
	}
}
